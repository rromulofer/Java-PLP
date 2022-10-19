/*
UENF - CCT - CC
Paradigmas de Linguagens de Programação
Aluno: Rômulo Souza Fernandes
E-mail: 00119110559@pq.uenf.br
Data de criação: 19/10/22 
*/
package exercicioPLP;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] notas = new double[4];
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite o valor para a %d° nota: ", i + 1);
			notas[i] = input.nextDouble();
		}

		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}

		media = media / notas.length;
		System.out.printf("A média foi de: %.2f\n", media);
		if (media >= 6) {
			System.out.println("\nAprovado.");
		} else {
			System.out.println("\nReprovado.");
		}

	}

}