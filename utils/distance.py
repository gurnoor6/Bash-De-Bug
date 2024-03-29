from math import floor, ceil 
from fuzzywuzzy import fuzz

## Function to calculate the Jaro similarity score between 2 strings.
## This function is used in app.Pytext.find to get filtered rank based results
def jdistance(s1, s2): 
	s1 = s1.lower()
	s2 = s2.lower()
	# If the s are equal 
	if (s1 == s2): 
		return 1.0
  
	# Length of two s 
	len1 = len(s1) 
	len2 = len(s2) 
  
	# Maximum distance upto which matching 
	# is allowed 
	max_dist = floor(max(len1, len2) / 2) - 1
  
	# Count of matches 
	match = 0
  
	# Hash for matches 
	hash_s1 = [0] * len(s1) 
	hash_s2 = [0] * len(s2) 
  
	# Traverse through the first 
	for i in range(len1): 
  
		# Check if there is any matches 
		for j in range(max(0, i - max_dist),  
					   min(len2, i + max_dist + 1)): 
			  
			# If there is a match 
			if (s1[i] == s2[j] and hash_s2[j] == 0): 
				hash_s1[i] = 1
				hash_s2[j] = 1
				match += 1
				break
  
	# If there is no match 
	if (match == 0): 
		return 0.0
  
	# Number of transpositions 
	t = 0
	point = 0
  
	# Count number of occurances 
	# where two characters match but 
	# there is a third matched character 
	# in between the indices 
	for i in range(len1): 
		if (hash_s1[i]): 
  
			# Find the next matched character 
			# in second 
			while (hash_s2[point] == 0): 
				point += 1
  
			if (s1[i] != s2[point]): 
				point += 1
				t += 1
	t = t//2
  
	# Return the Jaro Similarity 
	return (match/ len1 + match / len2 + 
			(match - t + 1) / match)/ 3.0

def distance(s, t, ratio_calc = True):
	s,t = s.lower(), t.lower()
	return fuzz.ratio(s,t)

if __name__=='__main__':
	# Driver code 
	s1 = "hello"
	s2 = ""
	  
	# Prjaro Similarity of two s 
	print(round(jdistance(s1, s2),6))
	print(distance(s1,s2)) 