import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numero[]=new int [20];
            int i;
            int j;
            int aux;
for (int z = 0; z < 20; z++) {
numero[z] = sc.nextInt();
 }
        for(i=0;i<20;i++){
            System.out.println("a[" + i + "] = " +numero[i]);
        }
        System.out.println();

i = 0;
j = numero.length - 1;
        do{
            aux=numero[i];
            numero[i]=numero[j];
            numero[j]=aux;
            i++;
            j--;
        } while(i < j);
        for(j=0;j<20;j++){
            System.out.println("b[" + j + "] = " +numero[j]);
        }
    }
}
