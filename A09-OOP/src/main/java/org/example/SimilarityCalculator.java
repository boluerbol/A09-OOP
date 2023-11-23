package org.example;

import java.util.HashSet;
import java.util.Set;

public class SimilarityCalculator {
    public double calculateSimilarity(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(set1.size() + " " + set2.size());

        return (double) intersection.size() / union.size();
    }
}
