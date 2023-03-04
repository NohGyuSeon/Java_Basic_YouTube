package Lecs.lec_0117.fourth;

import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    public static void main(String[] args) {

        System.out.print("Enter a digit 1 between 365: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int dayNum = Integer.parseInt(line);

        int month = 0;

        for (int days : daysInMonth) {
            if (dayNum < 31) {
                break;
            } else {
                dayNum -= days;
                month++;
            }
        }

        sc.close();

        System.out.printf("%s, %d", monthNames[month], dayNum);
    }
}
