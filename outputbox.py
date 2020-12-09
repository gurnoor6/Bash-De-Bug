import tkinter as tk
import tkinter.ttk as ttk

outputfg="white"
outputbg="#17171c"

vartexthl="red"
varlisthl="red"
varlistfg="white"
varlistbg="#17171c"

## Output class
# Displays the output of the debugger

class Output:
	## Constructor
	# @param parent Tkinter widget to which object has to be parented to
	def __init__(self, parent):
		self.parent=parent
		self.outputarea=tk.Text(self.parent.master, bg=outputbg, fg=outputfg,highlightthickness=1)
		self.outputarea.place(relx=0.7, rely=0.6, relwidth=0.275, relheight=0.3)
		self.outputarea.config(state='disabled')

#Varlist class
# Is a listbox which displays all the variables and their line numbers

class Varlist:
	## Constructor
	# @param parent Tkinter widget to which object has to be parented to
	def __init__(self, parent):
		self.parent=parent
		self.list = tk.Listbox(parent, selectmode=tk.MULTIPLE, bg=varlistbg, fg=varlistfg, highlightcolor=varlisthl, selectbackground=vartexthl,highlightthickness=1)
		self.list.place(relx=0.7, rely=0.151, relwidth=0.275, relheight=0.3)