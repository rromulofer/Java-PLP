/*
UENF - CCT - CC
Paradigmas de Linguagens de Programação
Aluno: Rômulo Souza Fernandes
E-mail: 00119110559@pq.uenf.br
Data de criação: 20/10/22 
*/
package exercicioPLP;

public class Exercicio7c {

    public static void main(String[] args) {

        PeixeBoi cadastro = new PeixeBoi();
        cadastro.identificacao = 001;
        cadastro.localDeNascimento = "Campos dos Goytacazes";
        cadastro.peso = 12;

        cadastro.verificaPeso();

    }

}