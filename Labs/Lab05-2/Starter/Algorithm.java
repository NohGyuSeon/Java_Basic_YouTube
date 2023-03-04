public class Algorithm {
    public static int addFrom1To10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        return sum;
    }

    public static int sigma(int start, int end, int step) {
        // int result = 0;
        // for (int next = start; next <= end; next += step) {
        //     result += next;
        // }

        // return result;
        return accumulate(new Adder(), 0, start, end, step);
    }
 
    public static int pi(int start, int end, int step) {
        // int result = 1;
        // for (int next = start; next <= end; next += step) {
        //     result *= next;
        // }

        // return result;
        return accumulate(new Multiplier(), 1, start, end, step);
    }
    
    public static int accumulate(Adder binder, int init, int start, int end, int step) {
        int result = init;
        for(int next = start; next <= end; next += step) {
            result = binder.apply(result, next);
        }

        return result;
    } 
   
    public static int accumulate(Multiplier binder, int init, int start, int end, int step) {
        int result = init;
        for(int next = start; next <= end; next += step) {
            result = binder.apply(result, next);
        }

        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(Algorithm.addFrom1To10());
        System.out.println(Algorithm.sigma(1, 10, 1));
        System.out.println(Algorithm.pi(1, 10, 1));
    }
}