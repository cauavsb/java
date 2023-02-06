import java.util.Scanner;
public class questao_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento: ");
        int ano_nascimento = sc.nextInt();
        int ano_atual = 2022;
        System.out.println("Idade: "+(ano_atual-ano_nascimento));
    }
}