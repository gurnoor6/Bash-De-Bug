import tkinter as tk
from tkinter import filedialog



statusbarfg="white"
statusbarbg="#181f26"

menubarhl="#31577d"
menutexthl="white"
menubarbg="#181f26"
menubarfg="white"

## Menubar Class

# Contains the file menu which contains open, save and save as options
class Menubar:
	## Constructor
	# @param parent Tkinter widget to which object has to be parented to
	def __init__(self, parent):
		font_specs = ("Roboto", 12)
		menubar1 = tk.Menu(parent.master, font=font_specs, background=menubarbg, fg=menubarfg, activeforeground=menutexthl, activebackground=menubarhl)
		parent.master.config(menu=menubar1)
		file_dd = tk.Menu(menubar1, font=font_specs, fg=menubarfg, bg=menubarbg, activeforeground=menutexthl, activebackground=menubarhl, tearoff=0)
		file_dd.add_command(label="Open File", command=parent.open_file, accelerator="ctrl + O")
		file_dd.add_command(label="Save File", command=parent.save_file, accelerator="ctrl + S")
		file_dd.add_command(label="Save As", command=parent.save_as, accelerator="ctrl + Shift + S")
		file_dd.add_separator()
		file_dd.add_command(label="Exit", command=parent.master.destroy)

		menubar1.add_cascade(menu=file_dd, label="File")

## SatusBar Class

# Displays the current status, whether the changes made to the the file have been saved or not
class StatusBar:

	## Constructor
	# @param parent Tkinter widget to which object has to be parented to
	def __init__(self, parent):
		self.value = tk.StringVar()
		self.value.set("Untitled1")
		label = tk.Label(parent.master, textvariable=self.value, fg=statusbarfg, bg=statusbarbg, anchor='sw')
		label.place(relx=0, rely=0.97,relwidth=1)
	
	## Update status
	# Checks the current status and displays it on the status bar
	def updatestat(self, *args):
		if isinstance(args[0], bool):
			self.value.set("Saved")
		else:
			self.value.set("Unsaved Changes")