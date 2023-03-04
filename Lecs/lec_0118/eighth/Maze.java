import java.util.Random;

public class Maze {
    static int size = 10; // 미로는 size X size 크기
    static int visited = 2; // visited : 방문한 길 표시
    static int cannot = 3; // cannot : 막혀있는 길 표시 -> 동서남북 다 보더라도 벽이거나 왔던 길 밖에
                            // 없어서 새로운 길로 가지 못하는 경우
    public static boolean findPath(int[][] maze, int x, int y) {
        if (x < 0 || y < 0 || x >= size || y >= size) {
            return false;
        } else if (maze[x][y] !=  0) {
            return false;
        } else if (x == size-1 && y == size-1) {
            maze[x][y] = visited;
            return true;
        }
        else {
            maze[x][y] = visited;
            if(findPath(maze, x, y+1) || findPath(maze, x-1, y) || findPath(maze, x, y-1) || findPath(maze, x+1, y)) {
                return true;
            } else {
                maze[x][y] = cannot;
                return false;
            }
        }
    }

    public static void main(String[] args) {

        int [][] maze = new int[10][10];

        Random rand = new Random();

        int doorCount = rand.nextInt(50);
        int index = doorCount;
        System.out.println(index);
        
        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze.length; j++) {
                maze[i][j] = 0;
            }
        }
        
        int count = 0;

        while(index != 0) {
            for(int i = 0; i < maze.length; i++) {
                for(int j = 0; j < maze.length; j++) {
                    int percent = rand.nextInt(100);
                    if (percent > 50) {
                        if (index == 0) {
                            break;
                        } else if (maze[i][j] == 0) {
                            maze[i][j] = 1;
                            index--;
                            count++;
                        } 
                    } else { 
                        continue;
                    }
                }                
            }
        }
    
        System.out.println(count);
        System.out.println("생성된 판의 형태를 출력합니다.");

        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

       System.out.println(findPath(maze, 0, 0));
       // 0, 0 에서 출발 시 길이 있으면 true, 없으면 false 출력

    }
}
