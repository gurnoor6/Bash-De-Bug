#!/bin/bash

function hello_world(){
	echo "CS251 is the best!!!!";
}

function function_1(){

	for ((i=1; i<3; i++));
	do
		echo "$1";
	done

	cd ~/Desktop/sem3
}

function function_2() { cd ~/Desktop/sem3; }

hello_world;

function_1 "Input provided";

function_2
