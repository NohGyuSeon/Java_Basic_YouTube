public class BubbleSort {
    static int[] array = {3,6,7,3,46,34,53,3,34,67};

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j-1] > array[j]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
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
