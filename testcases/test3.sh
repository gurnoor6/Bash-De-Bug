# !bin/bash

a=$(ls)

b=10;

for((i=0,j=10;i<=10 && j>=0;i++,j-=2))
do
	((b=b-j));
done

echo $b;