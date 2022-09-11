Калькулятор

1. Створити метод, який приймає на вхід дві змінні типу int.
2. Метод обчислює їх суму та повертає значення.
3. Викликати цей метод методу main.
4. Зробити методи для обчислення різниці, твору та поділу.

package main;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    
	}

}
