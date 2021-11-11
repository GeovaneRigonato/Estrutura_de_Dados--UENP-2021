package Atividade_recursividade_01_11_2021.Fibonacci_laço_de_repeticao;
/**
 *
 * @author geova
 */


public class Fibonacci {
    public static final int TAM = 15;

    static int f(int n){
        if(n==1){
            return 0;
        }if(n==2){
            return 1;
        }
        int f=0,f1=0,f2=1;
        for (int i = 3; i <= n; i++) {
            f = f1+f2;
            f1 = f2;
            f2 = f;
        }return f;
    }
    public static void main(String[] args) {
        for (int i = 1; i <=TAM ; i++) {
            System.out.print(f(i));
            if(i != TAM){
                System.out.print(" | ");
            }

        }
    }
}
