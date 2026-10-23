package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[]  testScores = {72, 75, 77, 80, 82, 83, 86, 88, 90, 91};

        double max = 0;
        double min = 100;
        double sum = 0;
        double median;
        double median1;
        double median2;

        for (int score : testScores) {
            sum += score;
            if (score > max){
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        double average = sum / testScores.length;

        Arrays.sort(testScores);
        System.out.println(Arrays.toString(testScores));

        if ((testScores.length % 2) == 0){
            median1 = testScores[(testScores.length / 2) - 1];
            median2 = testScores[testScores.length / 2];
            median = (median1 + median2) / 2;
        } else {
            median = testScores[(testScores.length / 2)];
        }

        System.out.println("The average is: " + average);
        System.out.println("The median is: " + median);
        System.out.println("The high score is: " + max);
        System.out.println("The low score is: " + min);
    }
}