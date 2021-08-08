package atividade_avaliativa_Lista_1_26_07_2021;


/*Escrever um algoritmo que lê um vetor N (20) e que imprima os valores de N.
Troque, a seguir, o 1o elemento com o último, o 2o com o penúltimo etc. até o
10o com o 11o e escreva o vetor N assim modificado.*/
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[20];

        for (int i = 0; i < 20; i++) {
            vetor[i] = teclado.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("a[" + i + "] = " + vetor[i]);
        }
        System.out.println();

        int z = 0;
        int j = vetor.length - 1;
        int aux;
        do {
            aux = vetor[z];
            vetor[z] = vetor[j];
            vetor[j] = aux;
            z++;
            j--;
        } while (z < j);
        for (j = 0; j < 20; j++) {
            System.out.println("b[" + j + "] = " + vetor[j]);
        }
    }
}
