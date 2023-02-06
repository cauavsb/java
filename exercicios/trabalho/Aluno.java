package trabalho;
public class Aluno {
    private String nome;
    private String data_nascimento;
    private int matricula;
    private String cpf;
    private String endereco;
    private String telefone_responsavel;
    private int aulas_presente;
    private float media;

    public Aluno(String nome, String data_nascimento, int matricula, String cpf, String endereco,String telefone_responsavel, int aulas_presente, float media) {
        this.nome=nome;
        this.data_nascimento=data_nascimento;
        this.matricula=matricula;
        this.cpf=cpf;
        this.endereco=endereco;
        this.telefone_responsavel=telefone_responsavel;
        this.aulas_presente=aulas_presente;
        this.media=media;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone_responsavel() {
        return telefone_responsavel;
    }
    public void setTelefone_responsavel(String telefone_responsavel) {
        this.telefone_responsavel = telefone_responsavel;
    }

    public int getAulas_presente() {
        return aulas_presente;
    }
    public void setAulas_presente(int aulas_presente) {
        this.aulas_presente = aulas_presente;
    }

    public float getMedia() {
        return media;
    }
    public void setMedia(float media) {
        this.media = media;
    }
}