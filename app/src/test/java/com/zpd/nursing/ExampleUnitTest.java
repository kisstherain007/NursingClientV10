package com.zpd.nursing;

import com.zpd.nursing.util.HanziToPinyin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testMatch() {
        String inputStr = "";
        boolean result = Pattern.compile("^[A-Za-z]+$").matcher(inputStr).matches();
        System.out.println(result);
    }

}