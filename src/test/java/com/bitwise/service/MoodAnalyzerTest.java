package com.bitwise.service;

import com.bitwise.exception.MoodAnalysisException;
import org.junit.Assert;
import org.testng.annotations.Test;


public class MoodAnalyzerTest {

    MoodAnalyzer moodanalyzer = new MoodAnalyzer();

    // Test case to check sad mood
    @Test
    public void givenMessage_WhenSadShould_ReturnSad() throws MoodAnalysisException {

        MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Sad Mood");
        try {
            String actualResult = moodanalyzer.analyseMood();
            System.out.println(actualResult);
            Assert.assertEquals("Sad", actualResult);
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }

    // Test case to check happy mood
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {

        MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Happy Mood");
        try {
            String actualResult = moodanalyzer.analyseMood();
            System.out.println(actualResult);
            Assert.assertEquals("Happy", actualResult);
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }

    // Test case to check empty mood
    @Test
    public void givenMessage_WhenEmpty_ThrowsException() {

        MoodAnalyzer moodanalyzer = new MoodAnalyzer();
        try {
            String actualResult = moodanalyzer.analyseMood();
            System.out.println(actualResult);
            Assert.assertEquals("Happy", actualResult);
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }
}
