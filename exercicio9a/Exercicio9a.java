/*
UENF - CCT - CC
Paradigmas de Linguagens de Programação
Aluno: Rômulo Souza Fernandes
E-mail: 00119110559@pq.uenf.br
Data de criação: 20/10/22 
*/
package exercicioPLP;

import java.util.Scanner;

public class Exercicio9a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuadractEquation obj = new QuadractEquation();

        System.out.print("Digite o valor para 'a':");
        int a = input.nextInt();
        obj.setA(a);

        System.out.print("Digite o valor para 'b':");
        obj.setB(input.nextInt());

        System.out.print("Digite o valor para 'b':");
        obj.setC(input.nextInt());

        int result1 = obj.getDiscriminant();
        System.out.printf("Discriminante: %d\n", result1);

        double result2 = obj.getRoot1();
        System.out.printf("R1: %.2f\n", result2);

        double result3 = obj.getRoot2();
        System.out.printf("R2: %.2f\n", result3);
    }

}