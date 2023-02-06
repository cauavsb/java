package trabalho;
public class Adm extends Funcionario {
    private String setor;
    private String area_atuacao;

    public Adm(String nome, String data_nascimento, int matricula, String turno, float salario, String setor, String area_atuacao) {
        super(nome,data_nascimento,matricula,turno,salario);
        this.setor=setor;
        this.area_atuacao=area_atuacao;
    }

    public void setSetor(String setor) {
        this.setor=setor;
    }
    public String getSetor() {
        return this.setor;
    }

    public void setAreaAtuacao(String area_atuacao) {
        this.area_atuacao=area_atuacao;
    }
    public String getAreaAtuacao() {
        return this.area_atuacao;
    }
}