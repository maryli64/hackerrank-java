package main;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxSubstring = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j + 1);
                final int x = j;
               // if (subString.length() > 1 && subString.chars().filter(c -> c == s.charAt(x)).count() > 1) {
                if (subString.length() > 1 && numRepititions(subString, s.charAt(j)) > 1) {
                    break;
                } else {
                    if (subString.length() > maxSubstring) {
                        maxSubstring = subString.length();
                    }
                }
            }
        }
        return maxSubstring;
    }

    private int numRepititions(String str, char c){
        int count=0;
        for(char character : str.toCharArray()){
            if(character==c){
                count++;
            }
        }
        return count;
    }

}
