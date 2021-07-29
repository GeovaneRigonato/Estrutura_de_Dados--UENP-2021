package Atividade_avaliativa_Lista_1_26_07_2021;

public class Ex3 {
        public static final int TAM = 20;
    public static void main(String[] args) {

        int vetor[] = new int[TAM];
        for (int i = 1; i < TAM+1; i++) {
            int pos = i-1;
            vetor[pos] = i;
            System.out.println("a[" + pos + "] = " + vetor[pos]);
        }
        System.out.println();
        System.out.println("Copiando de um vetor para o outro..............\n");
        int vetor1[] = vetor.clone();
        for (int i = 0; i < TAM; i++) {
            System.out.println("b[" + i + "] = " + vetor1[i]);
        }
    }
}

