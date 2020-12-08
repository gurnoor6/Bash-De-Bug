# !bin/bash

a=$(ls)

b=10;

for((i=0,j=10;i<=10 && j>=0;i++,j-=2))
do
	((b=b-j));
done

sed 's/hello/world/' input.txt > output.txt;

sed -e 's/hello/world/' input.txt > output.txt

sed --expression='s/hello/world/' input.txt > output.txt;

cat encrypted.txt | tr a-zA-Z "$set2a$set2A" > decrypted.txt

echo $b;