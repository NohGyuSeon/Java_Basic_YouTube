import java.util.Scanner;

/*
 * Test Code
 */
public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 기본 생성자 호출
            DecimalConvertor decimalConvertor = new DecimalConvertor();

            System.out.print("Enter a binary Value: ");
            String str = sc.next();
            
            System.out.println(decimalConvertor.binaryToDecimal(str));
            System.out.println(decimalConvertor.decimalToBinary(decimalConvertor.binaryToDecimal(str)));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
