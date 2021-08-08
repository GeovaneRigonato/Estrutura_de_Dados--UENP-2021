/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_avaliativa_Lista_1_26_07_2021.Ex8;

/**
 *
 * @author geovane_rigonato
 */

public class Conta {

    private String nomeTitular;
    private Integer numeroConta;
    private Integer numeroAgencia;
    private float saldoConta;

    public Conta() {
        this.nomeTitular = "";
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.saldoConta = 0;
    }

    public Conta(String nomeTitular, Integer numeroConta, Integer numeroAgencia) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldoConta = 0;
    }
    
    public  void adicionarDinheiro(float saldo){
        this.saldoConta = saldo;
    }
     public  void retirarDinheiro(float saldo){
        this.saldoConta = saldoConta-saldo;
    }
        public String toString(){
            return "Nome: "+this.nomeTitular+ " Nº: "+this.numeroConta;
        }
    

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

}
