# Bash-De-Bug
Course Project of CS251, Autumn 2020.

The aim of this project is to build a debugger, primarily intended for Bash Scripts, that prints out the variables and the contents of files that are being used in the program. Although the way this is being built, it wont be hard to extend it to other languages as well.

## Approach
The project is overall divided into two parts - one is the front-end part where we build a Tkinter based GUI for the project, and another is the backend part, where we manage writing a parser for Bash scripts, detecting variable assignments in it, and inserting the print statements in a copy of the script. Then we execute the script from within python, and redirect the output to the user, filtering the line numbers / variable names requested.

Initially, we planned to just do a string search for the file, detect `=` signs for assignment operations, check for a few more conditions and conclude that the variable is detected. But this approach did not seem elegant or challenging, it seemed just like a workaround. So we decided to go with parsing.

### GUI


### Parsing
* The first thing we looked for parsing was a library named [bashlex](https://github.com/idank/bashlex). But this had a lot of issues and did not turn out well.
* So we resorted to making a custom parser and lexer using [ANTLR4](https://github.com/antlr/antlr4).
* The first step was to create a grammar file, which contained the parser and lexer rules.
* The lexer tokenises the whole input file. The rules for tokens are defined uisng regular expressions, in the grammar file. Also, extreme care had to be taken in the order of tokens, the ones defined first are given higher preference. Moreover, the lexer tries to generate the least number of tokens possible.
* The parser rules use the tokens generated above, to recognise the various structures such as for/while loops, if/else statements and assignment operations.
* After writing rules in grammar, we generate the parser in Python. It basically gives us a tree structure of the whole program, by doing a depth first search in it. There are various entry and exit functions available, which we use to gain relevant information.

## What It CAN do
* We type a bash script, or choose a file from our PC and the program detects all the variables in the script and displays them on the GUI.
* The user is asked to select the variables, and/or the line numbers between which he wants to view the variables.
* The required output is shown on the output box, and we have a substring matching feature through which the user can even search for the required variable and line number.
* It can go through for/while loops, and assignment operations. It can also handle basic bash commands like `wget`, `ls`, `cat`, `cut`, etc. 

## What it CANNOT do
* It cannot check for the correctness of the syntax. The bash syntax is quite diverse and writing a rule for each of them with proper arguments and flags would get quite difficult.
* It assumes that the syntax is correct, and hence helps to fix the **logical errors**.

## Phase 2 plans
* Most of the time in phase 1 was spent in deciding the approach to be used, and we finally settled on ANTLR :)
* The basic framework for the GUI is ready, but some extra features and overall polishing is yet to be done.
* The basic parsing is done. We are able to parse **for/while loops, assignment operations, linux commands, nested loops, nested if-else statements** but still we have to work with **sed** scripts and **function calls**. Although we are hopeful that we'll be able to do them using ANTLR as well, but just in case any problems arise, we might resort to string search, but that is worst case scenario.

## Example
For the following input,

    #!bin/bash

    a=2;
    b=100;

    for ((;a<b;a+=23));
    do
        echo "looping continues"
    done

    if ((a>110)); then
        echo $(pwd)
    else
        echo "Better luck next time"
    fi

the parse tree that we get is <br> <img src="testcases/test4.png" height=300 width=1000> <br>

