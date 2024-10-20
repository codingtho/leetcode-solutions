package Palindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int index = str.length()-1;

        for (int i = 0; i < index; i++) {
            if (str.charAt(i) != str.charAt(index--)) {
                return false;
            }
        }

        return true;
    }
}
