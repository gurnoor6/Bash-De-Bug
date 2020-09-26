# Features
## Detect all the variables and list it to the user. 
Detection of variables can be primarily be done by detecting the `=` sign. However, it will be significantly more complex for arrays/maps. 
In for/while loops, or in if else, we need to determine what is the conditional variable. 
In case of loops, we'll have to provide an option to view the result at nth iteration or just print the results of all the iterations and let the user have a "search" option to go to the specified conditions (like i=5 or whatever)
In case of if else, we need to check where is our code stepping and let the user know accordingly; also print the variables that have to be printed inside the if/else.

## Breakpoints 
Let the user choose till where he wants the code to run, and display the output accordingly. 
Two possible approaches - run the code once in the background, store the results and filter them to show to the user. Alternatively, make a copy of the script till the point where the user wants to view the program and then execute that script. But here we'll have to do error checking and stuff to make sure user does not select the block in middle of loop before its completion etc etc. 

## GUI
Go through the script once, detect all the variables and show it to the user. Let him choose them from here, or let him add a custom variable if in case it is not detected and the line number. 
Have options to choose a code segment
Have a code editor
Have an output text area, where the user can have features like substring etc. We can also make a table for this. 
