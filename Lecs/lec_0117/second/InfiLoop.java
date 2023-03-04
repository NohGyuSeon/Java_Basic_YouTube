package Lecs.lec_0117.second;

import java.util.Scanner;

public class InfiLoop {

    public static void main(String[] args) {

        int i = 1;
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter a value: ");
            i = sc.nextInt();

            if (i != 0) {
                System.out.println("Digit: " + i);
            } else {
                break;
            }
            
            sc.close();
        }
    }
    
}
