package lista_61;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosFuncionario {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR UM FUNCIONÁRIO");
	    System.out.println("[2] EXIBIR OS FUNCIONÁRIOS DE ALTA RENDA");
	    System.out.println("[0] SAIR");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Funcionario> todos_funcionarios = new ArrayList();
        int mais=0;
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
                System.out.print("Nome: ");
				String n=sc.nextLine();
                System.out.print("Salário: ");
				float s=sc.nextFloat();
				sc.nextLine();
                if(s>5000) {
                    mais+=1;
                }
				todos_funcionarios.add(new Funcionario(n,s));
				System.out.println("Funcionário cadastrado!");
            }
            else if(resposta==2) {
                if(todos_funcionarios.size()==0) {
                    System.out.println("Não há funcionário cadastrado!");
                }
                else if(todos_funcionarios.size()==1) {
                    if(mais==1) {
                        System.out.println("Apenas "+todos_funcionarios.get(0).nome_alta_renda()+" foi cadastrado! Entretanto, ele possuí alta renda.");
                    }
                    else {
                        System.out.println("Apenas "+todos_funcionarios.get(0).nome_alta_renda()+" foi cadastrado! Entretanto, ele não possuí alta renda.");
                    }
                }
                else {
                    if(mais==0) {
                        System.out.println("Nenhum dos funcionários cadastrados possuí alta renda!");
                    }
                    else if(mais==1) {
                        int i=0;
                        for(i=0;i<todos_funcionarios.size();i++) {
                            if(todos_funcionarios.get(i).alta_renda()>5000) {
                                System.out.println("Apenas "+todos_funcionarios.get(i).nome_alta_renda()+" possuí alta renda!");
                                break;
                            }
                        }
                    }
                    else {
                        int i=0;
                        System.out.println("-> FUNCIONÁRIOS DE ALTA RENDA <-");
                        for(i=0;i<todos_funcionarios.size();i++) {
                            if(todos_funcionarios.get(i).alta_renda()>5000) {
                                System.out.println(todos_funcionarios.get(i).nome_alta_renda());
                            }
                        }
                    }
                }
            }
            else {
                break;
            }
        }
    }
}