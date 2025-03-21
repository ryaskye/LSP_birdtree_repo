package org.howard.edu.lsp.midterm.question4;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
    private String sentence; 
    //starter code  from google debugged onchatgpt
    // Constructor to initialize the sentence
    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    // Method to find all longest words in the sentence
    public List<String> findLongestWords() {
        List<String> longestWords = new ArrayList<>();
        
        // Handle edge case: empty or null sentence
        if (sentence == null || sentence.trim().isEmpty()) {
            return longestWords;
        }

        // Split sentence into words, handling multiple spaces
        String[] words = sentence.trim().split("\\s+");

        int maxLength = 0;
        
        // First, determine the length of the longest word(s)
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }

        // Collect all words with the max length
        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        return longestWords;
    }
}
