import tkinter as tk

linenosfg="white"
linenosbg="black"

class LineNo(tk.Canvas):
	def __init__(self, *args, **kwargs):
		tk.Canvas.__init__(self, *args, **kwargs)
		self.textwidget = None
		self.configure(bg=linenosbg)

	def attach(self, text_widget):
		self.textwidget = text_widget
		#self.textwidget.configure(foreground="white")
	def redraw(self, *args):
		'''redraw line numbers'''
		#print("redraw")
		self.delete("all")
		i = self.textwidget.index("@0,0")
		while True :
			dline= self.textwidget.dlineinfo(i)
			if dline is None: break
			y = dline[1]
			linenum = str(i).split(".")[0]
			self.create_text(2,y,anchor="nw", text=linenum, fill=linenosfg)
			i = self.textwidget.index("%s+1line" % i)