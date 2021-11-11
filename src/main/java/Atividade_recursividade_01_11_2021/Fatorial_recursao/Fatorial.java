package Atividade_recursividade_01_11_2021.Fatorial_recursao;
/**
 *
 * @author geova
 */


public class Fatorial {
    static long f(int n){
        if(n==0 | n==1){
            return 1;
        }else return n * f(n-1);
    }
    public static void main(String[] args) {
        System.out.println(f(15));
    }
}
