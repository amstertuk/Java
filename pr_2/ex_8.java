Роздрукувати числа циклом do-while.
Надрукувати всі числа від 1 до 100, які діляться на 5 без
залишку. Використовуємо цикл do-while.
  
package main;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    do {
    	a++;
    	if (a%5 == 0 ) {
    	    System.out.println(a); 
    	    }
    	} while(a <= 100);
    
    }
}
