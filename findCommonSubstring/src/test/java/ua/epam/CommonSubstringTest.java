package ua.epam;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommonSubstringTest {

    @Test
    public void testFindCommonSubstringOk() {
        String str1 = "abcdefghklm";
        String str2 = "wwwwwwghklll";
        String result = "ghkl";

        assertEquals(CommonSubstring.findCommonSubString(str1, str2), result);

        String str21 = "acer";
        String str22 = "place";
        String result2 = "ace";

        assertEquals(CommonSubstring.findCommonSubString(str21, str22), result2);
    }

    @Test
    public void testFindCommonSubstringFail() {
        String str1 = "abcdefghklm";
        String str2 = "wwwwwwqqqqqq";

        assertEquals(CommonSubstring.findCommonSubString(str1, str2), "");

        String str3 = "acer";

        assertEquals(CommonSubstring.findCommonSubString(str3, null), "");
    }
}
