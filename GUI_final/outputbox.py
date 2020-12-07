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
		self.label=tk.Label(self.parent,text="Search:",bg="#1b1b1c",fg="white")
		self.entry=tk.Entry(self.parent,bg=outputbg,fg=outputfg)
		style = ttk.Style()
		style.theme_use('alt')
		style.configure('TButton', background = outputbg, foreground = 'white')
		style.map('TButton', background=[('active',varlisthl)])
		self.button=ttk.Button(self.parent,text="Go")
		self.outputarea=tk.Text(self.parent.master, bg=outputbg, fg=outputfg)
		#self.scroller = tk.Scrollbar(self.outputarea, command=self.outputarea.yview, takefocus=0)
		self.label.place(relx=0.7, rely=0.05, relwidth=0.05, relheight=0.05)
		self.entry.place(relx=0.75, rely=0.05, relwidth=0.1, relheight=0.05)
		self.button.place(relx=0.86, rely=0.05, relwidth=0.025, relheight=0.05)
		self.outputarea.place(relx=0.7, rely=0.1, relwidth=0.25, relheight=0.4)
		self.outputarea.config(state='disabled')
		
		def find():
			self.outputarea.tag_remove('found','1.0',tk.END)

			s = self.entry.get()
			if s:
				idx='1.0'
				while 1:
					idx=self.outputarea.search(s,idx,nocase=1,stopindex=tk.END)
					if not idx: break
					
					lastidx='%s+%dc' % (idx,len(s))
					self.outputarea.tag_add('found',idx,lastidx)
					idx=lastidx
				self.outputarea.tag_config('found',foreground=vartexthl)
			self.entry.focus_set()

		self.button.config(command=find)

class Varlist:
	def __init__(self, parent):
		self.parent=parent
		self.list = tk.Listbox(parent, selectmode=tk.MULTIPLE, bg=varlistbg, fg=varlistfg, highlightcolor=varlisthl, selectbackground=vartexthl)
		self.list.place(relx=0.75, rely=0.6, relwidth=0.2, relheight=0.3)