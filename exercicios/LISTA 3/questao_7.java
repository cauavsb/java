import java.util.Scanner;
public class questao_7 {
    static float media(float[] todos_numeros) {
        int tamanho=todos_numeros.length;
        float somador=0.0f;
        int i=0;
        for(i=0;i<tamanho;i++) {
            somador=somador+todos_numeros[i];
        }
        float media=somador/tamanho;
        return media;
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual será o tamanho do seu vetor? ");
    int quant=sc.nextInt();
    sc.nextLine();
    float[] todos_numeros=new float[quant];
    int i=0;
        for(i=0;i<quant;i++) {
        System.out.print("Digite o "+(i+1)+" número do vetor: ");
        int numero=sc.nextInt();
        sc.nextLine();
        todos_numeros[i]=numero;
    }
    System.out.print("A média dos valores contidos no vetor é "+media(todos_numeros));
}
}