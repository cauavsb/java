import java.util.Scanner;
public class questao_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Esses são todos os números pares entre 0 e 30: ");
        for(i = 0; i <= 30; i += 2) {
            System.out.println(i);
        }
    }		
}