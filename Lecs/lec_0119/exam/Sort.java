package exam;

public class Sort {
    static int[] array = {3,6,7,3,46,34,53,3,34,67};

    public static void sort(int[] array, int left, int right) {

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(array);
        sort(array, 0, array.length-1);
        printArray(array);
    }
    
}
