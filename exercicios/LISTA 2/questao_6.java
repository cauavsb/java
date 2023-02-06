import java.util.Scanner;
import java.util.Arrays;
public class questao_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetor_1=new String[5];
        String[] vetor_2=new String[5];
        for(int i=0;i<5;i++) {  
            System.out.print("Digite um elemento para o vetor 1: ");
            String elemento_1=sc.nextLine();
            vetor_1[i]=elemento_1;
            System.out.print("Digite um elemento para o vetor 2: ");
            String elemento_2=sc.nextLine();
            vetor_2[i]=elemento_2;
        }
        if(Arrays.equals(vetor_1,vetor_2)) {
            System.out.print("Os vetores são iguais!");
        }
        else {
            System.out.print("Os vetores não são iguais!");
        }
    }
}