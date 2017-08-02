package com.example.gallusawa.firstdattest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by gallusawa on 8/1/17.
 */

public class CodingTest {

    public static void main(String[] args) {
        //Problem one
        //if number divisible by 3 then print "Fizz"
        //if number is divisible by 5 print out "Buzz"
        //if by both print out "FizzBuzz"
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        buzzFuzz(numbers);
        //Problem 2
        //Print out the duplicate strings in a arraylist of strings
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");

        printDuplicate(stringArrayList);
    }


    public static void buzzFuzz(int[] myArray){
        for(int i=0; i < myArray.length; i++){
            if(myArray[i] % 3 == 0) {
                System.out.println("Fuzz");
            } else if (myArray[i] % 5 == 0){
                System.out.println("Buzz");
            } else if (myArray[i] % 3 == 0 && myArray[i] % 5 == 0){
                System.out.println("FuzzBuzz");
            }
        }
    }


    private static void printDuplicate(ArrayList<String> myArr){

        Set<String> one = new HashSet<String>();
        for(int i=0; i < myArr.size(); i++){
            if (!one.add(myArr.get(i))){
                System.out.println(myArr.get(i));
            }
        }
        /*
        for (int i = 0; i < myArr.size(); i++){
            for(int j = 0; j < myArr.size(); j++){
                if (j ! = i) {
                     if (myArr.get(i) == myArr.get(j) {
                          one.add(myArr.get(i);
                          }
                       }
                   }
               }
           Iterator<String> itr = one.iterator();
                   while(itr.hasNext(){
                       System.out.println(itr.next());
                   }

         */
        Map<String, Integer> dupes = new HashMap<>();
        for(int i =0; i<myArr.size(); i++) {
            if (!dupes.containsKey(myArr.get(i))) {
                dupes.put(myArr.get(i), 1);

            } else {
                dupes.put(myArr.get(i), dupes.get(myArr.get(i)) + 1);
            }
        }

            for(String key: dupes.keySet()){
                if(dupes.get(key) > 1)
                    System.out.println(key);
            }

        }
    }





