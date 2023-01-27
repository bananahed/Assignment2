//  Write a program in java to join two arraylists into one arraylist.

package com.Assignment2;

import java.util.ArrayList;

public class AddTwoLists {
    public static ArrayList<String> AddLists(ArrayList<String> list1, ArrayList<String> list2){
        list1.addAll(list2);
        return list1;
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        list1.add("A");
        list1.add("B");
        list1.add("C");

        list2.add("1");
        list2.add("2");
        list2.add("3");

        System.out.println(list1);
        System.out.println(list2);

        list1 = AddLists(list1,list2);

        System.out.println("After adding second list to first list : " + list1);



    }
}
