package Lecs.lec_0117.fourth;

import java.util.Scanner;

public class Whatday2 {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    public static void main(String[] args) {

        System.out.print("Enter a digit 1 between 365: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int dayNum = Integer.parseInt(line);

        int monthNum = 0;

        boolean flag = true;
        if (dayNum >= 28 && dayNum <= 31) {
            flag = false;
        }

        boolean nextMonth = true;

        // flag, nextMonth 변수 없이 dayNum 조건식에서 monthNum이 해당 월에 해당하는지의 
        // 조건을 추가하여 풀이도 가능 (dayNum >= 31 && monthNum == 0)

        if (flag == true) {
            if (dayNum >= 31) {     // January
                monthNum++;
                dayNum -= 31;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 28 && nextMonth == true) {     // Feburary
                monthNum++;
                dayNum -= 28;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 31 && nextMonth == true) {     // March
                monthNum++;
                dayNum -= 31;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 30 && nextMonth == true) {     // April
                monthNum++;
                dayNum -= 30;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 31 && nextMonth == true) {     // May
                monthNum++;
                dayNum -= 31;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 30 && nextMonth == true) {     // June
                monthNum++;
                dayNum -= 30;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 31 && nextMonth == true) {     // July
                monthNum++;
                dayNum -= 31;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 31 && nextMonth == true) {     // August
                monthNum++;
                dayNum -= 31;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 30 && nextMonth == true) {     // September
                monthNum++;
                dayNum -= 30;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 31 && nextMonth == true) {     // October
                monthNum++;
                dayNum -= 31;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
            
            if (dayNum > 30 && nextMonth == true) {     // November
                monthNum++;
                dayNum -= 30;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
    
            if (dayNum > 31 && nextMonth == true) {     // December
                dayNum -= 31;
                if (dayNum <= daysInMonth[monthNum]) {
                    nextMonth = false;
                }
            }
        }
      
        sc.close();

        System.out.printf("%s, %d", monthNames[monthNum], dayNum);
    }
}
