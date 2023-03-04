public class Test {
    public static void main(String[] args) {
        int i = 0;
        Integer number = 1;
        String s = "Hello";

        Message m = new Message("Hello");
        int[] array = {1, 2, 3};

        System.out.println(Utilities.isCharSequence(1));
        System.out.println(Utilities.isCharSequence(number));
        System.out.println(Utilities.isCharSequence(s));

        Utilities.display(m);
        Utilities.display(array); 
        
    }
}
