import tkinter as tk
from tkinter import filedialog


class LineNo(tk.Canvas):
    def __init__(self, *args, **kwargs):
        tk.Canvas.__init__(self, *args, **kwargs)
        self.textwidget = None

    def attach(self, text_widget):
        self.textwidget = text_widget

    def redraw(self, *args):
        '''redraw line numbers'''
        self.delete("all")

        i = self.textwidget.index("@0,0")
        while True :
            dline= self.textwidget.dlineinfo(i)
            if dline is None: break
            y = dline[1]
            linenum = str(i).split(".")[0]
            self.create_text(2,y,anchor="nw", text=linenum)
            i = self.textwidget.index("%s+1line" % i)
class Output:
	def __init__(self, parent):
		self.parent=parent
		self.outputarea=tk.Text(self.parent.master)
		#self.scroller = tk.Scrollbar(self.outputarea, command=self.outputarea.yview, takefocus=0)
		self.outputarea.place(relx=0.7, rely=0.1, relwidth=0.25, relheight=0.4)
		self.outputarea.config(state='disabled')

class Varlist:
	def __init__(self, parent):
		self.parent=parent
		self.list = tk.Listbox(parent, selectmode=tk.MULTIPLE)
		self.list.place(relx=0.75, rely=0.6, relwidth=0.2, relheight=0.3)

class Startend:
	def __init__(self, parent):
		self.parent=parent
		label1 = tk.Label(self.parent.master, text="Enter Starting Point")
		label2 = tk.Label(self.parent.master, text="Enter Ending Point")
		self.startfield = tk.Entry(self.parent.master, relief='ridge')
		self.endfield = tk.Entry(self.parent.master, relief='ridge')
		label1.grid(row=1, column=1)
		label2.grid(row=2, column=1)

		self.startfield.grid(row=1, column=2)
		self.endfield.grid(row=2, column=2)

class Menubar:

	def __init__(self, parent):
		font_specs = ("Roboto", 12)
		menubar1 = tk.Menu(parent.master, font=font_specs)
		parent.master.config(menu=menubar1)
		file_dd = tk.Menu(menubar1, font=font_specs, tearoff=0)
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
		label = tk.Label(parent.master, textvariable=self.value, fg="black", bg="gray", anchor='sw')
		label.place(relx=0, rely=0.97,relwidth=1)
	
	def updatestat(self, *args):
		if isinstance(args[0], bool):
			self.value.set("Saved")
		else:
			self.value.set("Unsaved Changes")

class Pytext:

	def __init__(self, master):
		master.title("Untitled1 - Pytext")
		master.geometry("1200x600")

		font_specs = ("ubuntu", 18)

		self.master=master
		self.runbutton = tk.Button(self.master, command=self.run, text="run")
		self.flname = None
		# self.linebuttons=[]
		self.menubar = Menubar(self)
		self.statbar = StatusBar(self)
		self.linesnos = LineNo(self.master)
		self.startend = Startend(self)
		self.textarea = tk.Text(master, font=font_specs, wrap="none")
		self.scrolly = tk.Scrollbar(master, command=self.textarea.yview, takefocus=0)
		self.scrollx = tk.Scrollbar(master, command=self.textarea.xview, orient='horizontal')
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

	def open_file(self, *args):
		self.flname = filedialog.askopenfilename(defaultextension=".txt", filetypes=[("All files", "*.*"),("Python", "*.py")])
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
		self.textarea.bind('<KeyRelease>', self.linesnos.redraw)
		self.master.bind_all("<MouseWheel>", self._on_mousewheel)
	
	def _on_mousewheel(self, event):
		self.linesnos.redraw()
	
	def setoutput(self, output):
		self.outputarea.outputarea.config(state='normal')
		self.outputarea.outputarea.delete(1.0, tk.END)
		self.outputarea.outputarea.insert(1.0, output)
		self.outputarea.outputarea.config(state='disabled')

	def setvariables(self, vlist):
		for var in vlist:
			self.varlist.list.insert(0, var)

	def run(self):
		pass
		# s = "blah blah blah"
		# self.setoutput(s)
		# llist=[]
		# for i in range(1, 100):
		# 	llist.append(str(i))
		# self.setvariables(llist)
	

if __name__ == '__main__':
	master = tk.Tk()
	pt = Pytext(master)

	master.mainloop()
