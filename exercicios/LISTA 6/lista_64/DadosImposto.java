package lista_64;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosImposto {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR UM FUNCIONÁRIO");
	    System.out.println("[2] CALCULAR IMPOSTO");
	    System.out.println("[0] SAIR");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Imposto> todos_funcionarios = new ArrayList();
        ArrayList<String> nome_todos = new ArrayList();
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
                nome_todos.add(n);
				todos_funcionarios.add(new Imposto(n,s));
				System.out.println("Funcionário cadastrado!");
            }
            else if(resposta==2) {
                if(todos_funcionarios.size()>0) {
                    System.out.print("Digite o nome do funcionário: ");
                    String func=sc.nextLine();
                    int i=0;
                    if(nome_todos.contains(func)) {
                        for(i=0;i<todos_funcionarios.size();i++) {
                            if(todos_funcionarios.get(i).getNome().equals(func)) {
                                if(todos_funcionarios.get(i).getSalario()<=2000) {
                                    System.out.println("Isento de imposto!");
                                    break;
                                }
                                else if(todos_funcionarios.get(i).getSalario()>2000 && todos_funcionarios.get(i).getSalario()<=3500) {
                                    System.out.println(todos_funcionarios.get(i).getNome()+" deve pagar "+todos_funcionarios.get(i).getSalario()*0.15+" de imposto.");
                                    break;
                                }
                                else if(todos_funcionarios.get(i).getSalario()>3500 && todos_funcionarios.get(i).getSalario()<=5000) {
                                    System.out.println(todos_funcionarios.get(i).getNome()+" deve pagar "+todos_funcionarios.get(i).getSalario()*0.22+" de imposto.");
                                    break;
                                }
                                else {
                                    System.out.println(todos_funcionarios.get(i).getNome()+" deve pagar "+todos_funcionarios.get(i).getSalario()*0.3+" de imposto.");
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Não existe funcionário com este nome!");
                    }
                }
                else {
                    System.out.println("Não há funcionário cadastrado!");
                }
            }
            else {
                break;
            }
        }
    }
}