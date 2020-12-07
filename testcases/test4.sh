#!/bin/bash

function hello_world(){
	echo "I fucked up";
}

function suffer(){

	for ((i=1; i<3; i++));
	do
		echo "$1";
	done

	cd ~/Desktop/sem3
}

function hehe() { cd ~/Desktop/sem3 }

hello_world

suffer "suffer BITCH!"

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