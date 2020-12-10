import tkinter as tk

linenosfg="white"
linenosbg="#101010"

## Line Numbers

# Contains the line numbers on the left of text area

class LineNo(tk.Canvas):

	## Constructor

	def __init__(self, *args, **kwargs):
		tk.Canvas.__init__(self, *args, **kwargs)
		self.textwidget = None
		self.configure(bg=linenosbg)

	## Attach
	#
	#  @param text_widget Tkinter text widget whose line numbers are needed to be tracked
	def attach(self, text_widget):
		self.textwidget = text_widget

	## Redraw
	#
	#  Checks the line number of the first line being displayed and renders all subsequent line numbers
	def redraw(self, *args):
		self.delete("all")
		i = self.textwidget.index("@0,0")
		while True :
			dline= self.textwidget.dlineinfo(i)
			if dline is None: break
			y = dline[1]
			linenum = str(i).split(".")[0]
			self.create_text(2,y,anchor="nw", text=linenum, fill=linenosfg)
			i = self.textwidget.index("%s+1line" % i)