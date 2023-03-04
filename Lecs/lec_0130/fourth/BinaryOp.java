package fourth;

interface BinaryOp {
    int apply(int right, int left);
}

interface Printable extends BinaryOp {
    void print();
}

class Adder implements BinaryOp, Printable {
    @Override
    public int apply(int right, int left) {
        return right + left;
    }

    @Override
    public void print() {
        System.out.println("Apply add!");
    }
}

class Multiplier implements BinaryOp {
    @Override
    public int apply(int right, int left) {
        return right * left;
    }
}

class Calculation {
    public static void main(String[] args) {
        BinaryOp binder = new Adder();
        BinaryOp binder2 = new Multiplier();

        System.out.println(binder.apply(1, 2));
        System.out.println(binder2.apply(1, 2));
        ((Printable) binder).print();

    }
}
