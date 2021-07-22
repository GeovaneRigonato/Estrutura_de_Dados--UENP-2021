/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Busca_e_Remocao_em_Vetores_22_06_2021;

/**
 *
 * @author geovane_rigonato
 */
public class CarroF1 {
        String equipe;
    String fabricanteMotor;
    String pneus;
    String corPredominante;
    String piloto1;
    String piloto2;
    float peso;

    public CarroF1(String equipe, String fabricanteMotor, String pneus, String corPredominante, String piloto1, String piloto2, float peso) {
        this.equipe = equipe;
        this.fabricanteMotor = fabricanteMotor;
        this.pneus = pneus;
        this.corPredominante = corPredominante;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.peso = peso;
    }

    public String toString(){
        return "Equipe: "+this.equipe+" Fabricante do motor: "+this.fabricanteMotor+" Pneus: "+this.pneus+" Cor predominante: "+this.corPredominante+" Piloto 1: "+this.piloto1+" Piloto 2: "+this.piloto2 +" Peso: "+this.peso;
    }
}
