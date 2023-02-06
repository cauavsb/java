package lista_101;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosConta {
	public static void desejo() {
	    System.out.println("[1] INCLUIR DADOS RELATIVOS A CONTA DE UM CLIENTE");
        System.out.println("[2] SACAR UM DETERMINADO VALOR DE UMA CONTA");
        System.out.println("[3] DEPOSITAR UM DETERMINADO VALOR EM UMA CONTA");
        System.out.println("[4] MOSTRAR O NOVO SALDO DO CLIENTE (CONTA POUPANÇA)");
        System.out.println("[5] MOSTRAR OS DADOS DE TODAS AS CONTAS CADASTRADAS");
	    }
    
    public static void tipo_conta() {
        System.out.println("[1] CONTA POUPANÇA");
        System.out.println("[2] CONTA ESPECIAL");
        System.out.print("QUAL O TIPO DE CONTA? ");
    } 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ContaBancaria> todas_contas = new ArrayList();
        ArrayList<String> todos_NumerosContas = new ArrayList();
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
                    System.out.print("Nome: ");
		            String n=sc.nextLine();
                    System.out.print("Número da conta: ");
		            int num=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Saldo: ");
		            float s=sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Taxa de rendimento: ");
		            float t=sc.nextFloat();
                    sc.nextLine();
                    todas_contas.add(new ContaPoupanca(n,num,s,t));
                }
                else if(opcao==2) {
                    System.out.print("Nome: ");
		            String n=sc.nextLine();
                    System.out.print("Número da conta: ");
		            int num=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Saldo: ");
		            float s=sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Limite: ");
		            float l=sc.nextFloat();
                    sc.nextLine();
                    todas_contas.add(new ContaEspecial(n,num,s,l));
                }
                else {
                    System.out.println("Opção inexistente!");
                }
            }
            else if(resposta==2) {
                System.out.print("Qual o número da conta? ");
			    int num=sc.nextInt();
			    sc.nextLine();
                if(todas_contas.size()==0) {
                    System.out.println("Nenhuma conta foi cadastrada!");
                }
                else {
                    int i=0;
                    for(i=0;i<todas_contas.size();i++) {
                        if(todas_contas.get(i).getNumero_conta()==num) {
                            System.out.print("Qual o valor que você deseja sacar? ");
                            float v=sc.nextFloat();
                            sc.nextLine();
                            if(todas_contas.get(i) instanceof ContaPoupanca) {
                                ContaPoupanca p = (ContaPoupanca) todas_contas.get(i);
                                p.sacar(v);
                            }
                            else if(todas_contas.get(i) instanceof ContaEspecial) {
                                ContaEspecial e = (ContaEspecial) todas_contas.get(i);
                                e.sacar_especial(v);
                            }
                            break;
                        }
                    }
                }
            }
            else if(resposta==3) {
                System.out.print("Qual o número da conta? ");
			    int num=sc.nextInt();
			    sc.nextLine();
                if(todas_contas.size()==0) {
                    System.out.println("Nenhuma conta foi cadastrada!");
                }
                else {
                    int i=0;
                    for(i=0;i<todas_contas.size();i++) {
                        if(todas_contas.get(i).getNumero_conta()==num) {
                            System.out.print("Qual o valor que você deseja depositar? ");
                            float v=sc.nextFloat();
                            sc.nextLine();
                            todas_contas.get(i).depositar(v);
                            break;
                        }
                    }
                }
            }
            else if(resposta==4) {
                System.out.print("Qual o número da conta? ");
			    int num=sc.nextInt();
			    sc.nextLine();
                if(todas_contas.size()==0) {
                    System.out.println("Nenhuma conta foi cadastrada!");
                }
                else {
                    int i=0;
                    for(i=0;i<todas_contas.size();i++) {
                        if(todas_contas.get(i) instanceof ContaPoupanca) {
                            ContaPoupanca p = (ContaPoupanca) todas_contas.get(i);
                            p.calcularNovoSaldo();
                            System.out.println("Com a taxa de rendimento, o novo saldo da conta "+todas_contas.get(i).getNumero_conta()+" é RS "+todas_contas.get(i).getSaldo());
                        }
                    }
                }
            }
            else if(resposta==5) {
                int i=0;
                for(i=0;i<todas_contas.size();i++) {
                    System.out.println("Nome: "+todas_contas.get(i).getNome()+" + Num. Conta: "+todas_contas.get(i).getNumero_conta()+" + Saldo: "+todas_contas.get(i).getSaldo());
                }
            }
            else {
                System.out.println("Opção inexistente!");
            }
        }
    }
}