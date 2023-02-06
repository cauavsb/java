package lista_82;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosConta {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR CONTA");
	    System.out.println("[2] REALIZAR DEPÓSITO");
        System.out.println("[3] REALIZAR SAQUE");
        System.out.println("[4] VERIFICAR SALDO");
        System.out.println("[5] CONSULTAR NÚMERO E NOME DA AGÊNCIA");
        System.out.println("[6] ALTERAR NÚMERO E NOME DA AGÊNCIA");
	    System.out.println("[0] SAIR");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> todas_contas = new ArrayList();
        ArrayList<String> nome_clientes = new ArrayList();
        ArrayList<String> cpfs_clientes = new ArrayList();
        int quantidade_clientes=0;
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
                if(quantidade_clientes<2) {
                    System.out.print("Telefone: ");
		            int t=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Número da agência: ");
				    int num=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome da agência: ");
		            String a=sc.nextLine();
                    System.out.print("Nome: ");
		            String n=sc.nextLine();
                    System.out.print("CPF: ");
				    String numero_cpf=sc.nextLine();
                    System.out.print("Saldo: ");
		            float s=sc.nextFloat();
		            sc.nextLine();
                    cpfs_clientes.add(numero_cpf);
                    nome_clientes.add(n);
		            todas_contas.add(new Conta(t,num,a,n,numero_cpf,s));
                    quantidade_clientes+=1;
                }
                else {
                    System.out.println("Ops... limite máximo de clientes atingido!");
                }
            }
            else if(resposta==2) {
                if(todas_contas.size()==0) {
                    System.out.println("Ops... nenhum cliente foi cadastrado!");
                }
                else {
                    System.out.print("Qual o CPF do cliente? ");
				    String n=sc.nextLine();
                    if(cpfs_clientes.contains(n)) {
                        int i=0;
                        for(i=0;i<todas_contas.size();i++) {
                            if(todas_contas.get(i).getCpf().equals(n)) {
                                System.out.println("Cliente encontrado!");
                                System.out.print("Qual o valor do depósito? ");
				                float v=sc.nextFloat();
                                sc.nextLine();
                                float novo_saldo=todas_contas.get(i).getSaldo()+v;
                                todas_contas.get(i).setSaldo(novo_saldo);
                                System.out.println("Depósito realizado com sucesso!");
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhum cliente com esse CPF foi encontrado!");
                    }
                }
            }
            else if(resposta==3) {
                if(todas_contas.size()==0) {
                    System.out.println("Ops... nenhum cliente foi cadastrado!");
                }
                else {
                    System.out.print("Qual o CPF do cliente? ");
				    String n=sc.nextLine();
                    if(cpfs_clientes.contains(n)) {
                        int i=0;
                        for(i=0;i<todas_contas.size();i++) {
                            if(todas_contas.get(i).getCpf().equals(n)) {
                                System.out.println("Cliente encontrado!");
                                System.out.print("Qual o valor do saque? ");
                                float v=sc.nextFloat();
                                sc.nextLine();
                                if(todas_contas.get(i).getSaldo()>=v) {
                                    float novo_saldo=todas_contas.get(i).getSaldo()-v;
                                    todas_contas.get(i).setSaldo(novo_saldo);
                                    System.out.println("Saque realizado com sucesso!");
                                    break;
                                }
                                else {
                                    System.out.println("Saldo insuficiente!");
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhum cliente com esse CPF foi encontrado!");
                    }
                }
            }
            else if(resposta==4) {
                if(todas_contas.size()==0) {
                    System.out.println("Ops... nenhum cliente foi cadastrado!");
                }
                else {
                    System.out.print("Qual o CPF do cliente? ");
				    String n=sc.nextLine();
                    if(cpfs_clientes.contains(n)) {
                        int i=0;
                        for(i=0;i<todas_contas.size();i++) {
                            if(todas_contas.get(i).getCpf().equals(n)) {
                                System.out.println("Cliente encontrado!");
                                System.out.println("Saldo: R$ "+todas_contas.get(i).getSaldo());
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhum cliente com esse CPF foi encontrado!");
                    }
                }
            }
            else if(resposta==5) {
                if(todas_contas.size()==0) {
                    System.out.println("Ops... nenhum cliente foi cadastrado!");
                }
                else {
                    System.out.print("Qual o CPF do cliente? ");
				    String n=sc.nextLine();
                    if(cpfs_clientes.contains(n)) {
                        int i=0;
                        for(i=0;i<todas_contas.size();i++) {
                            if(todas_contas.get(i).getCpf().equals(n)) {
                                System.out.println("Cliente encontrado!");
                                System.out.println("Nome: "+todas_contas.get(i).getCliente());
                                System.out.println("CPF: "+todas_contas.get(i).getCpf());
                                System.out.println("Número da agência: "+todas_contas.get(i).getNumero());
                                System.out.println("Nome da agência: "+todas_contas.get(i).getAgencia());
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhum cliente com esse CPF foi encontrado!");
                    }
                }
            }
            else if(resposta==6) {
                if(todas_contas.size()==0) {
                    System.out.println("Ops... nenhum cliente foi cadastrado!");
                }
                else {
                    System.out.print("Qual o nome do cliente? ");
				    String n=sc.nextLine();
                    if(nome_clientes.contains(n)) {
                        int i=0;
                        for(i=0;i<todas_contas.size();i++) {
                            if(todas_contas.get(i).getCliente().equals(n)) {
                                System.out.println("Cliente encontrado!");
                                System.out.print("Qual o novo número da agênica? ");
                                int novo_numero=sc.nextInt();
                                sc.nextLine();
                                todas_contas.get(i).setNumero(novo_numero);
                                System.out.print("Qual o novo nome da agênica? ");
                                String novo_nome=sc.nextLine();
                                todas_contas.get(i).setAgencia(novo_nome);
                                System.out.println("Dados alterados com sucessso!");
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhum cliente com esse CPF foi encontrado!");
                    }
                }
            }
            else {
                System.out.println("Banco fechado!");
                break;
            }
        }
    }
}