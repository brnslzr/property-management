package com.mycompany.property_managemen.interviewQuestions.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ClosestNumberToZero {
    public Integer getClosestNumberToZero(int[] numArray) {
        int closest = numArray[0];

        for (int i = 1; i < numArray.length; i++) {
            int current = numArray[i];

            if (Math.abs(current) < Math.abs(closest) ||
                    (Math.abs(current) == Math.abs(closest) && current > closest)) {
                closest = current;
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        ClosestNumberToZero example = new ClosestNumberToZero();
//        [2,-1,1]
        int[] numberArray = {2,-1,1};
        System.out.println(example.getClosestNumberToZero(numberArray));
    }
}
