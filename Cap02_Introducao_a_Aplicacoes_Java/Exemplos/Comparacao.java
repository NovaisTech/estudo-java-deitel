package Cap02_Introducao_a_Aplicacoes_Java.Exemplos;

import java.util.Scanner;
public class Comparacao {

	public static void main(String[]args) {
		
		//Criar Scanner para obter entrada a partir da linha de comando
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print("Entre o primeiro número");
		number1 = input.nextInt();
		
		
		System.out.print("Entre o segundo número");
		number2 = input.nextInt();
		
		if (number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);
		
		if (number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d > %d%n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		
		if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);
	}
	
	
}
