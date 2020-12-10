import tkinter as tk
import time
import yaml

## Syntax Highlighting

## Highlights certain keywords in bash, strings and numbers in distinguishable colours. This is done on each key release event.
class Highlighter:

    ## Constructor to initiate the variables
    # @param text_widget The text widget in tkinter for which the syntax highlighting is to be done
    # @param syntax_file The yaml file that provides the keywords and their corresponding highlighting colours
    def __init__(self, text_widget, syntax_file):
        self.text_widget = text_widget
        self.syntax_file = syntax_file
        self.categories = None
        self.numbers_color = "blue"

        self.disallowed_previous_chars = ["_", "-", "."]

        self.parse_syntax_file()

        self.text_widget.bind('<KeyRelease>', self.on_key_release)

    ## Starts highlighting text on key release event
    def on_key_release(self, event=None):

        self.highlight()

    ## Parsing the bash.yaml file for the given set of keywords to highlight in bash
    def parse_syntax_file(self):
        with open(self.syntax_file, 'r') as stream:
            try:
                config = yaml.load(stream)
            except yaml.YAMLError as error:
                print(error)
                return

        self.categories = config['categories']
        self.numbers_color = config['numbers']['color']
        self.strings_color = config['strings']['color']

        self.configure_tags()

    ## Assigning colors to the tags  

    def configure_tags(self):
        for category in self.categories.keys():
            color = self.categories[category]['color']
            self.text_widget.tag_configure(category, foreground=color)

        self.text_widget.tag_configure("number", foreground=self.numbers_color)
        self.text_widget.tag_configure("string", foreground=self.strings_color)


    ## Main algorithm for highlighting
    #
    #  Highlights the keywords by parsing the entire code on each key release.

    def highlight(self, event=None):
        #print("called")
        for cat in self.categories:
            self.text_widget.tag_remove(cat, "1.0", 'end')
        #     text.tag_delete(tag)
        # self.configure_tags()
        #self.text_widget.config(fg="white")
        #print("called")
        length = tk.IntVar()
        for category in self.categories:
            matches = self.categories[category]['matches']
            for keyword in matches:
                start = 1.0
                keyword = keyword + "[^A-Za-z_-]"
                idx = self.text_widget.search(keyword, start, stopindex=tk.END, count=length, regexp=1)
                while idx:
                    char_match_found = int(str(idx).split('.')[1])
                    line_match_found = int(str(idx).split('.')[0])
                    if char_match_found > 0:
                        previous_char_index = str(line_match_found) + '.' + str(char_match_found - 1)
                        previous_char = self.text_widget.get(previous_char_index, previous_char_index + "+1c")

                        if previous_char.isalnum() or previous_char in self.disallowed_previous_chars:
                            end = f"{idx}+{length.get() - 1}c"
                            start = end
                            idx = self.text_widget.search(keyword, start, stopindex=tk.END, regexp=1)
                        else:
                            end = f"{idx}+{length.get() - 1}c"
                            self.text_widget.tag_add(category, idx, end)

                            start = end
                            idx = self.text_widget.search(keyword, start, stopindex=tk.END, regexp=1)
                    else:
                        end = f"{idx}+{length.get() - 1}c"
                        self.text_widget.tag_add(category, idx, end)

                        start = end
                        idx = self.text_widget.search(keyword, start, stopindex=tk.END, regexp=1)

        self.highlight_regex(r"(\d)+[.]?(\d)*", "number")
        self.highlight_regex(r"[\'][^\']*[\']", "string")
        self.highlight_regex(r"[\"][^\']*[\"]", "string")

    ## Regex Highlighting
    #  Highlights the provided regex with its respective tag 
    # @param regex The regex format which needs to be tagged
    # @param tag Helps identify which tag the corresponding regex belongs to
    def highlight_regex(self, regex, tag):
        length = tk.IntVar()
        start = 1.0
        idx = self.text_widget.search(regex, start, stopindex=tk.END, regexp=1, count=length)
        while idx:
            end = f"{idx}+{length.get()}c"
            self.text_widget.tag_add(tag, idx, end)

            start = end
            idx = self.text_widget.search(regex, start, stopindex=tk.END, regexp=1, count=length)

