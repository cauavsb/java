import java.util.Scanner;
public class questao_3 {
    static String imc(float[] pesos,float[] alturas,String[] pessoas) {
    int i=0;
    float imc=0;
    String acima="";
    int tamanho=pessoas.length;
    for(i=0;i<tamanho;i++) {
    imc=pesos[i]/(alturas[i]*alturas[i]);
    if(imc>=25) {
    acima=acima.concat(pessoas[i]+"... ");
    }
    }
    return acima;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float peso=0;
    float altura=0;
    String nome="";
    System.out.print("Qual a quantidade de pessoas? ");
    int numero_pessoas=sc.nextInt();
    sc.nextLine();
    String[] pessoas=new String[numero_pessoas];
    float[] pesos=new float[numero_pessoas];
    float[] alturas=new float[numero_pessoas];
    for(int i=0;i<numero_pessoas;i++) {
    System.out.print("Digite o nome da pessoa "+(i+1)+":");
    nome = sc.nextLine();
    pessoas[i]=nome;
    System.out.print("Digite o peso da pessoa "+(i+1)+":");
    peso = sc.nextFloat();
    sc.nextLine();
    pesos[i]=peso;
    System.out.print("Digite o altura da pessoa "+(i+1)+":");
    altura = sc.nextFloat();
    alturas[i]=altura;
    sc.nextLine();
    }
    System.out.println("-> PESSOAS ACIMA DO PESO <-");
    System.out.println(imc(pesos,alturas,pessoas));
    }
}