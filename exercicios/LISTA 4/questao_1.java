import java.util.Scanner;
public class questao_1 { 
    static String verificacao(String[] funcionarios,float[] salarios) {
        String pessoa="";
        int quant=funcionarios.length;
        for(int i=0;i<quant;i++) {
            if(salarios[i]>5000) {
            pessoa=pessoa.concat(funcionarios[i]+"... ");
            }
        }
        return pessoa;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o número de funcionários? ");
        int func=sc.nextInt();
        sc.nextLine();
        String[] funcionarios=new String[func];
        float[] salarios=new float[func];
        for(int i=0;i<func;i++) {
            System.out.print("Nome: ");
            String funcionario=sc.nextLine();
            funcionarios[i]=funcionario;
            System.out.print("Salario: ");
            float salario=sc.nextFloat();
            sc.nextLine();
            salarios[i]=salario;
        }
        System.out.println("-> FUNCIONÁRIOS QUE RECEBEM MAIS QUE 5000 <-");
        System.out.println(verificacao(funcionarios,salarios));
    }
}