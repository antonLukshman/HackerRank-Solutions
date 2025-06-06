package org.example;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        // Create Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases from first line of input
        int t = sc.nextInt();

        // Loop through each test case
        for(int i = 0; i < t; i++)
        {
            try
            {
                // Read the next number to be tested
                long x = sc.nextLong();

                // Print the number and start of output message
                System.out.println(x + " can be fitted in:");

                // Check if number fits in byte (-128 to 127, 8-bit signed)
                if(x >= -128 && x <= 127)
                    System.out.println("* byte");

                // Check if number fits in short (-32,768 to 32,767, 16-bit signed)
                if(x >= -32768 && x <= 32767)
                    System.out.println("* short");

                // Check if number fits in int (-2,147,483,648 to 2,147,483,647, 32-bit signed)
                if(x >= -2147483648 && x <= 2147483647)
                    System.out.println("* int");

                // Check if number fits in long (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, 64-bit signed)
                // Note: L suffix is needed for long literals
                if(x >= -9223372036854775808L && x <= 9223372036854775807L)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                // If sc.nextLong() throws exception, the number is too large even for long
                // Read the problematic input as string and print error message
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        // Close the scanner to free resources
        sc.close();
    }
}