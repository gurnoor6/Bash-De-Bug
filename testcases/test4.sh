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