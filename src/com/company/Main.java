package com.company;

import java.util.ArrayList;
 /*
        1. Create a function to print the duplicates in a list of strings
        public void findDuplicates(List<String> strings){};

        2. Create function to check if the string is a palindrome without using string.reverse() method
        public boolean checkPalindrome(String word){};

        3. Create a function that will print:
        "fizz" is the number is divisible by 3
        "buzz" is the number is divisible by 5
        "fizzbuzz" is the number is divisible by both
*/
public class Main {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Glory");
        strings.add("Safe");
        strings.add("Worry");
        strings.add("Safe");
        strings.add("Worry");
        strings.add("Worry");
        DuplicateStrings ds = new DuplicateStrings();
        ds.findDuplicateStrings(strings);

        PalindromeStrings ps = new PalindromeStrings();
        System.out.println("abba: " + ps.checkPalindrome("abba"));
        System.out.println("abaa: " + ps.checkPalindrome("abaa"));
        System.out.println("abab: " + ps.checkPalindrome("abab"));
        System.out.println("racecar: " + ps.checkPalindrome("racecar"));

        FizzBuzz fb = new FizzBuzz();
        for(int i = 0; i <= 100; i++) {
            System.out.print(i + ": ");
            fb.fizzbuzz(i);
        }

    }
}
