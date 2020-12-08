import tkinter as tk
import tkinter.ttk as ttk

outputfg="white"
outputbg="#17171c"

vartexthl="red"
varlisthl="red"
varlistfg="white"
varlistbg="#17171c"

class Output:
	def __init__(self, parent):
		self.parent=parent
		self.outputarea=tk.Text(self.parent.master, bg=outputbg, fg=outputfg,highlightthickness=1)
		#self.scroller = tk.Scrollbar(self.outputarea, command=self.outputarea.yview, takefocus=0)
		self.outputarea.place(relx=0.7, rely=0.6, relwidth=0.275, relheight=0.3)
		self.outputarea.config(state='disabled')


class Varlist:
	def __init__(self, parent):
		self.parent=parent
		#self.label=tk.Label(self.parent,text="Variables list",bg="#1b1b1c",fg="white")
		self.list = tk.Listbox(parent, selectmode=tk.MULTIPLE, bg=varlistbg, fg=varlistfg, highlightcolor=varlisthl, selectbackground=vartexthl,highlightthickness=1)
		self.list.place(relx=0.7, rely=0.151, relwidth=0.275, relheight=0.3)
		#self.label.place(relx=0.785, rely=0.1, relwidth=0.1, relheight=0.05)