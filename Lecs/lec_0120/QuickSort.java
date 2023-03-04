public class QuickSort {
    static int[] array = {3,6,7,3,46,34,53,3,34,67};

    public static void swap(int[] data, int pl, int pr) {
        int temp = data[pl];
        data[pl] = data[pr]; 
        data[pr] = temp;
    }

    public static void sort(int[] array, int left, int right) {
        int pl = left;
        int pr = right;
        int pivot = array[(left + right) / 2];

        do {
            while(array[pl] < pivot) {
                pl++;
            }
            while(array[pr] > pivot) {
                pr--;
            }
            if(pl <= pr) {
                swap(array, pl++, pr--);
            }
        } while (pl <= pr);

        if(left < pr) {
            sort(array, left, pr); 
        }
        if(pl < right) {
            sort(array, pl, right);
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
        sort(array, 0, array.length-1);
        printArray(array);
    }
    
}
