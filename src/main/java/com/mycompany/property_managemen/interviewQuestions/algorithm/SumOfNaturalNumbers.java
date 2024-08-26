package com.mycompany.property_managemen.interviewQuestions.algorithm;

import java.util.Random;

public class SumOfNaturalNumbers {
    public Integer getSum(Integer num){
        Integer sum = 0;
        while(num != 0){
            sum = Math.abs(sum + num);
            num--;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfNaturalNumbers example = new SumOfNaturalNumbers();
        Random random = new Random();
        int randomInt = random.nextInt(11);
        System.out.println(example.getSum(randomInt));
        System.out.println(System.currentTimeMillis());
    }
}
