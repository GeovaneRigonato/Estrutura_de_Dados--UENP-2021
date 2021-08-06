/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_avaliativa_Lista_1_26_07_2021;

import java.util.Scanner;

/**
 *
 * @author geovane_rigonato
 */

/*Escrever um algoritmo que lê um vetor G (13) que é o gabarito de um teste de
loteria esportiva, contendo os valores 1 (coluna 1) ou 2 (coluna 2) ou 3 (coluna
do meio). Ler, a seguir, para cada apostador, o número de seu cartão e um
vetor Resposta R (13). Verificar para cada apostador o número de acertos e
escrever o número do apostador e seu número de acertos. Se tiver 13 acertos,
acrescentar a mensagem: "GANHADOR, PARABENS".*/
public class Ex5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int G[] = {1, 3, 2, 2, 1, 3, 1, 2, 3, 1, 1, 2, 3};
        int cartao;
        int R[] = new int[13];
        System.out.println("Digite o número do cartão: ");
        cartao = teclado.nextInt();
        System.out.println("Digite o seu jogo: ");
        for (int i = 0; i < 13; i++) {
            R[i] = teclado.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < 13; i++) {
            if (R[i] == G[i]) {
                cont++;
            }
        }
        System.out.println("O apostador " + cartao + " teve " + cont + " acerto(s)");
        if (cont == 13) {
            System.out.println("GANHADOR, PARABÉNS");
        }
    }
}
