package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8;
		int firstNumber = 0;
		int secondNumber = 1;
		int sumOfTwo;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		for (int i = 2; i < range; i++) {
			
			sumOfTwo = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sumOfTwo;
			
			System.out.println(sumOfTwo);
		}
			
	}

}
