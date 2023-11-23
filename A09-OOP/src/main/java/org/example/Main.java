package org.example;

import java.io.IOException;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            WordProcessor wordProcessor = new WordProcessor();

            SimilarityCalculator similarityCalculator = new SimilarityCalculator();

            // Read text from two different files
            wordProcessor.readFile("src/main/resources/file1.txt");
            Set<String> set1 = wordProcessor.getDistinctWords();
            //System.out.println(set1);

            wordProcessor.readFile("src/main/resources/file2.txt");
            Set<String> set2 = wordProcessor.getDistinctWords();
            System.out.println(set2);

            // Calculate and display the Jaccard similarity coefficient
            double similarity = similarityCalculator.calculateSimilarity(set1, set2);
            System.out.println("Jaccard Similarity Coefficient: " + similarity);

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}