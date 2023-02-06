package lista_63;
import java.util.Scanner;
import java.util.ArrayList;
public class DadosIMC {

    public static void desejo() {
	    System.out.println("[1] CADASTRAR UMA PESSOA");
	    System.out.println("[2] MOSTRAR AS PESSOAS QUE ESTÃO ABAIXO DO PESO (IMC<18.5)");
	    System.out.println("[3] MOSTRAR AS PESSOAS QUE ESTÃO DENTRO DO PESO IDEAL (IMC>=18.5 E IMC<25)");
        System.out.println("[4] MOSTRAR AS PESSOAS QUE ESTÃO ACIMA DO PESO IDEAL (IMC>=25)");
        System.out.println("[0] SAIR");
	    }
        
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Imc> todos_indices = new ArrayList();
        int abaixo=0;
        int dentro=0;
        int acima=0;
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
            if(resposta==1) {
                System.out.print("Nome: ");
				String n=sc.nextLine();
				System.out.print("Peso: ");
				float p=sc.nextFloat();
				sc.nextLine();
                System.out.print("Altura: ");
				float h=sc.nextFloat();
				sc.nextLine();
                float indice=p/(h*h);
                if(indice<18.5) {
                    abaixo+=1;
                }
                else if(indice>=18.5 && indice<25) {
                    dentro+=1;
                }
                else {
                    acima+=1;
                }
                todos_indices.add(new Imc(n,p,h,indice));
                System.out.println("Pessoa cadastrada!");
            }
            else if(resposta==2) {
                if(todos_indices.size()==0) {
                    System.out.println("Nenhum pessoa foi criado!");
                }
                else if(todos_indices.size()==1) {
                    if(abaixo==1) {
                    System.out.println("Apenas uma pessoa foi cadastrada. Sendo assim, a pessoa se chama "+(todos_indices.get(0).getNome())+" e está abaixo do peso.");
                    }
                    else {
                    System.out.println("Apenas uma pessoa foi cadastrada. E ela não está abaixo do peso!");
                    }
                }
                else {
                    if(abaixo==0) {
                        System.out.println("Nenhuma das pessoas cadastradas estão abaixo do peso!");
                    }
                    else if(abaixo==1) {
                        int i;
                        for(i=0;i<todos_indices.size();i++) {
                            if(todos_indices.get(i).getIndice()<18.5) {
					            System.out.println("Apenas "+todos_indices.get(i).getNome()+" está abaixo do peso ideal!");
                                break;
                            }
                        }
                    }
                    else {
                        int i;
                        System.out.println("-> PESSOAS ABAIXO DO PESO <-");
                        for(i=0;i<todos_indices.size();i++) {
                            if(todos_indices.get(i).getIndice()<18.5) {
					            System.out.println(todos_indices.get(i).getNome());
                            }
                        }
                    }

                }
            }
            else if(resposta==3) {
                if(todos_indices.size()==0) {
                    System.out.println("Nenhum pessoa foi criado!");
                }
                else if(todos_indices.size()==1) {
                    if(dentro==1) {
                    System.out.println("Apenas uma pessoa foi cadastrada. Sendo assim, a pessoa se chama "+(todos_indices.get(0).getNome())+" e está dentro do peso ideal.");
                    }
                    else {
                    System.out.println("Apenas uma pessoa foi cadastrada. E ela não está dentro do peso ideal!");
                    }
                }
                else {
                    if(dentro==0) {
                        System.out.println("Nenhuma das pessoas cadastradas está dentro do peso ideal!");
                    }
                    else if(dentro==1) {
                        int i;
                        for(i=0;i<todos_indices.size();i++) {
                            if(todos_indices.get(i).getIndice()>=18.5 && todos_indices.get(i).getIndice()<25) {
					            System.out.println("Apenas "+todos_indices.get(i).getNome()+" está dentro do peso ideal!");
                                break;
                            }
                        }
                    }
                    else {
                        int i;
                        System.out.println("-> PESSOAS DETRO DO PESO IDEAL <-");
                        for(i=0;i<todos_indices.size();i++) {
                            if(todos_indices.get(i).getIndice()>=18.5 && todos_indices.get(i).getIndice()<25) {
					            System.out.println(todos_indices.get(i).getNome());
                            }
                        }
                    }

                }
            }
            else if(resposta==4) {
                if(todos_indices.size()==0) {
                    System.out.println("Nenhum pessoa foi criado!");
                }
                else if(todos_indices.size()==1) {
                    if(acima==1) {
                    System.out.println("Apenas uma pessoa foi cadastrada. Sendo assim, a pessoa se chama "+(todos_indices.get(0).getNome())+" e está acima do peso ideal.");
                    }
                    else {
                    System.out.println("Apenas uma pessoa foi cadastrada. E ela não está acima do peso ideal!");
                    }
                }
                else {
                    if(acima==0) {
                        System.out.println("Nenhuma das pessoas cadastradas está acima do peso ideal!");
                    }
                    else if(acima==1) {
                        int i;
                        for(i=0;i<todos_indices.size();i++) {
                            if(todos_indices.get(i).getIndice()>=25) {
					            System.out.println("Apenas "+todos_indices.get(i).getNome()+" está acima do peso ideal!");
                                break;
                            }
                        }
                    }
                    else {
                        int i;
                        System.out.println("-> PESSOAS ACIMA DO PESO IDEAL <-");
                        for(i=0;i<todos_indices.size();i++) {
                            if(todos_indices.get(i).getIndice()>25) {
					            System.out.println(todos_indices.get(i).getNome());
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