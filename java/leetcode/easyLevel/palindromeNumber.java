package easyLevel;
import java.util.Arrays;

class Solution {
    public boolean isPalindrome(int x) {
        char [] chars = String.valueOf(x).toCharArray();
        char[] palindrome = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            palindrome[i] = chars[chars.length - 1 - i]; 
        }
       return Arrays.equals(chars, palindrome);
    }
}