package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scanner= new Scanner(System.in);
        Double x1=scanner.nextDouble();
        Double x2=scanner.nextDouble();
        Double y1=scanner.nextDouble();
        Double y2=scanner.nextDouble();
        Double length=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("length="+length);
    }
}
