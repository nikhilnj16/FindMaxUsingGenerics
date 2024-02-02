package com.bridgelabz.Generic;

import java.util.*;

public class Testmaximum <E extends Comparable<E>> {
    private List<E> values;

    public Testmaximum(E... values) {
        this.values = Arrays.asList(values);
    }

    public static void main(String[] args) {

        Testmaximum <Integer> FMInt = new Testmaximum<>(54, 34, 87, 45, 56);
        FMInt.testmax();
        Testmaximum <Float> FMFloat = new Testmaximum<>(3.4f, 5.6f, 1.2f, 3.5f);
        FMFloat.testmax();
        Testmaximum <String> FMString = new Testmaximum<>("Apple", "Guaua", "Banana");
        FMString.testmax();

    }

    public void testmax() {

        Optional<E> result = findMax();
        if (result.isPresent()) {
            System.out.println("max value: " + result.get());
        }
        else {
            System.out.println("NO VALUES PROVIDED.");
        }
    }

    private Optional<E> findMax() {
        if (values.isEmpty()){
            return Optional.empty();
        }
        Collections.sort(values);
        return Optional.of(values.get(values.size() - 1));
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
