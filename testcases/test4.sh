#!/bin/bash

function hello_world(){
	echo "this is our MAIN PROJECT!!!!";
}

function sample_func(){

	for ((i=1; i<3; i++));
	do
		echo "$1";
	done

	cd ~/Desktop/sem3
}

function hehe() { cd ~/Desktop/sem3; }

hello_world;

sample_func "Input provided";

hehe
