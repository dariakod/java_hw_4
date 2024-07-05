package com.telran.org.lessonsix;

public class Homework {

        public static void main(String[] args) {

            double m = 8.45;
            double n = 8.50;


            if ((n - 10) < (m - 10)) {
                System.out.println("The number " + m + " is closer to 10");
            } else if ((m - 10) < (n - 10)) {
                System.out.println("The number " + n + " is closer to 10");
            } else {
                System.out.println("Both numbers are the same distance from 10");
            }
        }
    }
