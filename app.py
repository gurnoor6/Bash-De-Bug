import os
import tkinter as tk
import tkinter.ttk as ttk
from tkinter import filedialog
from utils.inserter import inserter,execute
from findwindow import FindWindow
from utils.main import get_vars
from highlighter import Highlighter 
from text import TextArea 
from lineNos import LineNo
from outputbox import Output, Varlist
from barcomps import Menubar, StatusBar
from utils.distance import distance

mainbgcol="#1B1B1C"

scrollhl="#2F2F2F"
scrollbg="#101010"

buttonbg="#101010"
buttonfg="white"
buttonhl="red"
deepcolor="#2F2F2F"
textbg="#101010"
textfg="white"
outputbg="#17171C"
vartexthl="red"
insert_data = []
var = []
commands = []
files = []
output_data = ""
current_show = ""

class Pytext:

	def __init__(self, master):
		master.title("Untitled1 - Pytext")
		master.geometry("1200x600")

		font_specs = ("ubuntu", 12)

		self.master=master
		style = ttk.Style()
		style.theme_use('alt')
		style.configure('TButton', background = buttonbg, foreground = 'white')
		style.map('TButton', background=[('active',deepcolor)])
		self.runbutton = ttk.Button(self.master, command=self.run, text="Run!")
		self.flname = None
		# self.linebuttons=[]
		self.menubar = Menubar(self)
		self.statbar = StatusBar(self)

		self.linesnos = LineNo(self.master)
		#self.startend = Startend(self)
		#self.textarea = tk.Text()
		self.textarea = TextArea(self.master, bg=textbg, fg=textfg, insertbackground="white", undo=True)
		self.highlighter = Highlighter(self.textarea, 'languages/bash.yaml')
		self.scrolly = tk.Scrollbar(master, command=self.scroll, takefocus=0, bg=scrollbg, activebackground=scrollhl)
		#self.scrollx = tk.Scrollbar(master, command=self.textarea.xview, orient='horizontal', bg=scrollbg, activebackground=scrollhl)
		self.textarea.configure(yscrollcommand=self.scrolly.set)

		self.label=tk.Label(self.master,text="Search:",bg="#1b1b1c",fg=textfg)
		self.entry=tk.Entry(self.master,bg=outputbg,fg=textfg,highlightthickness=.5)
		self.button=ttk.Button(self.master,text="Go")
		self.startbtn=ttk.Button(self.master,text="Start")
		
		self.varbtn=ttk.Button(self.master,text="Variables", command = self.showVariables)
		self.filebtn=ttk.Button(self.master,text="Files", command = self.showFiles)
		self.cmdbtn=ttk.Button(self.master,text="Commands", command = self.showCommands)

		self.errarea=tk.Text(self.master,bg=textbg,fg=vartexthl,insertbackground="white",undo=True,highlightthickness=0.5)

		self.outputarea = Output(self.master)
		self.varlist= Varlist(self.master)
		#self.linesnos.textline.configure(yscrollcommand=self.scrolly.set)
		#self.textarea.configure(xscrollcommand=self.scrollx.set)	
		self.textarea.place(relx=0.03, rely= 0.1, relwidth=0.65, relheight=0.8)
		self.scrolly.place(relx=0.68, rely= 0.1, relwidth=0.01, relheight=0.8)
		#self.scrollx.place(relx=0.03, rely=0.9, relwidth=0.65, relheight=0.02)
		self.linesnos.attach(self.textarea)
		self.linesnos.place(relx=0, rely=0.1, relwidth=0.02, relheight=0.8)
		self.bind_shortcuts()
		self.runbutton.place(relx=0.5, rely=0.025)
		
		self.errarea.place(relx=0.03,rely=0.9,relwidth=0.5,relheight=0.05)
		self.errarea.config(state='disabled')

		self.label.place(relx=0.73, rely=0.55, relwidth=0.05, relheight=0.05)
		self.entry.place(relx=0.78, rely=0.55, relwidth=0.1, relheight=0.05)
		self.button.place(relx=0.9, rely=0.55, relwidth=0.025, relheight=0.05)
		self.startbtn.place(relx=0.81, rely=0.475, relwidth=0.05, relheight=0.05)

		self.varbtn.place(relx=0.7, rely=0.1, relwidth=0.07, relheight=0.05)
		self.filebtn.place(relx=0.8, rely=0.1, relwidth=0.07, relheight=0.05)
		self.cmdbtn.place(relx=0.9, rely=0.1, relwidth=0.07, relheight=0.05)

		self.startbtn.config(command=self.start)
		self.button.config(command=self.find)

	def set_window_title(self, name="Untitled1"):
		self.master.title(name + " - Pytext")
	
	def new_file(self, *args):
		master = tk.Tk()
		Pytext(master)
		master.mainloop()

	def scroll(self, *args):
		self.textarea.yview(*args)
		self.linesnos.redraw()
	def open_file(self, *args):
		self.flname = filedialog.askopenfilename(defaultextension=".txt", filetypes=[("All files", "*.*")])
		if self.flname:
			self.textarea.delete(1.0, tk.END)
			with open(self.flname, "r")as f:
				self.textarea.insert(1.0, f.read())
			self.set_window_title(self.flname)
			self.statbar.updatestat(True)
			
	def save_file(self, *args):
		if self.flname:
			with open(self.flname, "w") as f:
				f.write(self.textarea.get(1.0, tk.END))
				self.statbar.updatestat(True)
		else:
			self.save_as()
		
	

	def save_as(self, *args):
		try:
			new_file = filedialog.asksaveasfilename(initialfile="Untitled1.txt", defaultextension=".txt", filetypes=[("All files", "*.*"),("Python", "*.py")])
			text_content = self.textarea.get(1.0, tk.END)
			with open(new_file, "w") as f:
				f.write(text_content)
				self.statbar.updatestat(True)
			self.flname = new_file
			self.set_window_title(self.flname)
		except Exception as e:
			print(e)


	
	def bind_shortcuts(self):
		self.textarea.bind('<Control-n>', self.new_file)
		self.textarea.bind('<Control-o>', self.open_file)
		self.textarea.bind('<Control-s>', self.save_file)
		self.textarea.bind('<Control-S>', self.save_as)
		self.textarea.bind('<Key>', self.statbar.updatestat)
		self.textarea.bind('<KeyRelease>', self.key_release)
		self.textarea.bind('<ButtonRelease-4>', self.linesnos.redraw)
		self.textarea.bind('<ButtonRelease-5>', self.linesnos.redraw)
		self.textarea.bind('<Control-f>', self.show_find_window)


	def key_release(self, *args):
		self.linesnos.redraw()
		self.highlighter.highlight()

	def setoutput(self, output):
		self.outputarea.outputarea.config(state='normal')
		self.outputarea.outputarea.delete(1.0, tk.END)
		self.outputarea.outputarea.insert(1.0, output)
		self.outputarea.outputarea.config(state='disabled')
		
	def show_find_window(self, event=None):
		FindWindow(self.textarea)

	def setvariables(self, vlist, called_functions=None, all_var=None):
		self.varlist.list.delete(0,'end')
		for var in vlist:
			self.varlist.list.insert(0, var)

		if called_functions!=None:
			for var in all_var:
				if var[0] in called_functions:
					self.varlist.list.insert(0,f"{var[1]} {var[2]}")


	def run(self):
		global var,insert_data,commands, files 
		# selected_text_list = [self.varlist.list.get(i) for i in self.varlist.list.curselection()]

		content = self.textarea.get("1.0","end")
		with open('input.sh','w') as fh:
			fh.writelines(content)

		var,insert_data,commands,files,error_free = get_vars("input.sh")
		if error_free==False:
			print("some error occured")
			return
		self.showVariables()
		

	def find(self):
		global output_data
		search = self.entry.get()
		if search=="":
			self.setoutput(output_data)
			return

		match_data = output_data.decode("utf-8").split("\n")
		new_data = []
		for i in range(len(match_data)):
			d = distance(match_data[i],search)
			if d!=0:
				new_data.append((match_data[i],d))
		new_data = sorted(new_data, reverse=True, key = lambda x: x[1])
		new_data = '\n'.join([i[0] for i in new_data])
		self.setoutput(new_data)


	def start(self):
		if current_show == "commands" or current_show=="files":
			return
		global output_data
		selected_varlist = [self.varlist.list.get(i) for i in self.varlist.list.curselection()]

		temp = []
		# print(selected_varlist)
		for item in selected_varlist:
			temp.append(item.split(" ")[1])

		selected_insert_data = []
		for item in  insert_data:
			if str(item[0][0]) in temp:
				selected_insert_data.append(item)
		inserter("input.sh",selected_insert_data)
		output_data = execute(["./temp_input.sh"])
		self.setoutput(output_data)

	def showFiles(self):
		global current_show,files 
		current_show = "files"
		self.setvariables(files)

	def showCommands(self):
		global current_show,commands
		current_show = "commands"
		self.setvariables(commands)

	def showVariables(self):
		global current_show, var
		current_show = "variables"
		vars_list=[]
		var = sorted(var, reverse=True, key = lambda x: x[1])
		called_functions = []
		for i in var:
			if i[0]=='main':
				num = 20
				vars_list.append(f"{i[1]} {i[2]}")
			if i[1].split(" ")[0] == "function":
				called_functions.append(i[1].split(" ")[1])
		self.setvariables(vars_list,called_functions,var)

	

if __name__ == '__main__':
	master = tk.Tk()
	master.configure(background=mainbgcol)
	pt = Pytext(master)
	master.mainloop()

