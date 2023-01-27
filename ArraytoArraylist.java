//"Write a Java program that takes an integer array as input and converts it into an ArrayList. The program should have a method called convertArrayToList that takes in the array as a parameter and returns the converted ArrayList.
//
//The input for the program is an array {1, 2, 3, 4, 5}
//
//The output of the program should be the ArrayList
//
// [1, 2, 3, 4, 5] after the conversion."

package com.Assignment2;
import java.util.*;

public class ArraytoArraylist {

    public static List<Integer> convertArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> newList = convertArrayToList(arr);
        System.out.println(newList + " after the conversion.");
    }
}

