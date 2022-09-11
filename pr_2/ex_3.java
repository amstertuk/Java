Парне-непарне.
1. Передати на вхід програми число як аргумент.
2. Якщо воно непарне, роздрукувати його.
3. Використовуємо оператор if.

package main;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    if (a%2 == 0) {
    	System.out.println("Число парне !");
    }else {
    	System.out.println("Число не парне !");
    }
    
	}

}
