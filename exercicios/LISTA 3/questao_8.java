import java.util.Scanner;
public class questao_8 {
    static String mais_velha(String[] nomes,int[] idades) {
        int i=0;
        int maior_idade=0;
        String nome_mais_velha="";
        for(i=0;i<10;i++) {
        if(idades[i]>maior_idade) {
            maior_idade=idades[i];
            nome_mais_velha=nomes[i];
        }
        }
        return nome_mais_velha;
        }

    static String mais_nova(String[] nomes,int[] idades) {
        int i=0;
        int menor_idade=0;
        String nome_mais_nova="";
        for(i=0;i<10;i++) {
        if(i==0) {
            menor_idade=idades[0];
            nome_mais_nova=nomes[0];
        }
        else if(idades[i]<menor_idade) {
            menor_idade=idades[i];
            nome_mais_nova=nomes[i];
        }
        }
        return nome_mais_nova;
        }

    static int maiores(int[] idades) {
        int cont=0;
        int i=0;
        for(i=0;i<10;i++) {
        if(idades[i]>18) {
            cont=cont+1;
        } 
        }
        return cont;
        }
            
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    String[] nomes=new String[10];
    int[] idades=new int[10];
    for(int i=0;i<10;i++) {
    System.out.print((i+1)+"."+" Nome: ");
    String nome=sc.nextLine();
    nomes[i]=nome;
    System.out.print((i+1)+"."+" Idade: ");
    int idade=sc.nextInt();
    sc.nextLine();
    idades[i]=idade;
    }
    System.out.println("Pessoa mais velha: "+mais_velha(nomes,idades));
    System.out.println("Pessoa mais nova: "+mais_nova(nomes,idades));
    System.out.println("Número de pessoas maiores de 18 anos: "+maiores(idades));
}
}