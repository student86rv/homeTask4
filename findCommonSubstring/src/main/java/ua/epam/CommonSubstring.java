package ua.epam;

public class CommonSubstring {

    public static String findCommonSubString(String str1, String str2) {
        String result = "";
        int resultLength = 0;

        if (str1 == null || str2 == null) {
            return result;
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i; j < str1.length(); j++) {
                String subString = str1.substring(i, j);
                if (str2.contains(subString) && subString.length() > resultLength) {
                    resultLength = subString.length();
                    result = subString;
                }
            }
        }
        return result;
    }
}
