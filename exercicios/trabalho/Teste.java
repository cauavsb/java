package trabalho;
import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR INSTITUTO");
        System.out.println("[2] CADASTRAR FUNCIONÁRIO EM UM INSTITUTO");
        System.out.println("[3] CADASTRAR CURSO EM UM INSTITUTO");
        System.out.println("[4] CADASTRAR ALUNO EM UM CURSO");
        System.out.println("[5] CADASTRAR DISCIPLINA EM UM CURSO");
        System.out.println("[6] CADASTRAR AULA EM UMA DISCIPLINA");
        System.out.println("[7] CADASTRAR MÉDIA EM UMA TURMA");
        System.out.println("[8] LISTAR OS INSTITUTOS");
        System.out.println("[9] LISTAR OS FUNCIONÁRIOS DE UM INSTITUTO");
        System.out.println("[10] LISTAR OS CURSOS DE UM INSTITUTO");
        System.out.println("[11] LISTAR OS ALUNOS DE UM CURSO");
        System.out.println("[12] LISTAR AS DISCIPLINAS DE UM CURSO");
        System.out.println("[13] LISTAR AS AULAS DE UM CURSO");
        System.out.println("[14] MODIFICAR DADOS DE UM INSTITUTO");
        System.out.println("[15] MODIFICAR DADOS DE UM FUNCIONÁRIO");
        System.out.println("[16] MODIFICAR DADOS DE UM CURSO");
        System.out.println("[17] MODIFICAR DADOS DE UM ALUNO");
        System.out.println("[18] MODIFICAR DADOS DE UMA DISCIPLINA");
        System.out.println("[19] MODIFICAR DADOS DE UMA AULA");
	    System.out.println("[0] FECHAR O PROGRAMA");
	}
    public static void tipo_funcionario() {
	    System.out.println("[1] PROFESSOR");
        System.out.println("[2] LIMPEZA");
        System.out.println("[3] ADM");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Instituto> todos_institutos = new ArrayList();
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
                ArrayList<Funcionario> todos_funcionarios = new ArrayList();
                ArrayList<Curso> todos_cursos = new ArrayList();
                System.out.print("Campus: ");
                String campus=sc.nextLine();
                System.out.print("Código: ");
                int codigo=sc.nextInt();
                sc.nextLine();
                System.out.print("Nome: ");
                String nome=sc.nextLine();
                todos_institutos.add(new Instituto(campus,codigo,nome,todos_funcionarios,todos_cursos));
            }
            else if(resposta==2) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        tipo_funcionario();
                        System.out.print("O funcionário é... ");
			            int tipo=sc.nextInt();
                        sc.nextLine();
                        if(tipo==1) {
                            System.out.print("Nome: ");
                            String campus=sc.nextLine();
                            System.out.print("Data de nascimento: ");
                            String data_nascimento=sc.nextLine();
                            System.out.print("Matricula: ");
                            int matricula=sc.nextInt();
                            sc.nextLine();
                            System.out.print("Turno: ");
                            String turno=sc.nextLine();
                            System.out.print("Salário: ");
                            float salario=sc.nextFloat();
                            sc.nextLine();
                            System.out.print("Formação: ");
                            String formacao=sc.nextLine();
                            System.out.print("Especialização: ");
                            String especializacao=sc.nextLine();
                            todos_institutos.get(i).getTodos_funcionarios().add(new Professor(campus, data_nascimento, matricula, turno, salario, formacao, especializacao));
                        }
                        else if(tipo==2) {
                            System.out.print("Nome: ");
                            String campus=sc.nextLine();
                            System.out.print("Data de nascimento: ");
                            String data_nascimento=sc.nextLine();
                            System.out.print("Matricula: ");
                            int matricula=sc.nextInt();
                            sc.nextLine();
                            System.out.print("Turno: ");
                            String turno=sc.nextLine();
                            System.out.print("Salário: ");
                            float salario=sc.nextFloat();
                            sc.nextLine();
                            System.out.print("Função: ");
                            String funcao=sc.nextLine();
                            todos_institutos.get(i).getTodos_funcionarios().add(new Limpeza(campus, data_nascimento, matricula, turno, salario, funcao));
                        }
                        else if(tipo==3) {
                            System.out.print("Nome: ");
                            String campus=sc.nextLine();
                            System.out.print("Data de nascimento: ");
                            String data_nascimento=sc.nextLine();
                            System.out.print("Matricula: ");
                            int matricula=sc.nextInt();
                            sc.nextLine();
                            System.out.print("Turno: ");
                            String turno=sc.nextLine();
                            System.out.print("Salário: ");
                            float salario=sc.nextFloat();
                            sc.nextLine();
                            System.out.print("Setor: ");
                            String setor=sc.nextLine();
                            System.out.print("Área de atuação: ");
                            String area_atuacao=sc.nextLine();
                            todos_institutos.get(i).getTodos_funcionarios().add(new Adm(campus, data_nascimento, matricula, turno, salario, setor, area_atuacao));
                        }
                        else {
                            System.out.print("Opção inexistente!");
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido as opções para você cadastrar o funcionário, o código informado não pertence a nenhum dos institutos cadastrados!");
            }
            else if(resposta==3) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        ArrayList<Aluno> todos_alunos = new ArrayList();
                        ArrayList<Disciplina> todas_disciplinas = new ArrayList();
                        System.out.print("Codigo: ");
                        int codigo_curso=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nome: ");
                        String nome=sc.nextLine();
                        System.out.print("Ano: ");
                        String ano=sc.nextLine();
                        System.out.print("Semestre: ");
                        String semestre=sc.nextLine();
                        System.out.print("Turno: ");
                        String turno=sc.nextLine();
                        System.out.print("Número de alunos: ");
                        int numero_alunos=sc.nextInt();
                        sc.nextLine();
                        todos_institutos.get(i).getTodos_cursos().add(new Curso(codigo_curso, nome, ano, semestre, turno, numero_alunos, todos_alunos, todas_disciplinas));
                    }
                }
                System.out.println("Caso não tenha aparecido as opções para você cadastrar o curso, o código informado não pertence a nenhum dos institutos cadastrados!");
            }
            else if(resposta==4) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
                        int codigo_curso=sc.nextInt();
                        sc.nextLine();
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_cursos().size();c++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(c).getCodigo()==codigo_curso) {
                                System.out.print("Nome: ");
                                String nome=sc.nextLine();
                                System.out.print("Data de nascimento: ");
                                String data_nascimento=sc.nextLine();
                                System.out.print("Matricula: ");
                                int matricula=sc.nextInt();
                                sc.nextLine();
                                System.out.print("CPF: ");
                                String cpf=sc.nextLine();
                                System.out.print("Endereço: ");
                                String endereco=sc.nextLine();
                                System.out.print("Telefone do responsável: ");
                                String telefone_responsavel=sc.nextLine();
                                todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().add(new Aluno(nome, data_nascimento, matricula, cpf, endereco, telefone_responsavel, 0, 0));
                            }
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido as opções para você cadastrar o aluno, os códigos informados não foram encontrados!");
            }
            else if(resposta==5) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
                        int codigo_curso=sc.nextInt();
                        sc.nextLine();
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_cursos().size();c++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(c).getCodigo()==codigo_curso) {
                                ArrayList<Aula> todas_aulas = new ArrayList();
                                System.out.print("Nome: ");
                                String nome=sc.nextLine();
                                System.out.print("Codigo: ");
                                int codigo_disciplina=sc.nextInt();
                                sc.nextLine();
                                System.out.print("Carga horária: ");
                                String carga_horaria=sc.nextLine();
                                System.out.print("Nome do professor: ");
                                String professor=sc.nextLine();
                                todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().add(new Disciplina(nome, codigo_disciplina, carga_horaria, professor, todas_aulas));
                            }
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido as opções para você cadastrar a disciplina, os códigos informados não foram encontrados!");
            }
            else if(resposta==6) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
                        int codigo_curso=sc.nextInt();
                        sc.nextLine();
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_cursos().size();c++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(c).getCodigo()==codigo_curso) {
                                System.out.print("Qual o código da disciplina? ");
                                int codigo_dis=sc.nextInt();
                                sc.nextLine();
                                int a=0;
                                for(a=0;a<todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().size();a++) {
                                    if(todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getCodigo()==codigo_dis) {
                                        System.out.print("Código: ");
                                        int codigo_aula=sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Data: ");
                                        String data=sc.nextLine();
                                        System.out.print("Conteúdo: ");
                                        String conteudo=sc.nextLine();
                                        todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getTodas_aulas().add(new Aula(codigo_aula,data,conteudo));
                                        int g=0;
                                        for(g=0;g<todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().size();g++) {
                                            System.out.print(todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().get(g).getNome()+" está presente? [S/N] ");
                                            String frequencia=sc.nextLine();
                                            if(frequencia.equals("S") || frequencia.equals("s")) {
                                                todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().get(g).setAulas_presente(todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().get(g).getAulas_presente()+1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido as opções para você cadastrar a aula, os códigos informados não foram encontrados!");
            }
            else if(resposta==7) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
                        int codigo_curso=sc.nextInt();
                        sc.nextLine();
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_cursos().size();c++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(c).getCodigo()==codigo_curso) {
                                int a=0;
                                for(a=0;a<todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().size();a++) {
                                    System.out.print("Média de "+todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().get(a).getNome()+": ");
                                    float media=sc.nextFloat();
                                    sc.nextLine();
                                    todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().get(a).setMedia(media);
                                }
                            }
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido as opções para você cadastrar as médias, os códigos informados não foram encontrados!");
            }
            else if(resposta==8) {
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    System.out.println(todos_institutos.get(i).getNome()+" -> "+todos_institutos.get(i).getCampus()+" -> "+todos_institutos.get(i).getCodigo());
                }
                System.out.println("Caso não tenha aparecido nenhum instituto, isto deve-se ao fato de nenhum ter sido cadastrado!");
            }
            else if(resposta==9) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_funcionarios().size();c++) {
                            System.out.println(todos_institutos.get(i).getTodos_funcionarios().get(c).getNome()+" -> "+todos_institutos.get(i).getTodos_funcionarios().get(c).getMatricula()+" -> "+todos_institutos.get(i).getTodos_funcionarios().get(c).getSalario());
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido nenhum funcionário, isto deve-se ao fato de nenhum ter sido cadastrado ou o código informado não pertence a nenhum instituto!");
            }
            else if(resposta==10) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_cursos().size();c++) {
                            System.out.println(todos_institutos.get(i).getTodos_cursos().get(c).getNome()+" -> "+todos_institutos.get(i).getTodos_cursos().get(c).getTurno()+" -> "+todos_institutos.get(i).getTodos_cursos().get(c).getSemestre());
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido nenhum curso, isto deve-se ao fato de nenhum ter sido cadastrado ou o código informado não pertence a nenhum instituto!");
            }
            else if(resposta==11) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
                        int codigo_curso=sc.nextInt();
                        sc.nextLine();
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_cursos().size();c++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(c).getCodigo()==codigo_curso) {
                                int v=0;
                                for(v=0;v<todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().size();v++) {
                                    System.out.println(todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().get(v).getNome()+" -> "+todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().get(v).getMatricula()+" -> "+todos_institutos.get(i).getTodos_cursos().get(c).getTodos_alunos().get(v).getEndereco());
                                }
                            }
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido nenhum aluno, isto deve-se ao fato de nenhum ter sido cadastrado ou o código informado não pertence a nenhum instituto/curso!");
            }
            else if(resposta==12) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
                        int codigo_curso=sc.nextInt();
                        sc.nextLine();
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_cursos().size();c++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(c).getCodigo()==codigo_curso) {
                                int v=0;
                                for(v=0;v<todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().size();v++) {
                                    System.out.println(todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(v).getNome()+" -> "+todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(v).getCodigo()+" -> "+todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(v).getProfessor());
                                }
                            }
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido nenhuma disciplina, isto deve-se ao fato de nenhum ter sido cadastrado ou o código informado não pertence a nenhum instituto/curso!");
            }
            else if(resposta==13) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
                        int codigo_curso=sc.nextInt();
                        sc.nextLine();
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_cursos().size();c++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(c).getCodigo()==codigo_curso) {
                                System.out.print("Qual o código da disciplina? ");
                                int codigo_dis=sc.nextInt();
                                sc.nextLine();
                                int a=0;
                                for(a=0;a<todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().size();a++) {
                                    if(todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getCodigo()==codigo_dis) {
                                        int o=0;
                                        for(o=0;o<todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getTodas_aulas().size();o++) {
                                            System.out.println(todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getTodas_aulas().get(o).getData()+" -> "+todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getTodas_aulas().get(o).getConteudo());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido nenhuma aula, isto deve-se ao fato de nenhum ter sido cadastrado ou o código informado não pertence a nenhum instituto/curso!");
            }
            else if(resposta==14) {
                System.out.print("Qual o código do instituto? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.println("[1] CAMPUS");
                        System.out.println("[2] CÓDIGO");
                        System.out.println("[3] NOME");
                        System.out.print("Qual dado você deseja alterar?");
			            int opcao=sc.nextInt();
			            sc.nextLine();
                        if(opcao==1) {
                            System.out.print("Qual o novo CAMPUS do instituto? ");
			                String campus=sc.nextLine();
                            todos_institutos.get(i).setCampus(campus);
                        }
                        else if(opcao==2) {
                            System.out.print("Qual o novo CÓDIGO do instituto? ");
			                int cod=sc.nextInt();
                            sc.nextLine();
                            todos_institutos.get(i).setCodigo(cod);
                        }
                        else if(opcao==3) {
                            System.out.print("Qual o novo NOME do instituto? ");
			                String nome=sc.nextLine();
                            todos_institutos.get(i).setNome(nome);;
                        }
                        else {
                            System.out.println("Opção inexistente!");
                        }
                    }
                }
            }
            else if(resposta==15) {
                System.out.print("Qual o código do instituto em que o funcionário trabalha? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual a matrícula do funcionário? ");
			            int mat=sc.nextInt();
			            sc.nextLine();
                        int a=0;
                        for(a=0;a<todos_institutos.get(i).getTodos_funcionarios().size();a++) {
                            if(todos_institutos.get(i).getTodos_funcionarios().get(a).getMatricula()==mat) {
                                if(todos_institutos.get(i).getTodos_funcionarios().get(a) instanceof Limpeza) {
                                    Limpeza l = (Limpeza) todos_institutos.get(i).getTodos_funcionarios().get(a);
                                    System.out.println("Qual dado você deseja alterar?");
                                    System.out.println("[1] NOME");
                                    System.out.println("[2] DATA DE NASCIMENTO");
                                    System.out.println("[3] MATRÍCULA");
                                    System.out.println("[4] TURNO");
                                    System.out.println("[5] SALÁRIO");
                                    System.out.println("[6] FUNÇÃO");
                                    System.out.print("Qual dado você deseja alterar?");
			                        int opcao=sc.nextInt();
			                        sc.nextLine();
                                    if(opcao==1) {
                                        System.out.print("Qual o novo NOME do funcionário? ");
                                        String nome=sc.nextLine();
                                        l.setNome(nome);
                                    }
                                    else if(opcao==2) {
                                        System.out.print("Qual a nova DATA DE NASCIMENTO do funcionário? ");
                                        String data=sc.nextLine();
                                        l.setDataNascimento(data);
                                    }
                                    else if(opcao==3) {
                                        System.out.print("Qual a nova MATRÍCULA do funcionário? ");
                                        int matricula=sc.nextInt();
                                        sc.nextLine();
                                        l.setMatricula(matricula);
                                    }
                                    else if(opcao==4) {
                                        System.out.print("Qual o novo TURNO do funcionário? ");
                                        String turno=sc.nextLine();
                                        l.setTurno(turno);
                                    }
                                    else if(opcao==5) {
                                        System.out.print("Qual o novo SALÁRIO do funcionário? ");
                                        float salario=sc.nextFloat();
                                        sc.nextLine();
                                        l.setSalario(salario);
                                    }
                                    else if(opcao==6) {
                                        System.out.print("Qual a nova FUNÇÃO do funcionário? ");
                                        String funcao=sc.nextLine();
                                        l.setFuncao(funcao);
                                    }
                                    else {
                                        System.out.println("Opção inexistente!");
                                    }   
                                }
                                else if(todos_institutos.get(i).getTodos_funcionarios().get(a) instanceof Professor) {
                                    Professor p = (Professor) todos_institutos.get(i).getTodos_funcionarios().get(a);
                                    System.out.println("Qual dado você deseja alterar?");
                                    System.out.println("[1] NOME");
                                    System.out.println("[2] DATA DE NASCIMENTO");
                                    System.out.println("[3] MATRÍCULA");
                                    System.out.println("[4] TURNO");
                                    System.out.println("[5] SALÁRIO");
                                    System.out.println("[6] FORMAÇÃO");
                                    System.out.println("[7] ESPECIALIZAÇÃO");
                                    System.out.print("Qual dado você deseja alterar?");
			                        int opcao=sc.nextInt();
			                        sc.nextLine();
                                    if(opcao==1) {
                                        System.out.print("Qual o novo NOME do funcionário? ");
                                        String nome=sc.nextLine();
                                        p.setNome(nome);
                                    }
                                    else if(opcao==2) {
                                        System.out.print("Qual a nova DATA DE NASCIMENTO do funcionário? ");
                                        String data=sc.nextLine();
                                        p.setDataNascimento(data);
                                    }
                                    else if(opcao==3) {
                                        System.out.print("Qual a nova MATRÍCULA do funcionário? ");
                                        int matricula=sc.nextInt();
                                        sc.nextLine();
                                        p.setMatricula(matricula);
                                    }
                                    else if(opcao==4) {
                                        System.out.print("Qual o novo TURNO do funcionário? ");
                                        String turno=sc.nextLine();
                                        p.setTurno(turno);
                                    }
                                    else if(opcao==5) {
                                        System.out.print("Qual o novo SALÁRIO do funcionário? ");
                                        float salario=sc.nextFloat();
                                        sc.nextLine();
                                        p.setSalario(salario);
                                    }
                                    else if(opcao==6) {
                                        System.out.print("Qual a nova FORMAÇÃO do funcionário? ");
                                        String formacao=sc.nextLine();
                                        p.setFormacao(formacao);
                                    }
                                    else if(opcao==7) {
                                        System.out.print("Qual a nova ESPECIALIZAÇÃO do funcionário? ");
                                        String espec=sc.nextLine();
                                        p.setEspecializacao(espec);
                                    }
                                    else {
                                        System.out.println("Opção inexistente!");
                                    }   
                                }
                                else if(todos_institutos.get(i).getTodos_funcionarios().get(a) instanceof Adm) {
                                    Adm p = (Adm) todos_institutos.get(i).getTodos_funcionarios().get(a);
                                    System.out.println("Qual dado você deseja alterar?");
                                    System.out.println("[1] NOME");
                                    System.out.println("[2] DATA DE NASCIMENTO");
                                    System.out.println("[3] MATRÍCULA");
                                    System.out.println("[4] TURNO");
                                    System.out.println("[5] SALÁRIO");
                                    System.out.println("[6] SETOR");
                                    System.out.println("[7] ÁREA DE ATUAÇÃO");
                                    System.out.print("Qual dado você deseja alterar?");
			                        int opcao=sc.nextInt();
			                        sc.nextLine();
                                    if(opcao==1) {
                                        System.out.print("Qual o novo NOME do funcionário? ");
                                        String nome=sc.nextLine();
                                        p.setNome(nome);
                                    }
                                    else if(opcao==2) {
                                        System.out.print("Qual a nova DATA DE NASCIMENTO do funcionário? ");
                                        String data=sc.nextLine();
                                        p.setDataNascimento(data);
                                    }
                                    else if(opcao==3) {
                                        System.out.print("Qual a nova MATRÍCULA do funcionário? ");
                                        int matricula=sc.nextInt();
                                        sc.nextLine();
                                        p.setMatricula(matricula);
                                    }
                                    else if(opcao==4) {
                                        System.out.print("Qual o novo TURNO do funcionário? ");
                                        String turno=sc.nextLine();
                                        p.setTurno(turno);
                                    }
                                    else if(opcao==5) {
                                        System.out.print("Qual o novo SALÁRIO do funcionário? ");
                                        float salario=sc.nextFloat();
                                        sc.nextLine();
                                        p.setSalario(salario);
                                    }
                                    else if(opcao==6) {
                                        System.out.print("Qual o novo SETOR do funcionário? ");
                                        String setor=sc.nextLine();
                                        p.setSetor(setor);
                                    }
                                    else if(opcao==7) {
                                        System.out.print("Qual a nova ÁREA DE ATUAÇÃO do funcionário? ");
                                        String area=sc.nextLine();
                                        p.setAreaAtuacao(area);
                                    }
                                    else {
                                        System.out.println("Opção inexistente!");
                                    }   
                                }
                            }
                        }
                    }
                }
            }
            else if(resposta==16) {
                System.out.print("Qual o código do instituto em que o curso foi cadastrado? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
			            int cod=sc.nextInt();
			            sc.nextLine();
                        int a=0;
                        for(a=0;a<todos_institutos.get(i).getTodos_cursos().size();a++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(a).getCodigo()==cod) {
                                System.out.println("[1] CÓDIGO");   
                                System.out.println("[2] NOME");
                                System.out.println("[3] ANO");
                                System.out.println("[4] SEMESTRE");   
                                System.out.println("[5] TURNO");
                                System.out.println("[6] NÚMERO DE ALUNOS");
                                System.out.print("Qual dado você deseja alterar?");
                                int opcao=sc.nextInt();
                                sc.nextLine();
                                if(opcao==1) {
                                    System.out.print("Qual o novo CÓDIGO do curso? ");
                                    int codig=sc.nextInt();
                                    sc.nextLine();
                                    todos_institutos.get(i).getTodos_cursos().get(a).setCodigo(codig);
                                }
                                else if(opcao==2) {
                                    System.out.print("Qual o novo NOME do curso? ");
                                    String nome=sc.nextLine();
                                    todos_institutos.get(i).getTodos_cursos().get(a).setNome(nome);
                                }
                                else if(opcao==3) {
                                    System.out.print("Qual o novo ANO do curso? ");
                                    String ano=sc.nextLine();
                                    todos_institutos.get(i).getTodos_cursos().get(a).setAno(ano);
                                }
                                else if(opcao==4) {
                                    System.out.print("Qual o novo SEMESTRE do curso? ");
                                    String semestre=sc.nextLine();
                                    todos_institutos.get(i).getTodos_cursos().get(a).setSemestre(semestre);
                                }
                                else if(opcao==5) {
                                    System.out.print("Qual o novo Turno do curso? ");
                                    String turno=sc.nextLine();
                                    todos_institutos.get(i).getTodos_cursos().get(a).setTurno(turno);
                                }
                                else if(opcao==6) {
                                    System.out.print("Qual o novo NÚMERO DE ALUNOS do curso? ");
                                    int num=sc.nextInt();
                                    sc.nextLine();
                                    todos_institutos.get(i).getTodos_cursos().get(a).setNumero_alunos(num);
                                }
                                else {
                                    System.out.println("Opção inexistente!");
                                }
                            }
                        }
                    }
                }
            }
            else if(resposta==17) {
                System.out.print("Qual o código do instituto em que o aluno foi cadastrado? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
			            int cod=sc.nextInt();
			            sc.nextLine();
                        int a=0;
                        for(a=0;a<todos_institutos.get(i).getTodos_cursos().size();a++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(a).getCodigo()==cod) {
                                System.out.print("Qual a matrícula do aluno? ");
                                int mat=sc.nextInt();
                                sc.nextLine();
                                int c=0;
                                for(c=0;c<todos_institutos.get(i).getTodos_cursos().get(a).getTodos_alunos().size();c++) {
                                    if(todos_institutos.get(i).getTodos_cursos().get(a).getTodos_alunos().get(c).getMatricula()==mat) {
                                        System.out.println("[1] NOME");   
                                        System.out.println("[2] DATA DE NASCIMENTO");
                                        System.out.println("[3] MATRÍCULA");
                                        System.out.println("[4] CPF");   
                                        System.out.println("[5] ENDEREÇO");
                                        System.out.println("[6] TELEFONE RESPONÁVEL");
                                        System.out.print("Qual dado você deseja alterar?");
                                        int opcao=sc.nextInt();
                                        sc.nextLine();
                                        if(opcao==1) {
                                            System.out.print("Qual o novo NOME do aluno? ");
                                            String nome=sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_alunos().get(c).setNome(nome);
                                        }
                                        else if(opcao==2) {
                                            System.out.print("Qual a nova DATA DE NASCIMENTO do aluno? ");
                                            String data=sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_alunos().get(c).setData_nascimento(data);
                                        }
                                        else if(opcao==3) {
                                            System.out.print("Qual a nova MATRÍCULA do aluno? ");
                                            int matricula=sc.nextInt();
                                            sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_alunos().get(c).setMatricula(matricula);
                                        }
                                        else if(opcao==4) {
                                            System.out.print("Qual o novo CPF do aluno? ");
                                            String cpf=sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_alunos().get(c).setCpf(cpf);
                                        }
                                        else if(opcao==5) {
                                            System.out.print("Qual o novo ENDEREÇO do aluno? ");
                                            String endereco=sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_alunos().get(c).setEndereco(endereco);
                                        }
                                        else if(opcao==6) {
                                            System.out.print("Qual o novo TELEFONE DO RESPONSÁVEL do aluno? ");
                                            String telefone=sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_alunos().get(c).setTelefone_responsavel(telefone);
                                        }
                                        else {
                                            System.out.println("Opção inexistente!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if(resposta==18) {
                System.out.print("Qual o código do instituto em que a disciplina foi cadastrada? ");
			    int codigo=sc.nextInt();
			    sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso em que a disciplina foi cadastrada? ");
			            int cod=sc.nextInt();
			            sc.nextLine();
                        int a=0;
                        for(a=0;a<todos_institutos.get(i).getTodos_cursos().size();a++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(a).getCodigo()==cod) {
                                System.out.print("Qual o código da disciplina? ");
                                int codig=sc.nextInt();
                                sc.nextLine();
                                int c=0;
                                for(c=0;c<todos_institutos.get(i).getTodos_cursos().get(a).getTodos_disciplinas().size();c++) {
                                    if(todos_institutos.get(i).getTodos_cursos().get(a).getTodos_disciplinas().get(c).getCodigo()==codig) {
                                        System.out.println("[1] NOME");   
                                        System.out.println("[2] CÓDIGO");
                                        System.out.println("[3] CARGA HORÁRIA");
                                        System.out.println("[4] PROFESSOR");   
                                        System.out.print("Qual dado você deseja alterar?");
                                        int opcao=sc.nextInt();
                                        sc.nextLine();
                                        if(opcao==1) {
                                            System.out.print("Qual o novo NOME da disciplina? ");
                                            String nome=sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_disciplinas().get(c).setNome(nome);
                                        }
                                        else if(opcao==2) {
                                            System.out.print("Qual o novo CÓDIGO da disciplina? ");
                                            int codigo_dis=sc.nextInt();
                                            sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_disciplinas().get(c).setCodigo(codigo_dis);
                                        }
                                        else if(opcao==3) {
                                            System.out.print("Qual a nova CARGA HORÁRIA da disciplina? ");
                                            String carga=sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_disciplinas().get(c).setCarga_horaria(carga);
                                        }
                                        else if(opcao==4) {
                                            System.out.print("Qual o novo PROFESSOR da disciplina? ");
                                            String prof=sc.nextLine();
                                            todos_institutos.get(i).getTodos_cursos().get(a).getTodos_disciplinas().get(c).setProfessor(prof);
                                        }
                                        else {
                                            System.out.println("Opção inexistente!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
             else if(resposta==19) {
                System.out.print("Qual o código do instituto? ");
                int codigo=sc.nextInt();
                sc.nextLine();
                int i=0;
                for(i=0;i<todos_institutos.size();i++) {
                    if(todos_institutos.get(i).getCodigo()==codigo) {
                        System.out.print("Qual o código do curso? ");
                        int codigo_curso=sc.nextInt();
                        sc.nextLine();
                        int c=0;
                        for(c=0;c<todos_institutos.get(i).getTodos_cursos().size();c++) {
                            if(todos_institutos.get(i).getTodos_cursos().get(c).getCodigo()==codigo_curso) {
                                System.out.print("Qual o código da disciplina? ");
                                int codigo_dis=sc.nextInt();
                                sc.nextLine();
                                int a=0;
                                for(a=0;a<todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().size();a++) {
                                    if(todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getCodigo()==codigo_dis) {
                                        System.out.print("Qual o código da aula? ");
                                        int codigo_aula=sc.nextInt();
                                        sc.nextLine();
                                        int v=0;
                                        for(v=0;v<todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getTodas_aulas().size();v++) {
                                            if(todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getTodas_aulas().get(v).getCodigo()==codigo_aula) {
                                                System.out.println("[1] CÓDIGO");   
                                                System.out.println("[2] DATA");
                                                System.out.println("[3] CONTEÚDO");
                                                System.out.print("Qual dado você deseja alterar?");
                                                int opcao=sc.nextInt();
                                                sc.nextLine();
                                                if(opcao==1) {
                                                    System.out.print("Qual o novo CÓDIGO da aula? ");
                                                    int novo_codigo_aula=sc.nextInt();
                                                    sc.nextLine();
                                                    todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getTodas_aulas().get(v).setCodigo(novo_codigo_aula);
                                                }
                                                else if(opcao==2) {
                                                    System.out.print("Qual a nova DATA da aula? ");
                                                    String novo_data_aula=sc.nextLine();
                                                    todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getTodas_aulas().get(v).setData(novo_data_aula);
                                                }
                                                else if(opcao==3) {
                                                    System.out.print("Qual o novo CONTEÚDO da aula? ");
                                                    String novo_conteudo_aula=sc.nextLine();
                                                    todos_institutos.get(i).getTodos_cursos().get(c).getTodos_disciplinas().get(a).getTodas_aulas().get(v).setConteudo(novo_conteudo_aula);;
                                                }
                                                else {
                                                    System.out.println("Opção inexistente!");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("Caso não tenha aparecido as opções para você cadastrar a aula, os códigos informados não foram encontrados!");
            }
            else if(resposta==0) {
                System.out.println("Saindo...");
                break;
            }
            else {
                System.out.println("Opcção inexistente! Tente novamente.");
            }
        }
    }
}