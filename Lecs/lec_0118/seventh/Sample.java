package Lecs.lec_0118.seventh;

public class Sample {
    static int add(int i, int j) {
        return i + j;
    }

    static int add(int i, int j, int k) {
        return add(add(i, j), k);
    }

    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    static int max(int x, int y, int k) {
        return (max(max(x, y), k));
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));

        System.out.println("===================");

        System.out.println(max(1, 5));
        System.out.println(max(1, 5, 10));
    }    
}
