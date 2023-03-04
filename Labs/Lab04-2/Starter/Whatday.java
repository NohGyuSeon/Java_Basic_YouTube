import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] daysInLeapMonth  = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            EnumMonth month = EnumMonth.April;
            EnumMonth[] monthNames = month.values();
            
            System.out.print("Enter year Number: ");
            int yearNum = scanner.nextInt();

            System.out.print("Enter a day number between 1 abd 365: ");
            String line = scanner.next();
            int dayNum = Integer.parseInt(line);

            boolean isLeapYear = (yearNum % 4 == 0) && (yearNum % 100 != 0 || yearNum % 400 == 0);
            
            int maxDayNum = isLeapYear ? 366: 365;

            if (dayNum < 1 || dayNum > maxDayNum) {
                throw new IllegalArgumentException("Out of date range");
            }

            int monthNum = 0; 

            if (isLeapYear) {
                System.out.println("it's Leap Year");
                for (int days: daysInLeapMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }
            } else {
                System.out.println("it's Common Year");
                for (int days: daysInMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }
            }

            EnumMonth monthName = monthNames[monthNum];
            
            System.out.printf("%s, %d \n", monthName, dayNum);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}