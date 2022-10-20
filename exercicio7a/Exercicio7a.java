/*
UENF - CCT - CC
Paradigmas de Linguagens de Programação
Aluno: Rômulo Souza Fernandes
E-mail: 00119110559@pq.uenf.br
Data de criação: 20/10/22 
*/
package exercicioPLP;

import java.util.Scanner;

public class Exercicio7a {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Utilitario frota1 = new Utilitario(2017);

		System.out.print("Digite a marca do veículo: ");
		frota1.marca = input.nextLine();

		System.out.print("Digite o modelo do veículo: ");
		frota1.modelo = input.nextLine();

		System.out.print("Digite a quilometragem percorrida: ");
		frota1.quilometragem = input.nextDouble();

		System.out.print("Digite a quantidade de combustível abastecida: ");
		frota1.litragemCombustivel = input.nextDouble();

		frota1.consumo();
		frota1.verificaIPVA();

	}

}