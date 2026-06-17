package Cap02_Introducao_a_Aplicacoes_Java.Exercicios;

import java.util.Scanner;

public class addition {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.println("Entre o primeiro número");
        number1 = input.nextInt();
        
        System.out.println("Entre o segundo número");
        number2 = input.nextInt();
        
        sum = number1 + number2;

        System.out.printf("Soma é %d%n",sum);



    }   
}
