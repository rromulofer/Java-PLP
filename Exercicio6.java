/*
UENF - CCT - CC
Paradigmas de Linguagens de Programação
Aluno: Rômulo Souza Fernandes
E-mail: 00119110559@pq.uenf.br
Data de criação: 19/10/22 
*/
package exercicioPLP;

public class Exercicio6 {

	public static void main(String[] args) {

		int a = 5;
		int b = 40;
		int soma = 0;

		for (int i = 5; i <= b; i++) {
			soma += i;
		}
		System.out.printf("O valor da soma entre %d a %d foi de: %d", a, b, soma);
	}

}