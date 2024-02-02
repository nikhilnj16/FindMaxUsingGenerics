package com.bridgelabz.Generic;

public class Testmaximum {
    public static void main(String[] args) {

        //testcase1
        Integer result1 = findMax(11, 7, 6);
        System.out.println("TC 1: " + "Max number at 1st position " + result1);

        //testcase2
        Integer result2 = findMax(23, 45, 32);
        System.out.println("TC 2: " + "Max number at 2nd position " + result2);
        
        //testcase3
        Integer result3 = findMax(43, 14, 89);
        System.out.println("TC 3: " + "Max number at 3rd position " + result3);
    }

    private static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (max.compareTo(num2) < 0){
            max = num2;
        }
        if (max.compareTo(num3) < 0) {
            max = num3;
        }
        return max;

    }


}
