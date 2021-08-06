/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Media_notas_24_05_2021;

import java.util.Scanner;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
    public static void main(String[] args) {
                //receber dados do teclado --> precisamos abrir um "stream" que acessa o teclado (System.in")

        Scanner teclado = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno aluno = new Aluno();


        a1.atribuirNome("Geovane");
        a1.atribuirNota(7.8f);

        a2.atribuirNome("Rafaela");
        a2.atribuirNota(10.0f);

        a3.atribuirNome("Gustavo");
        a3.atribuirNota(9.3f);

        a4.atribuirNome("Luciana");
        a4.atribuirNota(8.5f);

        a5.atribuirNome("Miguel");
        a5.atribuirNota(7.9f);


        System.out.println("Digite quantos alunos gostaria de preencher: ");
            int quantidade = teclado.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.println("Digite o nome: ");
            String name = teclado.next();
            System.out.println("Digite a nota: ");
            float note = teclado.nextFloat();
            aluno.atribuirNome(name);
            aluno.atribuirNota(note);


        }
        System.out.println(a1.verNome()+" - nota: "+a1.vernota()+"\n");
        System.out.println(a2.verNome()+" - nota: "+a2.vernota()+"\n");
        System.out.println(a3.verNome()+" - nota: "+a3.vernota()+"\n");
        System.out.println(a4.verNome()+" - nota: "+a4.vernota()+"\n");
        System.out.println(a5.verNome()+" - nota: "+a5.vernota()+"\n");
        System.out.println(aluno.verNome()+" - nota: "+aluno.vernota()+"\n");


    }
    }
