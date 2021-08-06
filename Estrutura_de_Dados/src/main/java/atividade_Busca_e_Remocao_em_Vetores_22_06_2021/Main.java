/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Busca_e_Remocao_em_Vetores_22_06_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
    static CarroF1[] listaCarros = new CarroF1[10];

    static int pont_ultimo = -1;

    public static void inserirFinal(CarroF1 c) {
        if (pont_ultimo + 1 < listaCarros.length) {
            pont_ultimo++;
            listaCarros[pont_ultimo] = c;
        }
    }

    public static void inserirInicio(CarroF1 c) {
        if (pont_ultimo + 1 <listaCarros.length) {
            for (int i = pont_ultimo; i >= 0; i--) {
                listaCarros[i + 1] = listaCarros[i];
            }
            pont_ultimo++;
            listaCarros[0] = c;
        }
    }

    public static CarroF1 remover(String team){//team = equipe
        int pos_remover = buscar(team);
        if (pos_remover != -1){
            CarroF1 removido = listaCarros[pos_remover];
            System.out.println("Removendo "+ removido.equipe);
            for (int i = pos_remover; i <pont_ultimo; i++) {
                listaCarros[i] = listaCarros[i+1];//deslocamento dos elementos
            }
            listaCarros[pont_ultimo] = null;
            pont_ultimo--;
            System.out.println("Carro removido!");
            return removido;
        }else {
            return null;
        }

    }

    public static int buscar(String equipe) {
        for (int i = 0; i <= pont_ultimo; i++) {
            if (listaCarros[i].equipe.equals(equipe)) {
                System.out.println("Elemento localizado na posicao " + i);
                return i;
            }
        }

        System.out.println("Elemento " + equipe + " nao localizado ");
        return -1;
    }


    public static void mostrarCarros() {
        for (int i = 0; i < pont_ultimo; i++) {
            System.out.println("Carro " + i + " ->"+listaCarros[i].toString());
        }
    }

    //    public static void removerElemento(CarroF1 c){
//       listaCarros[buscar(c.equipe)].piloto1 = null;
//    }
    public static void main(String[] args) {

        CarroF1 c1 = new CarroF1("Mercedes", " Mercedes 1.6 V6", " Pirelli", " Prata", " Hamilton", " Bottas", 650);
        inserirFinal(c1);
        CarroF1 c2 = new CarroF1("Aston Martin", " Mercedes 1.6 V6", " Pirelli", " Verde", " Vettel", " Stroll", 655);
        inserirFinal(c2);
        CarroF1 c3 = new CarroF1("Mclaren", "Mercedes 1.6 V6", "Pirelli", "Amarelo", "Ricciardo", "Norris", 650);
        inserirFinal(c3);
        CarroF1 c4 = new CarroF1("Alpine", "Renault 1.6 V6", "Pirelli", "Preto", "Alonso", "Ocon", 645);
        inserirFinal(c4);
        CarroF1 c5 = new CarroF1("Hass", "Ferrari 1.6 V6", "Pirelli", "Branco", "Schummacher", "Mazepin", 660);
        inserirFinal(c5);

        mostrarCarros();
        System.out.println("Buscar, Piloto 1  " + listaCarros[buscar("Alpine")].piloto1);
        CarroF1 c10 = new CarroF1("Ferrari", "Ferrari 1.6 V6", "Pirelli", "Vermelho", "Sainz", "Leclerc", 630);
        inserirInicio(c10);
        CarroF1 c6 = new CarroF1("Alpha Romeo", "Ferrari 1.6 V6", "Pirelli", "Vermelho", "Raikkonen", "Giovinazzi", 640);
        inserirInicio(c6);
        CarroF1 c7 = new CarroF1("Alpha Tauri", "Honda 1.6 V6", "Pirelli", "Preto e Branco", "Tsunoda", "Gasly", 640);
        inserirInicio(c7);
        CarroF1 c8 = new CarroF1("Williams", "Mercedes 1.6 V6", "Pirelli", "Azul e Vermelho", "Russel", "Latifi", 640);
        inserirInicio(c8);
        CarroF1 c9 = new CarroF1("Red Bull", "Honda 1.6 V6", "Pirelli", "Preto Vermelho", "Verstappen", "Perez", 630);
        inserirInicio(c9);
        mostrarCarros();

        CarroF1 remove = remover("Ferrari");
        if(remove!=null)
        System.out.println("Carro removido: "+remove.toString()+"\n");
        mostrarCarros();
    }
}
