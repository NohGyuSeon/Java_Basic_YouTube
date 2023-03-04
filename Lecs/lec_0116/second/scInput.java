package second;

import java.util.Scanner;

public class scInput {
    public static void main(String[] args) {

        System.out.println("Hello, C World!\n\n");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello, C " + str);

        sc.close();
    }
    
}
