import java.util.ArrayList;
import java.util.Arrays;

public class DecimalConvertor {

	static int result;

	// 입력한 문자열을 변환한 10진수 값을 그대로 받아서 2진수로 변환하기 위한 static 정적 변수 선언
	static int sum;

	// 문자열 길이를 받아서 배열 크기를 선언하고, 10진수 -> 2진수 변환 메서드를 위한 변수 선언
	static String str;

	public static int binaryToDecimal(String binaryValue) {
		
		// 입력받은 문자열을 str에 할당
		str = binaryValue;
		
		// int와 char 비교를 위해서 String 사용
		String numString = binaryValue;
		StringBuffer sb = new StringBuffer(numString);
		numString = sb.reverse().toString();

		String[] ar = numString.split("");

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <= 9; j++) {

				String new_string = j + "";

				// new_string 문자형 숫자와 ar[i]에 담긴 문자형 숫자가 일치하면 실행
				if (new_string.equals(ar[i])) {
					// 정수형으로 변환된 숫자 result
					result = result + (j * (int) Math.pow(10, i));
				}
			}
		}

		// result를 10진수로 변환하기 위한 변수 num 선언
		int num = result;

		// 진수 변환 계산을 위한 변수 선언
		int i = 1;
		int index = 0;

		while (num > 0) {
			i = (int) Math.pow(2, index);
			if (num % 10 == 1) {
				sum += i;
			}
			num /= 10;
			index++;
		}

		return sum;
	}

	/*
	 * 10진수가 2진수로 변환되는 과정 Sample
	 * 
	 * 19 / 2 9...1
	 * 9 / 2 4...1
	 * 4 / 2 2...0
	 * 2 / 2 1...0
	 * 1 / 2 0...1
	 * 
	 * 010011 <=> 19
	 * 
	 */
	public static String decimalToBinary(int decimal) {

		int inputNum = decimal;
		int bin[] = new int[str.length()];

		int i = 0;
		int mok = inputNum;

		while (mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}

		i--;

		StringBuffer n_str = new StringBuffer();

		for (int j = 0; j < bin.length; j++) {
			n_str.append(bin[j]);
		}

		// 변환된 2진수 문자열 반환
		return n_str.toString();
	}

}
