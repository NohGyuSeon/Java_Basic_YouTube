package fourth;

@FunctionalInterface
public interface BinaryOp {
    int apply(int i, int j);
}

class Test {
    public static int calc(BinaryOp binder, int i, int j) {
        return binder.apply(i, j);
    }

    public static void main(String[] args) {
        System.out.println(calc((x, y) -> (x + y), 1, 2));
         
    }
}
