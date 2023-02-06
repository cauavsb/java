package questao_prova;
import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR CONTA OU POUPANÇA");
        System.out.println("[2] REALIZAR DEPÓSITO");
        System.out.println("[3] RENDER JUROS");
        System.out.println("[4] CONSULTAR NOME E CPF DO CLIENTE PELO NÚMERO DA AGÊNCIA");
        System.out.println("[5] ALTERAR NÚMERO E NOME DA AGÊNCIA");
        System.out.println("[0] SAIR");
	    }
    
    public static void tipo_conta() {
        System.out.println("[1] CONTA");
        System.out.println("[2] POUPANÇA");
        System.out.print("QUAL O TIPO DE CONTA? ");
    } 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> todas_contas = new ArrayList();
        ArrayList<String> todos_cpf = new ArrayList();
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
            if(resposta==1) {
                tipo_conta();
                int opcao=sc.nextInt();
                sc.nextLine();
                if(opcao==1) {
                    System.out.print("Número: ");
		            int num=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Número da agência: ");
		            int num_agencia=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome da agência: ");
		            String nome_agencia=sc.nextLine();
                    System.out.print("Nome do cliente: ");
		            String nome_cliente=sc.nextLine();
                    System.out.print("CPF do cliente: ");
		            String cpf_cliente=sc.nextLine();
                    System.out.print("Saldo: ");
		            float s=sc.nextFloat();
                    sc.nextLine();
                    todos_cpf.add(cpf_cliente);
                    todas_contas.add(new Conta(num,new Banco(num_agencia,nome_agencia),new Cliente(nome_cliente,cpf_cliente),s));
                }
                else if(opcao==2) {
                    System.out.print("Número: ");
		            int num=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Número da agência: ");
		            int num_agencia=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome da agência: ");
		            String nome_agencia=sc.nextLine();
                    System.out.print("Nome do cliente: ");
		            String nome_cliente=sc.nextLine();
                    System.out.print("CPF do cliente: ");
		            String cpf_cliente=sc.nextLine();
                    System.out.print("Saldo: ");
		            float s=sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Taxa de juros: ");
		            float t=sc.nextFloat();
                    sc.nextLine();
                    todos_cpf.add(cpf_cliente);
                    todas_contas.add(new Poupanca(num,new Banco(num_agencia,nome_agencia),new Cliente(nome_cliente,cpf_cliente),s,t));
                }
                else {
                    System.out.println("Opção inexistente!");
                }
            }
            else if(resposta==2) {
                System.out.print("Qual o número do CPF do cliente? ");
                String num=sc.nextLine();
                if(todos_cpf.contains(num)) {
                    int i=0;
                    for(i=0;i<todas_contas.size();i++) {
                        if(todas_contas.get(i).getDados_cliente().getCpf().equals(num)) {
                            System.out.print("Qual o valor do depósito? ");
                            float deposito=sc.nextFloat();
                            sc.nextLine();
                            float novo_saldo=todas_contas.get(i).getSaldo()+deposito;
                            todas_contas.get(i).setSaldo(novo_saldo);
                            System.out.println("Depósito realizado com sucesso!");
                            break;
                        } 
                    }
                }
                else {
                    System.out.println("Não existe cadastro para esse CPF!");
                }
            }
            else if(resposta==3) {
                System.out.print("Qual o número do CPF do cliente? ");
                String num=sc.nextLine();
                if(todos_cpf.contains(num)) {
                    int i=0;
                    for(i=0;i<todas_contas.size();i++) {
                        if(todas_contas.get(i) instanceof Poupanca) {
                            Poupanca p=(Poupanca) todas_contas.get(i);
                            if(todas_contas.get(i).getDados_cliente().getCpf().equals(num)) {  
                                float novo_saldo=p.renderJuros(p.getSaldo(),p.getJuros());
                                p.setSaldo(novo_saldo);
                                System.out.println("Seu novo saldo é: "+todas_contas.get(i).getSaldo());
                                break;
                            } 
                        }
                    }
                    System.out.println("OBS. Caso não tenha sido mostrado nada, a conta NÃO É poupança!");
                }
                else {
                    System.out.println("Não existe cadastro para esse CPF!");
                }
            }
            else if(resposta==4) {
                System.out.print("Qual o número da agência do cliente? ");
                int num=sc.nextInt();
                sc.nextLine();
                int i=0;
                for(i=0;i<todas_contas.size();i++) {
                    if(todas_contas.get(i).getDados_banco().getNumero_agencia()==num) {
                        System.out.println("Nome: "+todas_contas.get(i).getDados_cliente().getNome()+" -> CPF: "+todas_contas.get(i).getDados_cliente().getCpf());
                    }
                }
                System.out.println("OBS. Caso não tenha sido mostrado nada, o número de agência informado não existe!");
            }
            else if(resposta==5) {
                System.out.print("Qual o nome do cliente? ");
                String nome=sc.nextLine();
                int i=0;
                for(i=0;i<todas_contas.size();i++) {
                    if(todas_contas.get(i).getDados_cliente().getNome().equals(nome)) {
                        System.out.print("Qual o novo número da agência? ");
		                int novo_num_agencia=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Qual o novo nome da agência? ");
		                String novo_nome_agencia=sc.nextLine();
                        todas_contas.get(i).getDados_banco().setNumero_agencia(novo_num_agencia);
                        todas_contas.get(i).getDados_banco().setNome_agencia(novo_nome_agencia);
                        System.out.println("Alteração feita com sucesso!");
                    }
                }
                System.out.println("OBS. Caso não tenha sido mostrado nada, o cliente informado não existe!");
            }
            else if(resposta==0) {
                System.out.println("Programa finalizado...");
                break;
            }
            else {
                System.out.println("Opção inexistente!");
            }
        }
    }
}