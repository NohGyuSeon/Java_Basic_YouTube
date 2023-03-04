public class SelectionSort {
    static int[] array = {3,6,7,3,46,34,53,3,34,67};

    public static void swap(int[] data, int pl, int pr) {
        int temp = data[pl];
        data[pl] = data[pr];
        data[pr] = temp;
    }

    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length-1; i++) {
            int min_index = i;

            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[min_index]) {
                    min_index = j;
                }
            }

            swap(array, i, min_index);
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
