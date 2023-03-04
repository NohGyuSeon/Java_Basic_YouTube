package Lecs.lec_0118.sixth;

import java.util.Scanner;

public class factoiral {

    public int transferToFactorial(int number) {

        if (number < 0) {
            return -1;
        } 
        if (number == 0) {
            return 1;
        } 
    
        return number * transferToFactorial(number-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a digit: ");
        
        int n = sc.nextInt();

        factoiral fact = new factoiral();
        System.out.println(fact.transferToFactorial(n));

    }
}
