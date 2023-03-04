package first;

public class Test {

    public static void main(String[] args) {
        int grid[][] = new int[2][3];
    
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}
