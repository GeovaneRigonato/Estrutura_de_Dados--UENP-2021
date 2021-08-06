/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Matrizes_29_06_2021.Exercicio1;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
    public static void main(String[] args) {
              String mat[][] = new String[3][3];

        mat[0][0] = "A";
        mat[0][1] = "B";
        mat[0][2] = "C";

        mat[1][0] = "D";
        mat[1][1] = "E";
        mat[1][2] = "F";

        mat[2][0] = "G";
        mat[2][1] = "H";
        mat[2][2] = "J";

        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
                if(j != mat[i].length -1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}
