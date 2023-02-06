package lista_73;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosConta {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR CONTA");
	    System.out.println("[2] REALIZAR DEPÓSITO");
        System.out.println("[3] REALIZAR SAQUE");
        System.out.println("[4] VERIFICAR SALDO");
        System.out.println("[5] CONSULTAR CLIENTE");
	    System.out.println("[0] SAIR");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> todas_contas = new ArrayList();
        ArrayList<String> nome_clientes = new ArrayList();
        ArrayList<String> numeros_das_contas = new ArrayList();
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
                System.out.print("Número: ");
				String num=sc.nextLine();
                System.out.print("Agência: ");
		        int a=sc.nextInt();
                sc.nextLine();
                System.out.print("Nome: ");
		        String n=sc.nextLine();
                System.out.print("CPF: ");
				int numero_cpf=sc.nextInt();
                sc.nextLine();
                System.out.print("Saldo: ");
		        float s=sc.nextFloat();
		        sc.nextLine();
                numeros_das_contas.add(num);
                nome_clientes.add(n);
		        todas_contas.add(new Conta(num,a,n,numero_cpf,s));
            }
            else if(resposta==2) {
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
                        System.out.println("Nenhum cliente com esse nome foi encontrado!");
                    }
                }
            }
            else if(resposta==3) {
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
                        System.out.println("Nenhum cliente com esse nome foi encontrado!");
                    }
                }
            }
            else if(resposta==4) {
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
                                System.out.println("Saldo: R$ "+todas_contas.get(i).getSaldo());
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhum cliente com esse nome foi encontrado!");
                    }
                }
            }
            else if(resposta==5) {
                if(todas_contas.size()==0) {
                    System.out.println("Ops... nenhum cliente foi cadastrado!");
                }
                else {
                    System.out.print("Qual o número da conta do cliente? ");
				    String n=sc.nextLine();
                    if(numeros_das_contas.contains(n)) {
                        int i=0;
                        for(i=0;i<todas_contas.size();i++) {
                            if(todas_contas.get(i).getNumero().equals(n)) {
                                System.out.println("Cliente encontrado!");
                                System.out.println("Nome: "+todas_contas.get(i).getCliente());
                                System.out.println("CPF: "+todas_contas.get(i).getCpf());
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhum cliente com essa conta foi encontrado!");
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