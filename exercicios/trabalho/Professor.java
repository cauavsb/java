package trabalho;
public class Professor extends Funcionario {
    private String formacao;
    private String especializazao;

    public Professor(String nome, String data_nascimento, int matricula, String turno, float salario, String formacao, String especializacao) {
        super(nome,data_nascimento,matricula,turno,salario);
        this.formacao=formacao;
        this.especializazao=especializacao;
    }

    public void setFormacao(String formacao) {
        this.formacao=formacao;
    }
    public String getFormacao() {
        return this.formacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializazao=especializacao;
    }
    public String getEspecializacao() {
        return this.especializazao;
    }
}