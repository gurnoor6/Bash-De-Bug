import tkinter as tk


outputfg="white"
outputbg="#001936"

vartexthl="red"
varlisthl="red"
varlistfg="white"
varlistbg="#001936"

class Output:
	def __init__(self, parent):
		self.parent=parent
		self.outputarea=tk.Text(self.parent.master, bg=outputbg, fg=outputfg)
		#self.scroller = tk.Scrollbar(self.outputarea, command=self.outputarea.yview, takefocus=0)
		self.outputarea.place(relx=0.7, rely=0.1, relwidth=0.25, relheight=0.4)
		self.outputarea.config(state='disabled')

class Varlist:
	def __init__(self, parent):
		self.parent=parent
		self.list = tk.Listbox(parent, selectmode=tk.MULTIPLE, bg=varlistbg, fg=varlistfg, highlightcolor=varlisthl, selectbackground=vartexthl)
		self.list.place(relx=0.75, rely=0.6, relwidth=0.2, relheight=0.3)