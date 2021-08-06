/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Introducao_ao_Java_28_05_2021.Exercicio1;

import java.util.Scanner;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
    public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Valor 1:");
        float v1 = teclado.nextFloat();
        System.out.println("Digite o Valor 2:");
        float v2 = teclado.nextFloat();
        System.out.println("Digite o Valor 3:");
        float v3 = teclado.nextFloat();
        float media;
        media = (v1 + v2 + v3)/3;
        System.out.println(media);

    }
    }
