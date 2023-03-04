package Labs.Lab02.Starter;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        String myName;

        System.out.print("Enter your Name : ");
        Scanner sc = new Scanner(System.in);
        myName = sc.next();
        System.out.printf("Greetings, %s", myName);
        sc.close();

        int i = 10;
        int j = 0;
        int k = i / j;
        System.out.println(k);
    }
    
}
