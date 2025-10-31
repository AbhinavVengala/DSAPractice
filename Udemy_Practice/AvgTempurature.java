package Udemy_Practice;

import java.util.Scanner;

class AvgTemperature {
    // public static void main(String[] args) {
    //     System.out.print("How many days temperature? ");
    //     try (Scanner sc = new Scanner(System.in)) {
    //         int numberOfDays = sc.nextInt();
    //         int sum = 0;
    //         for(int i=1;i<=numberOfDays;i++) {
    //             System.out.format("Day %d high temperature ", i);
    //             sum+=sc.nextInt();
    //         }
    //         double avg = (sum / numberOfDays);
    //         System.out.println(avg);
    //     }
    // }

    // With array implementation
    public static void main(String[] args) {
        System.out.print("How many days temperature? ");
        try (Scanner sc = new Scanner(System.in)) {
            int numberOfDays = sc.nextInt();
            int[] temp = new int[numberOfDays];
            int sum = 0;
            for(int i=0;i<numberOfDays;i++) {
                System.out.format("Day %d high temperature ", i);
                temp[i] = sc.nextInt();
                sum += temp[i];
            }
            double avg = (sum / numberOfDays);
            // Count days above average
            int above = 0;
            for (int i = 0; i < temp.length; i++) {
                if(temp[i]>avg) {
                    above++;
                }
            }
            System.out.println("Average Temp = "+avg);
            System.out.println("Days above average "+above);
        }
    }
}