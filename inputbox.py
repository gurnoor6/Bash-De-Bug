import tkinter as tk

labelfg="white"
inputfg="white"

labelbg="#1b1b1c"
inputbg="#17171c"

class Startend:
	def __init__(self, parent):
		self.parent=parent
		label1 = tk.Label(self.parent.master, text="Enter Starting Point", bg=labelbg, fg=labelfg)
		label2 = tk.Label(self.parent.master, text="Enter Ending Point", bg=labelbg, fg=labelfg)
		self.startfield = tk.Entry(self.parent.master, relief='ridge', bg=inputbg, fg=inputfg,highlightthickness=0.5)
		self.endfield = tk.Entry(self.parent.master, relief='ridge', bg=inputbg, fg=inputfg,highlightthickness=0.5)
		label1.place(relx=0, rely=0, relwidth=0.1, relheight=0.05)
		label2.place(relx=0, rely=0.04, relwidth=0.1, relheight=0.05)

		self.startfield.place(relx=0.11, rely=0, relwidth=0.1, relheight=0.04)
		self.endfield.place(relx=0.11, rely=0.05, relwidth=0.1, relheight=0.04)