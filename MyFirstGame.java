import java.util.Scanner;
import java.util.Random;
public class MyFirstGame {

	public static void main (String[]args) {
	int randomNumber;
	int enteredNumber;
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	randomNumber = random.nextInt(100);

	System.out.println("Enter number");
	enteredNumber = scanner.nextInt();

	if (enteredNumber > randomNumber) {
		System.out.println("The number you entered is greater than what the computer intered");
	}else if (enteredNumber < randomNumber) {
		System.out.println("The number you entered is less than what the computer");
	}else if (enteredNumber == randomNumber) {

	}
	}
	}


