package lista_102;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosAnimal {
	public static void desejo() {
	    System.out.println("[1] INCLUIR DADOS RELATIVOS A UM PEIXE");
        System.out.println("[2] INCLUIR DADOS RELATIVOS A UM MAMÍFERO");
        System.out.println("[3] LISTAR TODOS OS ANIMAIS CADASTRADOS");
        System.out.println("[4] LISTAR TODOS OS PEIXES CADASTRADOS");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Animal> todos_animais = new ArrayList();
        int num_peixes=0;
        int num_mamiferos=0;
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
            if(resposta==1) {
                System.out.print("Nome: ");
		        String n=sc.nextLine();
                System.out.print("Comprimento: ");
		        float c=sc.nextFloat();
                sc.nextLine();
                System.out.print("Velocidade: ");
		        String v=sc.nextLine();
                System.out.print("Número de barbatanas: ");
		        int b=sc.nextInt();
                sc.nextLine();
                System.out.print("Comprimento da calda: ");
		        float calda=sc.nextFloat();
                sc.nextLine();
                todos_animais.add(new Peixe(n,c,0,"cinzento","mar",v,b,calda));
                num_peixes+=1;
            }
            else if(resposta==2) {
                System.out.print("Nome: ");
		        String n=sc.nextLine();
                System.out.print("Comprimento: ");
		        float com=sc.nextFloat();
                sc.nextLine();
                System.out.print("Cor: ");
		        String c=sc.nextLine();
                System.out.print("Velocidade: ");
		        String v=sc.nextLine();
                System.out.print("Alimento preferido: ");
		        String a=sc.nextLine();
                todos_animais.add(new Mamifero(n,com,4,c,"terra",v,a));
                num_mamiferos+=1;
            }
            else if(resposta==3) {
                if(todos_animais.size()>0) {
                    int i=0;
                    for(i=0;i<todos_animais.size();i++) {
                        if(todos_animais.get(i) instanceof Peixe) {
                            Peixe p = (Peixe) todos_animais.get(i);
                            System.out.println("Nome: "+p.getNome()+" -> Comprimento: "+p.getComprimento()+" -> Velocidade: "+p.getVelocidade());
                        }
                        else if(todos_animais.get(i) instanceof Mamifero) {
                            Mamifero m = (Mamifero) todos_animais.get(i);
                            System.out.println("Nome: "+m.getNome()+" -> Comprimento: "+m.getComprimento()+" -> Velocidade: "+m.getVelocidade());
                        }
                    }
                }
                else {
                    System.out.println("Nenhum animal foi cadastrado!");
                }
            }
            else if(resposta==4) {
                if(num_peixes>0) {
                    int i=0;
                    for(i=0;i<todos_animais.size();i++) {
                        if(todos_animais.get(i) instanceof Peixe) {
                            Peixe p = (Peixe) todos_animais.get(i);
                            System.out.println("Nome: "+p.getNome()+" -> Comprimento: "+p.getComprimento()+" -> Velocidade: "+p.getVelocidade());
                        }
                    }
                }
                else {
                    System.out.println("Nenhum peixe foi cadastrado!");
                }
            }
            else {
                System.out.println("Opção inexistente!");
            }
        }
    }
}