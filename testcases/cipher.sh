#!/bin/bash

# aserting the input command line arguments to be 1 only
if [ "$#" -ne 1 ]; then
    echo "Usage: ./cipher.sh <url>"
    exit 1
fi

# downloading the encrypted file from the input URL in quite mode
wget -q --tries=100 "$1" -O encrypted.txt

# initializations for future use
ahead=0
alpha=({a..z})
Alpha=({A..Z})

# checking how many shifts are required to get one of the 3 options in the last
# two lines, variable i sores that
for i in {0..25}
do  
    # now we shift each of the alphabet by i units, two different sets for
    # upper and lower case letters
    set2a=""
    set2A=""
    for j in {0..25}
    do  
        idx=$(( (i+j)%26 ))
        set2a="$set2a${alpha[$idx]}"
        set2A="$set2A${Alpha[$idx]}"  
    done
    # now we have i shifted letters in set2a and set2A
    
    # we get last 2 lines of the encrypted text from tail command then passing
    # it through tr command which converts characters a-z, A-Z to set2a and
    # set2A respectively, and storing the output in array lines
    lines=($(tail --lines=2 encrypted.txt | tr a-zA-Z "$set2a$set2A"))

    # now using egrep to find the one or more of the given three words (case
    # insensitive as -i tag is used), and if the number of output characters
    # are not equal to zero then we have found the required shifts and we break
    # out  
    cnt=$(echo ${lines[@]} | egrep -iw "majesty|queen" | wc -c)
    
    if (( cnt!=0 )); then
        ahead=$i
        break
    fi
done  

# decrypting the whole text with the same shifted sets
cat encrypted.txt | tr a-zA-Z "$set2a$set2A" > decrypted.txt

# now for encryting we will have ti either go variable ahead times behind or
# (26-ahead) times ahead, latter has been implemented to encode the given
# string
set2a=""
set2A=""

for j in {0..25}
do  
    idx=$(( (26-$ahead+$j)%26 ))

    set2a="$set2a${alpha[$idx]}"
    set2A="$set2A${Alpha[$idx]}"
done

string="PS. Give me the names."
echo $string | tr a-zA-Z "$set2a$set2A" >> encrypted.txt

exit 0
