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
public class Vetor {
    private Conta[] contas;
    private static final int TAM = 10;
    
    
 public Vetor(){
        contas = new Conta[TAM];
        for (int i = 0; i < TAM; i++) {
            contas[i] = new Conta (i+1);
        }
    }
}
