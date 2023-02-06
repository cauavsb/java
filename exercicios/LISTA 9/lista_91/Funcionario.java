package lista_91;
public class Funcionario {
    public String cpf_funcionario;
    public String nome_funcionario;
    public String endereco_funcionario;
    public String telefone_funcionario;

    public Funcionario(String cpf_f,String nome_f,String endereco_f,String telefone_f) {
        this.cpf_funcionario=cpf_f;
        this.nome_funcionario=nome_f;
        this.endereco_funcionario=endereco_f;
        this.telefone_funcionario=telefone_f;
    }

    public String getCpf_funcionario() {
        return this.cpf_funcionario;
    }
    public void setCpf_funcionario(String cpf_f) {
        this.cpf_funcionario=cpf_f;
    }

    public String getNome_funcionario() {
        return this.nome_funcionario;
    }
    public void setNome_funcionario(String nome_f) {
        this.nome_funcionario=nome_f;
    }

    public String getEndereco_funcionario() {
        return this.endereco_funcionario;
    }
    public void setEndereco_funcionario(String endereco_f) {
        this.endereco_funcionario=endereco_f;
    }

    public String getTelefone_funcionario() {
        return this.telefone_funcionario;
    }
    public void setTelefone_funcionario(String telefone_f) {
        this.telefone_funcionario=telefone_f;
    }
}