package Lecs.lec_0118.first;

public class Sample {

    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            System.out.println(i / j);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: java Sample <option>");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Usage: java Sample <args 1> <args 2: no 0>");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
