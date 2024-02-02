package com.bridgelabz.Generic;

public class Testmaximum <E extends Comparable<E>> {
    E value1;
    E value2;
    E value3;

    public Testmaximum(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public static void main(String[] args) {

        Testmaximum <Integer> FMInt = new Testmaximum<>(54, 34, 87);
        FMInt.testmax();
        Testmaximum <Float> FMFloat = new Testmaximum<>(3.4f, 5.6f, 1.2f);
        FMFloat.testmax();
        Testmaximum <String> FMString = new Testmaximum<>("Apple", "Guaua", "Banana");
        FMString.testmax();

    }

    public void testmax() {
        E result = findMax();
        System.out.println("max value: " + result);
    }

    private E findMax() {
        E max = value1;
        if (max.compareTo(value2) < 0){
            max = value2;
        }
        if (max.compareTo(value3) < 0) {
            max = value3;
        }
        return max;
    }

    /*private static Float findMaxFloat(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (max.compareTo(num2) < 0){
            max = num2;
        }
        if (max.compareTo(num3) < 0) {
            max = num3;
        }
        return max;
    }*/



}
