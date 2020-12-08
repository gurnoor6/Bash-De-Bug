import os
import sys
import subprocess
from .main import get_vars

def inserter(filename,data):

	print(len(data))
	data = sorted(data, key = lambda tup: (tup[0][0], tup[0][1]), reverse= True)
	with open(filename) as fh:
		content = fh.readlines()

	for (line_no, col), text in data:
		if col != -1 : 
			content[line_no-1] = content[line_no-1][0:col] + text + content[line_no-1][col:]
		else : 
			if "for" in content[line_no-1]:
				line_no+=1
			content.insert(line_no, text)
	
	with open(f"temp_{filename}","w") as fh:
		fh.truncate(0)
		fh.writelines(content)

def execute(cmd):
	process = subprocess.Popen(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE,shell=True)
	stdout, stderr = process.communicate()
	print(stdout)
	return stdout



if __name__=='__main__':
	# a list of tuples that has the line number and the 
	# name of the variable to be printed
	# line number is the one after which the echo has to be inserted
	# data = [(13,'ans'),(7,'i')]
	data = get_vars('input.sh')
	print(data)
	inserter('input.sh',data)
	execute(["./temp_input.sh","10"])