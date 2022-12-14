/*
UENF - CCT - CC
Paradigmas de Linguagens de Programação
Aluno: Rômulo Souza Fernandes
E-mail: 00119110559@pq.uenf.br
Data de criação: 20/10/22 
*/
package exercicioPLP;

import java.util.Scanner;

public class Exercicio7d {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Notebook ideapad = new Notebook("I3-7020u");

        System.out.print("Digite o numero de série do computador: ");
        ideapad.numeroDeSerie = input.nextInt();

        System.out.print("Digite o peso do computador: ");
        ideapad.peso = input.nextDouble();

        System.out.print("Digite a quantidade de memoria ram: ");
        ideapad.quantidadeMemoriaRam = input.nextInt();

        ideapad.verificaRequisitos();
    }

}