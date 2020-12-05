import tkinter as tk
from tkinter import filedialog

statusbarfg="white"
statusbarbg="blue"

menubarhl="red"
menutexthl="red"
menubarbg="blue"
menubarfg="white"

class Menubar:

	def __init__(self, parent):
		font_specs = ("Roboto", 12)
		menubar1 = tk.Menu(parent.master, font=font_specs, background=menubarbg, fg=menubarfg, activeforeground=menutexthl, activebackground=menubarhl)
		parent.master.config(menu=menubar1)
		file_dd = tk.Menu(menubar1, font=font_specs, fg=menubarfg, bg=menubarbg, activeforeground=menutexthl, activebackground=menubarhl, tearoff=0)
		file_dd.add_command(label="New File", command=parent.new_file, accelerator="ctrl + N")
		file_dd.add_command(label="Open File", command=parent.open_file, accelerator="ctrl + O")
		file_dd.add_command(label="Save File", command=parent.save_file, accelerator="ctrl + S")
		file_dd.add_command(label="Save As", command=parent.save_as, accelerator="ctrl + Shift + S")
		file_dd.add_separator()
		file_dd.add_command(label="Exit", command=parent.master.destroy)

		menubar1.add_cascade(menu=file_dd, label="File")

class StatusBar:

	def __init__(self, parent):
		self.value = tk.StringVar()
		self.value.set("Untitled1")
		label = tk.Label(parent.master, textvariable=self.value, fg=statusbarfg, bg=statusbarbg, anchor='sw')
		label.place(relx=0, rely=0.97,relwidth=1)
	
	def updatestat(self, *args):
		if isinstance(args[0], bool):
			self.value.set("Saved")
		else:
			self.value.set("Unsaved Changes")