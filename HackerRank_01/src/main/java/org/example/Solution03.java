package org.example;

import java.util.*;

public class Solution03 {
    public static void main(String[] args) {
        int[] input = {5, 3, 8, 3, 1, 5, 7};
        Set<Integer> unique = new TreeSet<>();
        for (int num : input){
            unique.add(num);

        }
        System.out.println(unique);
    }
}
