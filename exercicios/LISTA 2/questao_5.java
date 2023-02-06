import java.util.Scanner;
public class questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Você deseja cadastrar quantas pessoas? ");
        int quant = sc.nextInt();
        String[] pessoas = new String[quant];
        for(int i=0;i<5;i++) {
            System.out.print("Nomne da pessoa "+(i+1)+": ");
            String nome = sc.nextLine();
            pessoas[i]=nome;
        }
        System.out.print("Você quer saber se quem está na lista? ");
        String quem = sc.nextLine();
        if(pessoas.equals(quem)) {
            System.out.print("Essa pessoa está na lista!");
        }
        else {
            System.out.print("Essa pessoa não está na lista!");
        }
    }
}