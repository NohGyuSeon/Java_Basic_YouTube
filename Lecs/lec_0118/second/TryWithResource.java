import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResource {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in) ){
           int i = Integer.parseInt(sc.nextLine());
           int j = Integer.parseInt(sc.nextLine());
           int k = i / j;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}