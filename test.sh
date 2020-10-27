# !bin/bash
a="asd";
# This is a comment
# This too

# does not cover a=$(ls); type cases

a="asd";
b=a+i
c=$bgbg d=df
a=2;

c=$a+$b;
((a+=2))

echo $a
for((i=0;i>=10;i++))
do  
    ((i-=4));
    b=$((b-=100));
done

echo $b