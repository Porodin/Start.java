public class Calculator {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		char mathOperation = '^';

		if(mathOperation == '+') {
			System.out.println(x + y);
		} else if(mathOperation == '-') {
			System.out.println(x - y);
		} else if(mathOperation == '/') {
			System.out.println(x / y);
		} else if(mathOperation == '*') {
			System.out.println(x * y);
		} else if(mathOperation == '%') {
			System.out.println(x % y);
		} else if(mathOperation == '^') {
			int result = 1;
			for(int i = 1; i <= y; i++) {
			result = result*x;
		}	
			
		}	
	}	
}
