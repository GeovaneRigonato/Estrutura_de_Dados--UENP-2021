/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Introducao_ao_Java_28_05_2021.Exercicio2;

import java.util.Scanner;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
    public static void main(String[] args) {
                    Scanner teclado = new Scanner(System.in);
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        System.out.println("Carro -> 1");
            System.out.println("Digite a marca: ");
            String Marca = teclado.next();
            System.out.println("Digite o modelo: ");
            String Modelo = teclado.next();
            System.out.println("Digite o Ano de fabricação: ");
            int AnoDeFabricacao = teclado.nextInt();
            System.out.println("Digite o Numero de portas: ");
            int NumPortas = teclado.nextInt();

            carro.AtribuirMarca(Marca);
            carro.AtribuirModelo(Modelo);
            carro.atribuirAno(AnoDeFabricacao);
            carro.atribuirNumPortas(NumPortas);

        System.out.println("Carro -> 2");
        System.out.println("Digite a marca: ");
        String Marca1 = teclado.next();
        System.out.println("Digite o modelo: ");
        String Modelo1 = teclado.next();
        System.out.println("Digite o Ano de fabricação: ");
        int AnoDeFabricacao1 = teclado.nextInt();
        System.out.println("Digite o Numero de portas: ");
        int NumPortas1 = teclado.nextInt();

        carro1.AtribuirMarca(Marca1);
        carro1.AtribuirModelo(Modelo1);
        carro1.atribuirAno(AnoDeFabricacao1);
        carro1.atribuirNumPortas(NumPortas1);

        System.out.println("Carro -> 3");
        System.out.println("Digite a marca: ");
        String Marca2 = teclado.next();
        System.out.println("Digite o modelo: ");
        String Modelo2 = teclado.next();
        System.out.println("Digite o Ano de fabricação: ");
        int AnoDeFabricacao2 = teclado.nextInt();
        System.out.println("Digite o Numero de portas: ");
        int NumPortas2 = teclado.nextInt();

        carro2.AtribuirMarca(Marca2);
        carro2.AtribuirModelo(Modelo2);
        carro2.atribuirAno(AnoDeFabricacao2);
        carro2.atribuirNumPortas(NumPortas2);

        System.out.println("     Marca: " + carro.VerMarca());
        System.out.println("     Modelo: " + carro.VerModelo());
        System.out.println("     Ano de Fabricação: " + carro.verAno());
        System.out.println("     Numero de portas: " + carro.verNumportas());
        System.out.println("\n");
        System.out.println("     Marca: " + carro1.VerMarca());
        System.out.println("     Modelo: " + carro1.VerModelo());
        System.out.println("     Ano de Fabricação: " + carro1.verAno());
        System.out.println("     Numero de portas: " + carro1.verNumportas());
        System.out.println("\n");
        System.out.println("     Marca: " + carro2.VerMarca());
        System.out.println("     Modelo: " + carro2.VerModelo());
        System.out.println("     Ano de Fabricação: " + carro2.verAno());
        System.out.println("     Numero de portas: " + carro2.verNumportas());



        }
    }
