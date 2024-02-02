package com.bridgelabz.Generic;

public class Testmaximum {
    public static void main(String[] args) {

        //testcase1
        Integer result1 = findMaxInt(11, 7, 6);
        System.out.println("TC 1: " + "Max number at 1st position " + result1);

        //testcase2
        Integer result2 = findMaxInt(23, 45, 32);
        System.out.println("TC 2: " + "Max number at 2nd position " + result2);
        
        //testcase3
        Integer result3 = findMaxInt(43, 14, 89);
        System.out.println("TC 3: " + "Max number at 3rd position " + result3);

        //testcase1
        Float result4 = findMaxFloat(2.3f, 4.5f, 3.4f);
        System.out.println("TC 1: " + "Max number at 1st position " + result4);

        //testcase2
        Float result5 = findMaxFloat(23f, 45f, 32f);
        System.out.println("TC 2: " + "Max number at 2nd position " + result5);

        //testcase3
        Float result6 = findMaxFloat(43f, 14f, 89f);
        System.out.println("TC 3: " + "Max number at 3rd position " + result6);
    }

    private static Integer findMaxInt(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (max.compareTo(num2) < 0){
            max = num2;
        }
        if (max.compareTo(num3) < 0) {
            max = num3;
        }
        return max;
    }

    private static Float findMaxFloat(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (max.compareTo(num2) < 0){
            max = num2;
        }
        if (max.compareTo(num3) < 0) {
            max = num3;
        }
        return max;
    }



}
