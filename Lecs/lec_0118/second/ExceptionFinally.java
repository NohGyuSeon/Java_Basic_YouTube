import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionFinally {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                int i = sc.nextInt();
                int j = sc.nextInt();
                int k = i / j;
            } finally {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            
        }
    }
}