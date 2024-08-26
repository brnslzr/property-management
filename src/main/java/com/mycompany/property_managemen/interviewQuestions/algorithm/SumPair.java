package com.mycompany.property_managemen.interviewQuestions.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SumPair {
    public static List<int[]> findPairsWithSum(int[] array, int target) {
        List<int[]> result = new ArrayList<>();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                result.add(new int[]{array[left], array[right]});
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        List<int[]> pairs = findPairsWithSum(array, target);

        System.out.println("Pairs with sum " + target + ":");
        for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }
}
