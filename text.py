import tkinter as tk
import tkinter.messagebox as msg

## TextArea class
#
#  The main text area where the user can write the code which needs to be debugged
class TextArea(tk.Text):
    
    ## Constructor
    #
    #  @param parent Tkinter widget to which object has to be parented to
    def __init__(self, master, **kwargs):
        super().__init__(**kwargs)

        self.master = master

        self.tag_configure('find_match', background="yellow")
        self.find_match_index = None
        self.find_search_starting_index = 1.0

        self.bind_events()
    ## Bind events
    #
    #  Binds the generic shortcut keys to their corresponding actions for ease
    def bind_events(self):
        self.bind('<Control-a>', self.select_all)
        self.bind('<Control-c>', self.copy)
        self.bind('<Control-v>', self.paste)
        self.bind('<Control-x>', self.cut)
        self.bind('<Control-y>', self.redo)
        self.bind('<Control-z>', self.undo)

    ## generates cut event
    def cut(self, event=None):
        self.event_generate("<<Cut>>")

    ## generates copy event
    def copy(self, event=None):
        self.event_generate("<<Copy>>")

    ## generates paste event
    def paste(self, event=None):
        self.event_generate("<<Paste>>")

    ## generates undo event
    def undo(self, event=None):
        self.event_generate("<<Undo>>")

        return "break"

    ## generates redo event
    def redo(self, event=None):
        self.event_generate("<<Redo>>")

        return "break"

    ## Adds tag to select all text in the text area
    def select_all(self, event=None):
        self.tag_add("sel", 1.0, tk.END)

        return "break"

    ## Search in code
    #
    # Highlights occurances of given substring in the code one by one. Gives suitable messages when no occurances are found or all occurances have been shown
    # @param text_to_find substring to be searched
    def find(self, text_to_find):
        length = tk.IntVar()
        idx = self.search(text_to_find, self.find_search_starting_index, stopindex=tk.END, count=length)

        if idx:
            self.tag_remove('find_match', 1.0, tk.END)

            end = f'{idx}+{length.get()}c'
            self.tag_add('find_match', idx, end)
            self.see(idx)

            self.find_search_starting_index = end
            self.find_match_index = idx
        else:
            if self.find_match_index != 1.0:
                if msg.askyesno("No more results", "No further matches. Repeat from the beginning?"):
                    self.find_search_starting_index = 1.0
                    self.find_match_index = None
                    return self.find(text_to_find)
            else:
                msg.showinfo("No Matches", "No matching text found")

    ## Replace text
    # 
    # Replaces the substring occurance found in find() with user provided string
    # @params target substring to be replaced
    # @params replacement new string
    def replace_text(self, target, replacement):
        if self.find_match_index:

            end = f"{self.find_match_index}+{len(target)}c"
            self.replace(self.find_match_index, end, replacement)

            self.find_search_starting_index = f"{self.find_match_index} linestart"
            self.find_match_index = None
    
    ## Cancel find
    # 
    # Stops the finding and highlighting process
    def cancel_find(self):
        self.find_search_starting_index = 1.0
        self.find_match_index = None
        self.tag_remove('find_match', 1.0, tk.END)