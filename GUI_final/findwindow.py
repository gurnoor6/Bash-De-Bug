import tkinter as tk
import tkinter.ttk as ttk

fgcolor = "white"
bgcolor = "#1b1b1c"
deepcolor = "#101010"
class FindWindow(tk.Toplevel):
    def __init__(self, master, **kwargs):
        super().__init__(**kwargs)

        self.master = master
        self.configure(bg=bgcolor)
        self.geometry('400x100')
        self.title('Find and Replace')
        self.transient(self.master)

        self.text_to_find = tk.StringVar()
        self.text_to_replace_with = tk.StringVar()

        top_frame = tk.Frame(self,bg=bgcolor)
        middle_frame = tk.Frame(self,bg=bgcolor)
        bottom_frame = tk.Frame(self,bg=bgcolor)

        find_entry_label = tk.Label(top_frame, text="Find: ",bg=bgcolor,fg=fgcolor)
        self.find_entry = tk.Entry(top_frame, textvar=self.text_to_find,background=deepcolor,foreground=fgcolor)

        replace_entry_label = tk.Label(middle_frame, text="Replace: ",bg=bgcolor,fg=fgcolor)
        self.replace_entry = tk.Entry(middle_frame, textvar=self.text_to_replace_with,background=deepcolor,foreground=fgcolor)

        style = ttk.Style()
        style.theme_use('alt')
        style.configure('TButton', background = deepcolor, foreground = 'white')
        style.map('TButton', background=[('active',bgcolor)])

        self.find_button = ttk.Button(bottom_frame, text="Find", command=self.on_find)
        self.replace_button = ttk.Button(bottom_frame, text="Replace", command=self.on_replace)
        self.cancel_button = ttk.Button(bottom_frame, text="Close", command=self.on_cancel)

        find_entry_label.pack(side=tk.LEFT, padx=(20, 0))
        self.find_entry.pack(side=tk.LEFT, fill=tk.X, expand=1)

        replace_entry_label.pack(side=tk.LEFT)
        self.replace_entry.pack(side=tk.LEFT, fill=tk.X, expand=1)

        self.find_button.pack(side=tk.LEFT, padx=(85, 0))
        self.replace_button.pack(side=tk.LEFT, padx=(20, 20))
        self.cancel_button.pack(side=tk.RIGHT, padx=(0, 30))

        top_frame.pack(side=tk.TOP, expand=1, fill=tk.X, padx=30)
        middle_frame.pack(side=tk.TOP, expand=1, fill=tk.X, padx=30)
        bottom_frame.pack(side=tk.TOP, expand=1, fill=tk.X)

        self.find_entry.focus_force()

        self.protocol("WM_DELETE_WINDOW", self.on_cancel)

    def on_find(self):
        self.master.find(self.text_to_find.get())

    def on_replace(self):
        self.master.replace_text(self.text_to_find.get(), self.text_to_replace_with.get())

    def on_cancel(self):
        self.master.cancel_find()
        self.destroy()
