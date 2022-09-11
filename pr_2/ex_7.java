Роздрукувати 10 рядків циклом while.

Роздрукувати 10 рядків: "Task1". "Task2". ... “Task10”.
Використовуємо цикл while.
  
package main;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = 0;
    int f = 1;
    while (f <= 10) {
    	System.out.println("Task" + f );
    	f++;
    	}
    }
}
