# Bash-De-Bug
Course Project of CS251, Autumn 2020.

The aim of this project is to build a debugger, primarily intended for Bash Scripts, that prints out the variables and the contents of files that are being used in the program. Although the way this is being built, it wont be hard to extend it to other languages as well.

## Approach
The project is overall divided into two parts - one is the front-end part where we build a Tkinter based GUI for the project, and another is the backend part, where we manage writing a parser for Bash scripts, detecting variable assignments in it, and inserting the print statements in a copy of the script. Then we execute the script from within python, and redirect the output to the user, filtering the line numbers / variable names requested.
