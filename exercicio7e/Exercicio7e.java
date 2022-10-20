/*
UENF - CCT - CC
Paradigmas de Linguagens de Programação
Aluno: Rômulo Souza Fernandes
E-mail: 00119110559@pq.uenf.br
Data de criação: 20/10/22 
*/
package exercicioPLP;

public class Exercicio7e {

    public static void main(String[] args) {

        MicroControlador arduino = new MicroControlador();

        arduino.serie = 487923;
        arduino.modelo = "Uno";
        arduino.memoriaROM = true;
        arduino.voltagemNecessaria = 5;

    }

}