package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int firstNum = 0;
		int SecNum = 1;
		int sum;
		System.out.println(firstNum);
		System.out.println(SecNum);
		for (int i = 2; i < range; ++i) {
			sum = firstNum + SecNum;
			System.out.println(sum);
			firstNum = SecNum;
			SecNum = sum;
		}
	}
}
