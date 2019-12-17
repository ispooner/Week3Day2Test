package com.company;

public class PalindromeStrings {

    public boolean checkPalindrome(String string) {
        while(string.length() > 1) {
            if(string.charAt(0) == string.charAt(string.length() - 1) ) {
                string = string.substring(1, string.length() - 1);
            }
            else {
                return false;
            }
        }
        return true;
    }

}
