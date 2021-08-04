/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_avaliativa_Lista_1_26_07_2021.Ex8;

/**
 *
 * @author geovane_rigonato
 */

/*Crie um algoritmo que armazene dados de várias contas bancárias em uma lista
utilizando um vetor, sabendo que uma conta é composta das seguintes
informações: nomeTitular, numeroConta, numeroAgencia, saldoConta. Crie um
método para cadastrar os dados de uma conta, um método para buscar uma
conta a partir do nome do titular e outros dois métodos para depositar e retirar
dinheiro destas contas-correntes.*/
public class Main {

    static Conta[] contas = new Conta[10];
    static int pont_ultimo = -1;

    public static void cadastrar(Conta c) {
        if (pont_ultimo + 1 < contas.length) {
            pont_ultimo++;
            contas[pont_ultimo] = c;
        }
    }
    
        public static int buscar(String nomeTitular) {
        for (int i = 0; i <= pont_ultimo; i++) {
            if (contas[i].getNomeTitular().equals(nomeTitular)) {
                System.out.println("Elemento localizado na posicao " + i);
                return i;
            }
        }

        System.out.println("Elemento " + nomeTitular + " nao localizado ");
        return -1;
    }

    public static void main(String[] args) {

        Conta c1 = new Conta("Geovane", 1111, 0001);
        cadastrar(c1);
        Conta c2 = new Conta("João", 2222, 0002);
        cadastrar(c2);
        Conta c3 = new Conta("Camilo", 3333, 0003);
        cadastrar(c3);
        Conta c4 = new Conta("Jorge", 4444, 0004);
        cadastrar(c4);
        Conta c5 = new Conta("Cascão", 5555, 0005);
        cadastrar(c5);
        buscar("João");
        
    }
}
