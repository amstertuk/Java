Завдання 2. Наступне та попереднє
Напишіть програму, яка зчитує ціле число та виводить текст, аналогічний наведеному у
прикладі. Прогалини, розділові знаки, великі і малі літери важливі!
  
Вхідні дані:
Вводиться ціле число, за модулем, що не перевищує 10000.
  
Вихідні дані:
Виведіть спочатку фразу "The next number for the number", потім введене число, потім
слово "is", оточене пробілами, потім формулу для наступного за введеним числом,
нарешті, знак точки без пробілу. Аналогічно у наступному рядку для попереднього числа.
  
  
package main;
import java.util.Scanner;

class main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a > 1000) {
			return;
		}
		
		System.out.println("The next number for the number" + " " +  a + " " +  "is" + " " +  (a+1));
		System.out.println("The previous number for the number" + " " +  a + " " +  "is" + " " +  (a-1));
		
	}
}
