Факторіал.
Реалізувати підрахунок факторіалу, використовуючи цикл for.
Воно має бути в діапазоні від 0 до 5
  
package main;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = (int)(Math.random(a <= 5)*100);
    int res = 1;
    
    for (int i = a; i <= a; i++) {
    	res = res * i;
    }
    
    System.out.println(res);
    
    }
}
