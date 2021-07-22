/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Introducao_ao_Java_28_05_2021.Exercicio2;

/**
 *
 * @author geovane_rigonato
 */
public class Carro {
    String Marca;
    String Modelo;
    int AnoDeFabricacao;
    int NumPortas;

    public void AtribuirMarca(String n){
        this.Marca = n;
    }

    public String VerMarca(){
        return this.Marca;
    }

    public void AtribuirModelo(String n){
        this.Modelo = n;
    }

    public String VerModelo(){
        return this.Modelo;
    }

    public void atribuirAno(int ano){
        this.AnoDeFabricacao = ano;
    }

    public float verAno(){
        return this.AnoDeFabricacao;
    }

    public void atribuirNumPortas(int num){
        this.NumPortas = num;
    }

    public float verNumportas(){
        return this.NumPortas;
    }
}
