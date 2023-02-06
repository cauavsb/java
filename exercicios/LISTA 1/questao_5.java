import java.util.Scanner;
public class questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor_imc=0;
        float peso=0;
        float altura=0;
        int abaixo=0;
        int acima=0;
        int ideal=0;
        float[] imc=new float[5];
        for(int i=0;i<5;i++) {
            System.out.print("Digite o peso da pessoa "+(i+1)+":");
            peso = sc.nextFloat();
            sc.nextLine();
            System.out.print("Digite o altura da pessoa "+(i+1)+":");
            altura = sc.nextFloat();
            sc.nextLine();
            valor_imc=(peso/(altura*altura));
            imc[i]=valor_imc;
        }
        for(int i=0;i<5;i++) {
            if(imc[i]<18.5) {
                abaixo = abaixo + 1;
            }
            else if(imc[i]>=18.5 && imc[i]<25) {
                ideal = ideal + 1;
            }
            else {
                acima = acima + 1;
            }
        }
        System.out.println("Número de pessoas que estão abaixo do peso: "+abaixo);
        System.out.println("Número de pessoas que estão dentro do peso ideal: "+ideal);
        System.out.println("Número de pessoas que estão acima do peso: "+acima);
    }
}