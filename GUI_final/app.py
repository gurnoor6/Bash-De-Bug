import tkinter as tk
from tkinter import filedialog
#from inserter import inserter,execute
from findwindow import FindWindow
#from main import get_vars
from highlighter import Highlighter 
from text import TextArea 
from lineNos import LineNo
from outputbox import Output, Varlist
from inputbox import Startend
from barcomps import Menubar, StatusBar


mainbgcol="green"

scrollhl="red"
scrollbg="orange"

buttonbg="orange"
buttonfg="white"
buttonhl="red"

textbg="black"
textfg="white"


class Pytext:

	def __init__(self, master):
		master.title("Untitled1 - Pytext")
		master.geometry("1200x600")

		font_specs = ("ubuntu", 12)

		self.master=master
		self.runbutton = tk.Button(self.master, command=self.run, text="run", bg=buttonbg, fg=buttonfg, highlightcolor=buttonhl)
		self.flname = None
		# self.linebuttons=[]
		self.menubar = Menubar(self)
		self.statbar = StatusBar(self)

		self.linesnos = LineNo(self.master)
		self.startend = Startend(self)
		#self.textarea = tk.Text()
		self.textarea = TextArea(self.master, bg=textbg, fg=textfg, undo=True)
		self.highlighter = Highlighter(self.textarea, 'languages/bash.yaml')
		self.scrolly = tk.Scrollbar(master, command=self.scroll, takefocus=0, bg=scrollbg, activebackground=scrollhl)
		self.scrollx = tk.Scrollbar(master, command=self.textarea.xview, orient='horizontal', bg=scrollbg, activebackground=scrollhl)
		self.textarea.configure(yscrollcommand=self.scrolly.set)
		self.outputarea = Output(self.master)
		self.varlist= Varlist(self.master)
		#self.linesnos.textline.configure(yscrollcommand=self.scrolly.set)
		self.textarea.configure(xscrollcommand=self.scrollx.set)
		self.textarea.place(relx=0.03, rely= 0.1, relwidth=0.65, relheight=0.8)
		self.scrolly.place(relx=0.68, rely= 0.1, relwidth=0.01, relheight=0.8)
		self.scrollx.place(relx=0.03, rely=0.9, relwidth=0.65, relheight=0.02)
		self.linesnos.attach(self.textarea)
		self.linesnos.place(relx=0, rely=0.1, relwidth=0.02, relheight=0.8)
		self.bind_shortcuts()
		self.runbutton.place(relx=0.5, rely=0)

	
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

	def setvariables(self, vlist):
		for var in vlist:
			self.varlist.list.insert(0, var)

	def run(self):
		# pass
		content = self.textarea.get("1.0","end")
		with open('input.sh','w') as fh:
			fh.writelines(content)

		out = get_vars("input.sh")
		inserter("input.sh",out)
		llist=[]
		for i in out:
			llist.append(f"{i[0],i[1]}")
		self.setvariables(llist)
		s = execute(["./temp_input.sh"])
		self.setoutput(s)
	

if __name__ == '__main__':
	master = tk.Tk()
	master.configure(background=mainbgcol)
	pt = Pytext(master)
	master.mainloop()

