import java.util.Scanner;



public class WhatdayIf {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    public static void main(String[] args) {
        System.out.print("Enter a day number between 1 and 365: ");
        Scanner scanner = new Scanner(System.in);
        int dayNum = scanner.nextInt();

        int monthNum = 0; 

        if (dayNum >= 31) {     // January
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 28) {     // Feburary
            monthNum++;
            dayNum -= 28;
        }

        if (dayNum >= 31) {     // March
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // April
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // May
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // June
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // July
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 31) {     // August
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // September
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // October
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // November
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // December
            monthNum++;
            dayNum -= 31;
        }

        String monthName = monthNames[monthNum];

        System.out.printf("%s, %d \n", monthName, dayNum);
        scanner.close();
    }
}