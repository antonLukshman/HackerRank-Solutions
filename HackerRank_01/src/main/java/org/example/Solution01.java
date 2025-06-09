package org.example;

import java.util.*;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // 1. Sum of lengths
        int sum = A.length() + B.length();
        System.out.println(sum);

        //2.lexicographical comparison
        System.out.println(A.compareTo(B) > 0 ? "Yes":"No");

        //3.Capitalize and print
        String capA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(capA+ " "+ capB);
    }
}