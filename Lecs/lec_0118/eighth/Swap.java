package Lecs.lec_0118.eighth;

public class Swap {

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;        
    }

    public static void main(String[] args) {
       int i = 1, 
           j = 2;
        System.out.printf("swap 메소드 호출 전 i: %d, j: %d\n", i, j);
        Swap.swap(i, j);
        System.out.printf("swap 메소드 호출 후 i: %d, j: %d\n", i, j);
    }

}
 