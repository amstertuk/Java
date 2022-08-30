Завдання 1. Гіпотенуза 
Дано два числа a та b. Знайдіть гіпотенузу трикутника із заданими катетами. 

Вхідні дані: 
У двох рядках вводяться два числа (числа цілі, позитивні, не перевищують 1000).

Вихідні дані: 
Виведіть відповідь на завдання. 


import java.util.Scanner;

public class orel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if (a > 1000) {
			return;
		}
		int b = sc.nextInt();
		if (b > 1000) {
			return;
		}
		
		double c = (a*a) + (b*b);
		c = Math.sqrt(c);
		
		
		System.out.println(c);
	}
}
