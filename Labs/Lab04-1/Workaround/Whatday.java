import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    public static void main(String[] args) {
        System.out.print("Enter a day number between 1 and 365: ");
        Scanner scanner = new Scanner(System.in);
        int dayNum = scanner.nextInt();

        boolean stop = true;
        int monthNum = 0; 
    
        if (dayNum <= 31) {     // January
            stop = false;
        }

        if (dayNum >= 31 && stop) {     // Feburary
            dayNum -= 31;
            monthNum++;    
        }

        if (dayNum >= 29 && stop) {
            dayNum -= 28;           // March
            monthNum++;
            if (dayNum <= 31) {
                stop = false;
            }
            else {                  // April
                dayNum -= 31;
                monthNum++;    
            }
        }

        if (dayNum >= 31 && stop) {
            dayNum -= 30;           // May
            monthNum++;
            if (dayNum <= 31) {
                stop = false;
            }
            else {                  // June
                dayNum -= 31;
                monthNum++;    
            }
        }

        if (dayNum >= 31 && stop) {
            dayNum -= 30;           // July
            monthNum++;
            if (dayNum <= 31) {
                stop = false;
            }
            else {                  // August
                dayNum -= 31;
                monthNum++;    
            }
        }

        if (dayNum >= 32 && stop) {
            dayNum -= 31;           // September
            monthNum++;
            if (dayNum <= 30) {
                stop = false;
            }
            else {                  // October
                dayNum -= 30;
                monthNum++;
            }
        }

        if (dayNum >= 32 && stop) {
            dayNum -= 31;           // November
            monthNum++;
            if (dayNum <= 30) {
                stop = false;
            }
            else {                  // December
                dayNum -= 30;
                monthNum++;    
            }
        }

        String monthName = monthNames[monthNum];

        System.out.printf("%s, %d \n", monthName, dayNum);
        scanner.close(); 
    }
}