package third;

class Hello {
    
    public void say() {
        System.out.println("Hello!");
    }
}

public class TestInstance {
    public static void main(String[] args) {
        Object[] objects = new Object[4];
        String s = "3";
        int[] array = {1, 2};    
        Hello h = new Hello();
        
        objects[0] = s;
        objects[1] = array;
        objects[2] = h;
        objects[3] = 1;
        
        for(Object o: objects) {
            System.out.print(o + "\t\t");
            System.out.println(o.getClass().getName());
            System.out.println();
        }
        
        System.out.println("\n======================\n");

        for(Object o: objects) {
            if (o instanceof Hello) {
                ((Hello) o).say();
            }
        }
        
    }

}
