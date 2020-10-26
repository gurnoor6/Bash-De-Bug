import os
import sys
import subprocess


def inserter(filename,data):
	data = sorted(data,key = lambda tup: tup[0], reverse= True)
	with open(filename) as fh:
		content = fh.readlines()

	for line_no, var in data:
		content.insert(line_no,f'echo \\({line_no+1},{var}=${var}\\)\n')
	
	with open(f"temp_{filename}","w") as fh:
		fh.writelines(content)

def execute(cmd):
	out = subprocess.run(['sh']+cmd,capture_output=True)
	output = out.stdout.decode()
	print(output)



if __name__=='__main__':
	# a list of tuples that has the line number and the 
	# name of the variable to be printed
	#  line number is the one after which the  echo has to be inserted
	data = [(13,'ans'),(7,'i')]
	inserter('test.sh',data)
	execute(["./temp_test.sh","10"])