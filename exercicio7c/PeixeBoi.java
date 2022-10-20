/*
UENF - CCT - CC
Paradigmas de Linguagens de Programação
Aluno: Rômulo Souza Fernandes
E-mail: 00119110559@pq.uenf.br
Data de criação: 20/10/22 
*/
package exercicioPLP;

public class PeixeBoi extends Mamifero {

    double peso;
    int identificacao;

    public void verificaPeso() {
        if (peso < 7) {
            System.out.println("Abaixo do peso. ");
        } else {
            System.out.println("Dentro do peso ideal. ");
        }
    }
}