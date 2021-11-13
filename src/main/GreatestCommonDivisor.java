package main;

public class GreatestCommonDivisor {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            return str1;
        }

        String greatestCommonDivisorStr = "";

        for (int i = 0; i < str1.length(); i++) {
           // for (int j = i + 1; j <= str1.length(); j++) {
                String substring = str1.substring(0, i+1);
                if (substring.length() > greatestCommonDivisorStr.length() && isDivisble(str1, substring) && isDivisble(str2, substring)) {
                    greatestCommonDivisorStr = substring;
                }
            //}
        }

        return greatestCommonDivisorStr;
    }

    private boolean isDivisble(String string, String subString) {
        return string.split(subString).length == 0;
    }
}