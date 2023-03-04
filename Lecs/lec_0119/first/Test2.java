package first;

public class Test2 {

    public static void main(String[] args) {
        int[] row = new int[4];
        int[] copy = row;

        row[0]++;
        int value = copy[0];
        System.out.println(value);
    }
    
}
