import tkinter as tk

labelfg="white"
inputfg="white"

labelbg="#25323d"
inputbg="#010521"

class Startend:
	def __init__(self, parent):
		self.parent=parent
		label1 = tk.Label(self.parent.master, text="Enter Starting Point", bg=labelbg, fg=labelfg)
		label2 = tk.Label(self.parent.master, text="Enter Ending Point", bg=labelbg, fg=labelfg)
		self.startfield = tk.Entry(self.parent.master, relief='ridge', bg=inputbg, fg=inputfg)
		self.endfield = tk.Entry(self.parent.master, relief='ridge', bg=inputbg, fg=inputfg)
		label1.grid(row=1, column=1)
		label2.grid(row=2, column=1)

		self.startfield.grid(row=1, column=2)
		self.endfield.grid(row=2, column=2)