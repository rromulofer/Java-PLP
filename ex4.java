/*
UENF - CCT - CC
Aluno: Rômulo Souza Fernandes
Data de criação: 19/10/22 
*/
package exercicioPLP;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Digite um número número inteiro: ");
	int numero1 = input.nextInt();
	
	System.out.print("Digite outro número inteiro: ");
	int numero2 = input.nextInt();
	
	System.out.printf("\nA soma entre %d com %d é de: %d",numero1,numero2,numero1+numero2);
	System.out.printf("\nA subtração entre %d com %d é de: %d",numero1,numero2,numero1-numero2);
	System.out.printf("\nA multiplicação entre %d com %d é de: %d",numero1,numero2,numero1*numero2);
	System.out.printf("\nA divisão entre %d com %d é de: %d",numero1,numero2,numero1/numero2);
	}

}