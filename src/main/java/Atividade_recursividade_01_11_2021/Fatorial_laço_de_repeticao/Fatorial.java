package Atividade_recursividade_01_11_2021.Fatorial_laço_de_repeticao;
/**
 *
 * @author geova
 */


public class Fatorial {
    public static final int TAM = 15;
    public static void main(String[] args) {
        long x=TAM,f=TAM;
        while(x>1){
            f = f * (x-1);
            x--;
        }
        System.out.println(f);
    }
}
