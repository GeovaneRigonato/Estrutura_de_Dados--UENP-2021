/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Media_notas_24_05_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Aluno {
        String nome;
    float mediaAlunos;

    public void atribuirNota(float nota){
        this.mediaAlunos = nota;
    }

    public float vernota(){
        return this.mediaAlunos;
    }

    public String verNome(){
        return this.nome;
    }

    public void atribuirNome(String n){
        this.nome = n;
    }

    public void atribuirNome() {
    }
}
