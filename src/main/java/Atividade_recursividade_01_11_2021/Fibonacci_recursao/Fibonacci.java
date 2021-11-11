package Atividade_recursividade_01_11_2021.Fibonacci_recursao;
/**
 *
 * @author geova
 */


public class Fibonacci {
    static int f(int n) {
        if (n == 1 | n == 2) {
            return 1;
        } else return  f(n - 1) + f(n - 2);
    }
    public static void main(String[] args) {
        int n = 10;
        int f;
        for (int i = 1; i <=n ; i++) {
            System.out.println(f(i));
        }
    }


}
