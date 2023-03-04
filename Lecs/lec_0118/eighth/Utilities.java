package Lecs.lec_0118.eighth;

import java.util.Scanner;

public class Utilities {
    public static int max(int i, int j) {
        if (i > j) {
            return i;
        } else {
            return j;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a first digit: ");
            int i = scanner.nextInt(); 
    
            System.out.print("Enter a second digit: ");
            int j = scanner.nextInt();
    
            int max = Utilities.max(i, j);
    
            System.out.printf("%d, %d 중 큰 숫자는 %d입니다.", i, j, max);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();          
        }
        
    }
}