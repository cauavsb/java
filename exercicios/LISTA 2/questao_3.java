import java.util.Scanner;
public class questao_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        float somador=0;
        float media=0;
        int acima=0;
        float[] notas=new float[10];
        for(i=0;i<10;i++) {
            System.out.print("Digite a nota do aluno "+(i+1)+": ");
            float nota = sc.nextFloat();
            somador+=nota;
            notas[i]=nota;
        }
        media=somador/10;
        for(int c=0;c<10;c++) {
            if(notas[c]>media){
                acima+=1;
            }
        }
        System.out.print(acima+" alunos ficaram acima da média geral.");
    }
}