package Lecs.lec_0117.second;

public class Test {
     
    public static boolean isBig(int i , int j) {
        if (i > j) {
            return true;
        } else {
            return false;
        }
    }

    public static int isMonth(int month) {
        int daysInMonth = 0;

        switch (month) {
            case 2:
                daysInMonth = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }

        return daysInMonth;
    }
    
    public static void main(String[] args) {

        int i = 5;
        int j = 6;

        boolean b = i > j;

        System.out.println(isBig(2, 1));

        if (b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        System.out.println("===================================");

        System.out.println(isMonth(1));

        
    }
}
