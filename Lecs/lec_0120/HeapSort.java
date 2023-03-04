public class HeapSort {
    static int[] array = {3,6,7,3,46,34,53,3,34,67};

    public static void swap(int[] data, int pl, int pr) {
        int temp = data[pl];
        data[pl] = data[pr];
        data[pr] = temp;
    }

    public static void sort(int[] array) {

        
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(array);
        sort(array);
        printArray(array);
    }

}
