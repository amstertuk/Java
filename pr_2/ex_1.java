Літерали.
Створити програму, де вивести на консоль літерали наступних
видів:

1. логічний
2. рядковий
3. символьний
4. цілісний 2-й
5. цілісний 8-й
6. цілісний 10-й
7. цілісний 16-й
8. літерал типу float
9. літерал типу double.

1.
  class main{
	public static void main(String[] args) {
		
		boolean flag = false;
		
		if(true) {
			System.out.println("Действие верное");
		}
		
	}
}

2. 
  class main{
	public static void main(String[] args) {
		
		String lit = "\"Рядок\" де \"використовуються\" лапки. ";
		
		System.out.println(lit);
	}
}

3.
  class main{
	public static void main(String[] args) {
		
		System.out.println("Амперсант - " + '&');
		System.out.println("Ділення - " + '\u00F7');
	}
}

4-7.
  class main{
	public static void main(String[] args) {
		
		int a = 0b1000101011;
		int b = 0123405;
		int c = 220;
		int d = 0x141D12;
		
		System.out.println("Двойний - " + a);
		System.out.println("Восьмий - " + b);
		System.out.println("Десятий - " + c);
		System.out.println("Шістнадцятий - " + d);
	}
}

8.
  class main{
	public static void main(String[] args) {
		
		double a = 5.425242;
		double b = 7.05E-18;
		
		System.out.println("Класичний double - " + a);
		System.out.println("Научний double - " + b);

	}
}

9.
  class main{
	public static void main(String[] args) {
		
		float a = 8.07E-15F;
		
		System.out.println("Тип float - " + a);


	}
}





