package Lecs.lec_0117.fifth;

public class bubbleSort {

    public static void main(String[] args) {
        int[] array = {2,3,4,6,2,3,1,3,4,6,4,6};

        for(int i = 1; i < array.length; i++) {
            for(int j = 1; j < array.length; j++) {
                if (array[j-1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j-1];;
                    array[j-1] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.printf(i + " ");
        }

    }    
}
