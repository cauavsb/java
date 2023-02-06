import java.util.Scanner;
public class questao_2 {
    static String reprovados(float[] notas_1,float[] notas_2,String[] alunos) {
    int i=0;
    float media=0;
    String alunos_reprovados="";
    for(i=0;i<10;i++) {
    media=(notas_1[i]+notas_2[i])/2;
    if(media<7) {
    alunos_reprovados=alunos_reprovados.concat(alunos[i]+"... ");
    }
    }
    return alunos_reprovados;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float nota_1=0;
    float nota_2=0;
    String aluno="";
    String[] alunos=new String[10];
    float[] notas_1=new float[10];
    float[] notas_2=new float[10];
    for(int i=0;i<10;i++) {
    System.out.print("Digite o nome do aluno "+(i+1)+":");
    aluno = sc.nextLine();
    alunos[i]=aluno;
    System.out.print("Digite a primeira nota de "+aluno+": ");
    nota_1 = sc.nextFloat();
    sc.nextLine();
    notas_1[i]=nota_1;
    System.out.print("Digite a segunda nota de "+aluno+": ");
    nota_2 = sc.nextFloat();
    notas_2[i]=nota_2;
    sc.nextLine();
    }
    System.out.println("-> ALUNOS REPROVADOS <-");
    System.out.println(reprovados(notas_1,notas_2,alunos));
    }
}