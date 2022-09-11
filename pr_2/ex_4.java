Число від 0 до 10.

1. За допомогою класу Scanner введіть ціле число.
2. Якщо це число від 0 до 10, вивести на консоль
повідомлення "Позитивне число менше 10 або нуль",
інакше вивести повідомлення "Позитивне число більше 10
або негативне".
3. Використовуємо оператор if-else.
  
package main;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    if (a >= 0 && a < 10 ) {
    	System.out.println("Позитивне число менше 10 або нуль");
    } else {
    	System.out.println("Позитивне число більше 10 або негативне");
    }
    	
    	
    	
    }
}
