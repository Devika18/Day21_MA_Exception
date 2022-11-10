package com.bitwise.service;

import com.bitwise.exception.MoodAnalysisException;

public class MoodAnalyzer {
    public static String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) throws MoodAnalysisException {
        this.message = message;
        analyseMood();
    }

    public static String analyseMood() throws MoodAnalysisException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Entered Invalid mood");
        }
    }
}
