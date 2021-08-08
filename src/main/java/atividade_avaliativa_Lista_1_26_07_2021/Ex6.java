/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_avaliativa_Lista_1_26_07_2021;

/**
 *
 * @author geovane_rigonato
 */



/*Escreva um algoritmo que lê uma matriz M (5,5) e calcule as somas:

a) da linha 4 de M;
b) da coluna 2 de M;
c) da diagonal principal;
d) da diagonal secundária;
e) de todos os elementos da matriz;
f) Escreva estas somas e a matriz;*/
public class Ex6 {
    public static void main(String[] args) {
        int M[][] = new int[5][5];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = (i+10)*(j+10);
            }
        }

        int soma = 0;
        for (int i = 0; i < M.length; i++) {

            soma = soma + M[3][i];

            }
                        System.out.println("Soma da linha 4 da Matriz M: " + soma);
soma = 0;
        for (int i = 0; i < M.length; i++) {
                soma = soma + M[i][1];
            }
                       System.out.println("Soma da coluna 2 da Matriz M: " + soma);
soma = 0;
        for (int i = 0; i < M.length; i++) {
         soma = soma + M[i][i];
            }System.out.println("Soma da diagonal principal da Matriz M: " + soma);

        soma = 0;
        for (int i = 0; i < M.length; i++) {
           int col = M.length - 1;
           col = col - i;
           soma = soma + M[i][col];
        }System.out.println("Soma da diagonal principal da Matriz M usando apenas 1 for: "+ soma);

        /*
            00 01 02 03 04
            10 11 12 13 14
            20 21 22 23 24
            30 31 32 33 34
            40 41 42 43 44 matriz 5x5
         */
        soma = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if((i+j) == 4){
                    soma = soma+ M[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal secundária da Matriz M usando 2 for: "+soma);


        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j]);
                if(j != M[i].length -1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}
