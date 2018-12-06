import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {

		double num1 = new Scanner(System.in).nextDouble();
		char operation = new Scanner(System.in).next().charAt(0);
		double num2 = new Scanner(System.in).nextDouble();;
		double result = 0;
				if (operation == '+') {
			result = num1 + num2;
			System.out.println("The result of mathematical expression: " + result);
		}
		else if (operation == '-') {
			result = num1 - num2;
			System.out.println("The result of mathematical expression: " + result);
		}
		else if (operation == '*') {
			result = num1 * num2;
			System.out.println("The result of mathematical expression: " + result);
		}
		else if (operation == '/') {
			result = num1 / num2;
			System.out.println("The result of mathematical expression: " + result);
		}
		else if (operation == '^') {
			result = num1;
			for (int i = 1; i < num2; i++) {
				result *= num1;
			}
			System.out.println("The result of mathematical expression: " + result);
		}
		else if (operation == '%') {
			result = num1 % num2;
			System.out.println("The result of mathematical expression: " + result);
			}
		}
	}
}
				
	
	
	


		
		
		
	
