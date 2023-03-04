package Lecs.lec_0118.fourth;

import java.util.Scanner;

class Test {
    public static void getUserInformation(Scanner sc) {
        System.out.print("Enter a name: ");
        String name = sc.next();
        System.out.println("Hello, " + name + ", ");
        String phoneNumber = sc.next();
        String address = sc.next();
        System.out.println("Your Information is: ");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test test = new Test();
        getUserInformation(sc);
        test.getUserInformation(sc);
        test.getUserInformation(sc);
        test.getUserInformation(sc);
    }
    
}
