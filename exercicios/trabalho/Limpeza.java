package trabalho;
public class Limpeza extends Funcionario {
    private String funcao;

    public Limpeza(String nome, String data_nascimento, int matricula, String turno, float salario, String funcao) {
        super(nome,data_nascimento,matricula,turno,salario);
        this.funcao=funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao=funcao;
    }
    public String getFuncao() {
        return this.funcao;
    }
}