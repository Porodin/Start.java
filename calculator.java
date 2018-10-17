import java.util.Scanner;
public class calculator {
	public static void main(String[] args){
	Scanner Сalculator = new Scanner (System.in);
	int php, ruby, result;
	System.out.println("Введите первое число:");
	php = Сalculator.nextInt();
	System.out.println("Введите второе число:");
	ruby = Сalculator.nextInt();
	result = php + ruby;
	System.out.println("Сумма равна: + result");
	result = ruby - php;
	System.out.println("Разность равна: - result");
	result = ruby * php;
	System.out.println("Произведение равно: * result");
	result = ruby / php;
	System.out.println("Частное равно: / result");
	result = ruby % php;
	System.out.println("Остаток от деления: % result ");

 }
}




	
	
	
	