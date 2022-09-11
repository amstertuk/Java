Дні тижня із оператором switch.
"Дні тижня", використовуючи оператор switch
  
package main;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    
    switch (day) {
    case 1:
      System.out.println("Понеділок");
      break;
    case 2:
      System.out.println("Вівторок");
      break;
    case 3:
      System.out.println("Середа");
      break;
    case 4:
      System.out.println("Четвер");
      break;
    case 5:
      System.out.println("П'ятниця");
      break;
    case 6:
      System.out.println("Субота");
      break;
    case 7:
      System.out.println("Неділя");
      break; 
      }

    }
}
