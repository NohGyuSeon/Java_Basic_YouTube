public class Test2 {
    static int count = 0;

    static void method1() {
        int count = 50;
        System.out.println(count);
    }

    static void method2() {
        count = 90;
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println(count);
        method1();
        method2();
    }
    
}
