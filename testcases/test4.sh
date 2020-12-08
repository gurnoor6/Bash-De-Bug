#!/bin/bash

function hello_world(){
	echo "this is out MAIN PROJECT!!!!";
}

function sample_func(){

	for ((i=1; i<3; i++));
	do
		echo "$1";
	done

	cd ~/Desktop/sem3
}

function hehe() { cd ~/Desktop/sem3 }

hello_world

sample_func "Input provided"

hehe
# a=2;
# b=100;

# for ((;a<100;a+=23));
# do
#     echo "looping continues"
# done

# if ((a>110)); then
#     echo $(pwd);
# else
#     echo "Better luck next time"
# fi

# a=1+2;