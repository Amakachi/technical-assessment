package com.example.technicalassessment.algorithmtest;

import java.util.Arrays;

public class AlgorithmTest {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
       for(int n : rotateArray(3, arr)) System.out.println(n);

    }

    // Given an array of integers, circularly rotate the elements of the array, by a given integer of n.
    static int[] rotateArray(int n, int[] array){
        int j = n;
        int k = 0;


        while(j < array.length){
        int prevIndex = array[j];
        array[j] = array[k];
        array[k] = prevIndex;
        k++;
        j++;
    }
            while (n < array.length - 1){
                int lastIndex = n + 1;
                int prevIndex = array[n - 1];
                array[n - 1] = array[lastIndex];
                array[n + 1] = prevIndex;
                n++;


    }


        return array;
    }
}
