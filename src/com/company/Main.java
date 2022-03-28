package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//              Task - 1            //

        Integer[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(isContainDuplicate(array));
//              Task - 2            //

        Integer[] array1 = {1,2,3,4,5,6,6,7,7,8,9};
        System.out.println(onlyUnics(array1));
//              Task - 3            //
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String : ");
        String str = scanner.next();
        printCountOfDuplications(str);

    }

    private static void printCountOfDuplications(String str) {
        int size = str.length();
        int count = 0;
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < size; i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), true);
                continue;
            }
            map.put(str.charAt(i), false);
        }
        for (Map.Entry<Character, Boolean> entry : map.entrySet()){
            if (entry.getValue().equals(true)) {
                count++;
            }
        }
        System.out.println("Count of duplications is equal to : " + count);
    }

    private static <Integer> Set<Integer> onlyUnics(Integer[] array1) {
        Set<Integer> numbers = new HashSet<>();
        for (Integer integer : array1){
            if (!numbers.add(integer)){
                numbers.remove(integer);
            }
        }
        return numbers;
    }

    private static <Integer> String isContainDuplicate(Integer[] array) {
        Set<Integer> num = new HashSet<>();
        for (Integer i : array){
            if (!num.add(i)){
                return "Array is contains duplicates.";
            }
        }
        return "Array is not contains duplicates.";
    }
}
