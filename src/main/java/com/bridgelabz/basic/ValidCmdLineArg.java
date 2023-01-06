package com.bridgelabz.basic;

class ValidCmdLineArg {
    public static void main(String[] values) {
        int sum = 0, count =0;
        System.out.println("Calculates Sum for below Integers");

        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
            try {
                sum = sum + Integer.parseInt(values[i]);
            } catch (NumberFormatException e) {
                count++;
            }
        }
        System.out.println("Sum :" + sum);
        System.out.println("Count:" + count );

    }
}
