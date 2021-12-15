package com.example.wordcountapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test

    public void Test01GetCharCount() {
        String inputString = "asd";
        int expectedValue = 3;
        int actualValue = TextCounter.getCharCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test02GetCharCount() {
        String inputString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getCharCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test03GetCharCount() {
        String inputString = null;
        int expectedValue = -1;
        int actualValue = TextCounter.getCharCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test04GetCharCount() {
        String inputString = "123-+%&^*()$#!.,/][|;:";
        int expectedValue = 22;
        int actualValue = TextCounter.getCharCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test05GetCharCount() {
        String inputString = "asdasfasfsdfsdfasdfaasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfaasdasfasfsdfsdfasdfaasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdsdfasdfasdfasfdasdasfasfsdfsdfasdfaasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdsdfasdfasdfasfdasdasfasfsdfsdfasdfaasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdsdfasdfasdfasfdsfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdsdfasdfasdfasfd";
        int expectedValue = 2800;
        int actualValue = TextCounter.getCharCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test01GetWordCount() {
        String inputString = "asd";
        int expectedValue = 1;
        int actualValue = TextCounter.getWordCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test02GetWordCount() {
        String inputString = "    asd";
        int expectedValue = 1;
        int actualValue = TextCounter.getWordCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test03GetWordCount() {
        String inputString = "  1564  &^*$#@()-+|][";
        int expectedValue = 2;
        int actualValue = TextCounter.getWordCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test04GetWordCount() {
        String inputString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getWordCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test(expected = NullPointerException.class)

    public void Test05GetWordCount() {
        String inputString = null;
        int expectedValue = -1;
        int actualValue = TextCounter.getWordCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test06GetWordCount() {
        String inputString = "asdasfasfsdfsdfasdfaasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfaasdasfasfsdfsdfasdfaasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdsdfasdfasdfasfdasdasfasfsdfsdfasdfaasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdsdfasdfasdfasfdasdasfasfsdfsdfasdfaasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdsdfasdfasdfasfdsfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdasdasfasfsdfsdfasdfasdfasdfasdfasfdsdfasdfasdfasfd      asd";
        int expectedValue = 2;
        int actualValue = TextCounter.getWordCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
    @Test

    public void Test07GetWordCount() {
        String inputString = "              ";
        int expectedValue = 0;
        int actualValue = TextCounter.getWordCount(inputString);

        assertEquals(expectedValue,actualValue);
    }
}