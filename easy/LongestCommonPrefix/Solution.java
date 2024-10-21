package LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String firstStr = strs[0];

        for (int i = 0; i < firstStr.length(); i++) {
            prefix = prefix.concat(String.valueOf(firstStr.charAt(i)));
            for (String str : strs) {
                if (i == str.length() ||
                    str.charAt(i) != prefix.charAt(i)) {
                    return prefix.substring(0, prefix.length()-1);
                }
            }
        }

        return prefix;
    }
}
