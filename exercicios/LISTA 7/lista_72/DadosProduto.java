package lista_72;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosProduto {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR PRODUTO");
	    System.out.println("[2] BUSCAR PRODUTO PELO NOME");
        System.out.println("[3] LISTAR TODOS OS PRODUTOS");
        System.out.println("[4] EFETUAR VENDA DE PRODUTO");
	    System.out.println("[0] SAIR DA LIVRARIA");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> todos_produtos = new ArrayList();
        ArrayList<String> nome_produtos = new ArrayList();
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
                System.out.print("Nome: ");
				String n=sc.nextLine();
                System.out.print("Codigo: ");
		        int c=sc.nextInt();
                sc.nextLine();
                System.out.print("Preço: ");
		        float p=sc.nextFloat();
		        sc.nextLine();
                System.out.print("Quantidade: ");
		        int q=sc.nextInt();
		        sc.nextLine();
                nome_produtos.add(n);
		        todos_produtos.add(new Produto(n,c,p,q));
            }
            else if(resposta==2) {
                if(todos_produtos.size()==0) {
                    System.out.println("Ops... nenhum produto foi cadastrado!");
                }
                else {
                    System.out.print("Qual o nome do produto? ");
				    String n=sc.nextLine();
                    if(todos_produtos.size()==1) {
                        if(todos_produtos.get(0).getNome().equals(n)) {
                            System.out.println("Produto encontrado no estoque!");
                            System.out.println("Nome: "+todos_produtos.get(0).getNome()+" -> Preço: "+todos_produtos.get(0).getPreco()+" -> Quant.: "+todos_produtos.get(0).getQuantidade());
                        }
                        else {
                            System.out.println("Produto não encontrado!");
                        }
                    }
                    else {
                        if(nome_produtos.contains(n)) {
                            int i=0;
                            for(i=0;i<todos_produtos.size();i++) {
                                if(todos_produtos.get(i).getNome().equals(n)) {
                                    System.out.println("Produto encontrado no estoque!");
                                    System.out.println("Nome: "+todos_produtos.get(i).getNome()+" -> Preço: "+todos_produtos.get(i).getPreco()+" -> Quant.: "+todos_produtos.get(i).getQuantidade());
                                    break;
                                }
                            }
                        }
                        else {
                            System.out.println("Nenhum produto com esse nome foi encontrado!");
                        }
                    }
                }
            }
            else if(resposta==3) {
                if(todos_produtos.size()==0) {
                    System.out.println("Ops... nenhum produto foi cadastrado!");
                }
                else if(todos_produtos.size()==1) {
                    System.out.println("Apenas um produto foi cadastrado! Sendo ele:");
                    System.out.println("Nome: "+todos_produtos.get(0).getNome()+" -> Preço: "+todos_produtos.get(0).getPreco()+" -> Quant.: "+todos_produtos.get(0).getQuantidade());
                }
                else {
                    int i=0;
                    System.out.println("-> SEGUE ABAIXO TODOS OS PRODUTOS <-");
                    for(i=0;i<todos_produtos.size();i++) {
                        System.out.println("Nome: "+todos_produtos.get(i).getNome()+" -> Preço: "+todos_produtos.get(i).getPreco()+" -> Quant.: "+todos_produtos.get(i).getQuantidade());
                    }
                }
            }
            else if(resposta==4) {
                if(todos_produtos.size()==0) {
                    System.out.println("Ops... nenhum produto foi cadastrado!");
                }
                else {
                    System.out.print("Qual o nome do produto? ");
				    String n=sc.nextLine();
                    if(nome_produtos.contains(n)) {
                        int i=0;
                        for(i=0;i<todos_produtos.size();i++) {
                            if(todos_produtos.get(i).getNome().equals(n)) {
                                if(todos_produtos.get(i).getQuantidade()>0) {
                                    System.out.print("Temos "+todos_produtos.get(i).getQuantidade()+" unidades desse produto! Você irá vender quantos? ");
                                    int vender=sc.nextInt();
                                    sc.nextLine();
                                    if(todos_produtos.get(i).getQuantidade()>=vender) {
                                        int atualizacao_estoque=todos_produtos.get(i).getQuantidade()-vender;
                                        todos_produtos.get(i).setQuantidade(atualizacao_estoque);
                                        System.out.println("Produto vendido! E a quantidade do estoque foi atualizada.");
                                        break;
                                    }
                                    else{
                                        System.out.println("Temos apenas "+todos_produtos.get(i).getQuantidade()+" unidades desse produto no estoque!");
                                    }
                                }
                                else {
                                    System.out.println("Não temos unidades disponíveis desse produto!");
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhum produto com esse nome foi encontrado!");
                    }
                }
            }
            else {
                System.out.println("Livraria fechada!");
                break;
            }
        }
    }
}