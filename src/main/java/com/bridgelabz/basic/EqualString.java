package com.bridgelabz.basic;

import java.util.Scanner;

public class EqualString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = scanner.nextLine();
        System.out.println("Enter second string");
        String s2 = scanner.nextLine();
        System.out.println(s1.equals(s2));
    }
}
