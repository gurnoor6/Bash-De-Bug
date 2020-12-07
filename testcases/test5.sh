#!/bin/bash
out="filename"
cat $out

a=123;

if ((a>0 && a<10)); then

    a=3;
    for (( ; a>0 ; a-- ));
    do
        echo '$a'
    done

elif ((a>=10 && a<20)); then
    if ((a%2==0)); then
        echo "EVEN"
    else
        ((a++))
    fi

else
    echo "$a"
fi

b="CS 251: Software System Labs"
c="DEBUGGER by team Bash-De-Bug"

d="$b\n$c";

sed 's/hello/world/' input.txt > output.txt;

sed -e 's/hello/world/' input.txt > output.txt

sed --expression='s/hello/world/' input.txt > output.txt;


echo "$d"
