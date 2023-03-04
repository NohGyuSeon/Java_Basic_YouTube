package Lecs.lec_0118.fifth;

class Test {
    static int globalVariable = 5;
    private static int addOne(int i) {
        return i++;
    }

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    private static int[] swapArray(int[] array) {
        for(int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j-1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }    
        
        return array;
    }

    public static void main(String[] args) {
        int i = 10;
        addOne(i);
        System.out.println(i);

        System.out.println("=====================");

        int k = 5;
        swap(i, k);
        System.out.printf("%d %d", i, k);
        System.out.println();
        
        System.out.println("=====================");

        int array[] = {21, 3, 45, 2, 14, 42, 2, 14, 5};
        swapArray(array);
        for(int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");            
        }
        
    }
}
