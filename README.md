# Week3Day2Test

The research document is inluded at the top level as "Week 3 Day 2 Test Research Questions.txt"

This was a simple test of our coding abilities. We had three problems:
  1. Create a function to find and print out the duplicate strings from a list. 
  2. Create a function to check if a string is a palindrome without using the String.reverse method.
  3. Create a function to print fizz if a number is divisible by 3 and buzz if a number is divisible by 5.
  
And now for the details of how I did them. 
  1. I created an O(n) function that counts all the strings in one pass and adds a count for each string encountered to a hastable. Then the key set from the hashtable is iterated over and if the associated count is greater than 1 the key is printed. This is optimal since you have to read each string individually to see if it's included. 
  2. I created a while loop that loops until the length of the string is 1. In the body of the loop I check to see if the first and last characters are the same, then remove those characters. Once the string is either 1 character or 0 characters long I return true since the condition has been met. If at any time the first and last characters are different, false is returned.
  3. The input number is checked for divisibility using the modulo operator. If divisible by 3, print "fizz", if divisible by 5 print "buzz", then print "\n" for every number. 
