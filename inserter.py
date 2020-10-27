import os
import sys
import subprocess
from main import get_vars

def inserter(filename,data):
	data = sorted(data,key = lambda tup: tup[0], reverse= True)
	with open(filename) as fh:
		content = fh.readlines()

	for line_no, var in data:
		if "for" in content[line_no-1]:
			line_no+=1
		content.insert(line_no,f'echo  at line no = {line_no},{var}=${var}\n')
	
	with open(f"temp_{filename}","w") as fh:
		fh.writelines(content)

def execute(cmd):
	out = subprocess.run(['sh']+cmd,capture_output=True)
	output = out.stdout.decode()
	return output



if __name__=='__main__':
	# a list of tuples that has the line number and the 
	# name of the variable to be printed
	#  line number is the one after which the  echo has to be inserted
	# data = [(13,'ans'),(7,'i')]
	data = get_vars('input.sh')
	print(data)
	inserter('input.sh',data)
	execute(["./temp_input.sh","10"])