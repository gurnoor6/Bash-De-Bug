#!/bin/bash
num=$1
map=(C XC L XL X IX V IV I)
revmap=(100 90 50 40 10 9 5 4 1)
ans=""
for((i=0;i<${#map[@]};i++))	
do
	while [ $num -ge ${revmap[$i]} ]
	do
		# Both of these ways work
		# ((num=num-$revmap[$i]))
		((num=num-revmap[$i]))
		ans=$ans${map[$i]}
	done
done
echo $ans