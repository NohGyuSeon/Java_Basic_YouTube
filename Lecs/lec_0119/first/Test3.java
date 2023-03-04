package first;

public class Test3 {
    
    public static void main(String[] args) {
        for (String arg: args) {
            System.out.println(arg);
        }

        int array[][] = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] innerArray: array) {
            for (int element: innerArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
