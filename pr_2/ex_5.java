Дні тижня.
  
1. Передати на вхід програми число від 1 до 7 як аргумент.
2. Якщо число дорівнює 1, виводимо на консоль
“Понеділок”, 2 – “Вівторок” тощо. Якщо 6 або 7 -
"Вихідний".
Використовуємо конструкцію if-else-if.
  
package main;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    if (a == 1 ) {
    	System.out.println("Понеділок");
    }else if (a == 2 ) {
    	System.out.println("Вівторок");
    } 
    
    if (a == 3 ) {
    	System.out.println("Середа");
    }else if (a == 4 ) {
    	System.out.println("Четвер");
    } 
    
    if (a == 5 ) {
    	System.out.println("П'ятниця");
    }else if (a == 6) {
    	System.out.println("Вихідний");
    } 

    if (a == 7) {
    	System.out.println("Вихідний");
    } 
    
    }
}
