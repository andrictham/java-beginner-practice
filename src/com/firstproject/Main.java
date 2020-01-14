package com.firstproject;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Values of primitive types are stored
        // in separate memory locations
        byte age = 3;
        byte newAge = age; // value of 'age' is copied
        age = 6; // age is modified, but not newAge
        System.out.println(age); // -> age is 6
        System.out.println(newAge); // -> newAge is still 3

        // Values of reference types are stored as a pointer
        // to the original value
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point2.x = 2;
        System.out.println(point1);

        // Strings in Java are immutable
        String message = "Hello World!";

        System.out.println(
                message.replace("!", "*")
        );
        // replace method does not modify the original string,
        // as strings are immutable

        System.out.println(message);

        // Arrays have a fixed length
        // First way to initialize arrays:
        int[] ages = new int[3];
        ages[0] = 18;
        ages[1] = 29;
        // unset indexes will be set to 0
        System.out.println(Arrays.toString(ages));

        // Second way to initialize arrays (much better):
        int[] numbers = { 2, 3, 5, 1, 4 };
        Arrays.sort(numbers);
        System.out.println(
                Arrays.toString(numbers)
        );
            // Arrays are NOT immutable, unlike strings

        // Constants using the `final` keyword
        final float PI = 3.14F;
        // PI = 1; // error, cannot be reassigned

        // Casting number types
        System.out.println(5/2); // will result in 2
        double result = (double)5 / (double)2;
        System.out.println(result); // will result in 2.5
    }
}