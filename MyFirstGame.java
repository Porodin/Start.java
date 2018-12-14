public class MyFirstGame {
	public static void main (String[]args) {
		int userNumber = 30;
		int computerNumber = 13;
		while(userNumber != computerNumber) {
			if(userNumber > computerNumber) {
				System.out.println("Больше" + " " + userNumber);
				userNumber--;
			} else if(userNumber < computerNumber) {
				System.out.println(userNumber + " " + " Меньше");
				userNumber++;
			} else if(userNumber == computerNumber) {
				System.out.println("Вы угадали");
				break;
			}
		}
	}
}	
