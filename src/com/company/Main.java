package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scanner = new Scanner(System.in);
        Double x1 = scanner.nextDouble();
        Double x2 = scanner.nextDouble();
        Double y1 = scanner.nextDouble();
        Double y2 = scanner.nextDouble();
        Double length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("length=" + length);
        String isEqual = "not equal";
        if (x1.equals(y1) && x2.equals(y2)) {
            isEqual = "equal";
        } else {
            if (Double.compare(x1, y1) > 0) {
                isEqual = "Line 1 is greater then Line 2";
            } else {
                if (Double.compare(x1, y1) < 0) {
                    isEqual = "Line 2 is greater then Line 1";
                } else {
                    if (Double.compare(x2, y2) > 0) {
                        isEqual = "Line 1 is greater then Line 2";
                    } else {
                        isEqual = "Line 2 is greater than Line 1";
                    }
                }
            }
        }
        System.out.println(isEqual);

    }
}
