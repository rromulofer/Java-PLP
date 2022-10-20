/*
UENF - CCT - CC
Paradigmas de Linguagens de Programação
Aluno: Rômulo Souza Fernandes
E-mail: 00119110559@pq.uenf.br
Data de criação: 20/10/22 
*/
package exercicioPLP;

public class Computador {

    String processador;
    int quantidadeMemoriaRam;

    Computador(String processador) {
        this.processador = processador;
    }

    public void verificaRequisitos() {
        if (quantidadeMemoriaRam < 8) {
            System.out.println("O computador não possui os requisitos mínimos para executar o programa. ");
        } else {
            System.out.println("Seu computador possui os requisitos mínimos para executar o programa. ");
        }
    }
}