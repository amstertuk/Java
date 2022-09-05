Завдання 4. Поділ яблук - 2
N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
Скільки яблук залишиться у кошику?
  
Вхідні дані:
Програма отримує вхід числа N і K.
  
Вихідні дані:
Програма повинна вивести кількість яблук.
  
  
package main;
import java.util.Scanner;

class main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		

		System.out.println(k % n);
		
	}
}
