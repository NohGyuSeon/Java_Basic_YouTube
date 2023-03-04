package fifth;

public class Algorithm {
	
	public static int addFrom1To10() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static int sigma(int start, int end, int step) {
		return accumulate((x, y) -> ( x + y), 0, start, end, step);
	}

	public static int pi(int start, int end, int step) {
		return accumulate((x, y) -> (x * y), 1, start, end, step);
	}

	public static int accumulate(BinaryOp binaryOp, int init, int start, int end, int step) {
		int result = init;
		for (int next = start; next <= end; next += step) {
			result = binaryOp.apply(result, next);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(addFrom1To10());
		System.out.println(sigma(1, 10, 1));
		System.out.println(pi(1, 10, 1));
	}
}