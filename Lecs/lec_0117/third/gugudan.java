package Lecs.lec_0117.third;

public class gugudan {

    public static void main(String[] args) {

        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d\t", i, j, i*j);
            }
            System.out.println();
        }
        
        System.out.println("===================================");
        
        int i = 2;
        int j = 1;
        while(i <= 9) {
            while(j <= 9) {
                System.out.printf("%d X %d = %d\t", i, j, i*j);
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }

    }
    
}
