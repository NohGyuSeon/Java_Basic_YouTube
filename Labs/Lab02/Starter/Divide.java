package Labs.Lab02.Starter;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {

        try {
            System.out.print("Enter first Integer: ");
            Scanner sc = new Scanner(System.in);
            String temp = sc.nextLine();
            int i = Integer.parseInt(temp);
    
            System.out.print("Enter second Integer: ");
            temp = sc.nextLine();
            int j = Integer.parseInt(temp);
    
            int k = i / j;
            System.out.printf("%d / %d = %d", i, j, k);
    
            sc.close();
        } catch (Exception e) {
            System.out.println("An Exception was thrown: " + e);
        }
    }

}
