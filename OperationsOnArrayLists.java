//Write a program in java make an arraylist and do certain operations
//
//1. reverse the arraylist
//2. sort the arraylist.
//3. remove elements of arraylist.

package com.Assignment2;

import java.util.*;

public class OperationsOnArrayLists {

    public static ArrayList<String> reverseList(ArrayList<String> list){
        Collections.reverse(list);

        return list;
    }
    public static ArrayList<String> sortList(ArrayList<String> list){
        Collections.sort(list);

        return list;
    }
    public static ArrayList<String> removeFromList(ArrayList<String> list){
        list.clear();

        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("Joy");

        System.out.println("The list is : " + list);
        System.out.println("The sorted list is : " + sortList(list));
        System.out.println("The reversed list is : " + reverseList(list));
        System.out.println("After removing the elements from the list : " + removeFromList(list));
    }

}
