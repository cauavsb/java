package lista_81;
public class Livro {
    public int cpf_autor;
    public String nome_autor;
    public String endereco_autor;
    public int cnpj_editora;
    public String nome_editora;
    public String endereco_editora;
    public int telefone_editora;
    public int isbn;
    public String titulo;
    public int ano_edicao;

    public Livro(int cpf_a,String nome_a,String endereco_a,int cnpj_e,String nome_e,String endereco_e,int telefone_e,int i,String t,int ano) {
        this.cpf_autor=cpf_a;
        this.nome_autor=nome_a;
        this.endereco_autor=endereco_a;
        this.cnpj_editora=cnpj_e;
        this.nome_editora=nome_e;
        this.endereco_editora=endereco_e;
        this.telefone_editora=telefone_e;
        this.isbn=i;
        this.titulo=t;
        this.ano_edicao=ano;
    }

    public int getCpf_autor() {
        return this.cpf_autor;
    }
    public void setCpf_autor(int cpf_a) {
        this.cpf_autor=cpf_a;
    }

    public String getNome_autor() {
        return this.nome_autor;
    }
    public void setNome_autor(String nome_a) {
        this.nome_autor=nome_a;
    }

    public String getEndereco_autor() {
        return this.endereco_autor;
    }
    public void setEndereco_autor(String endereco_a) {
        this.endereco_autor=endereco_a;
    }

    public int getCnpj_editora() {
        return this.cnpj_editora;
    }
    public void setCnpj_editora(int cnpj_e) {
        this.cnpj_editora=cnpj_e;
    }

    public String getNome_editora() {
        return this.nome_editora;
    }
    public void setNome_editora(String nome_e) {
        this.nome_editora=nome_e;
    }

    public String getEndereco_editora() {
        return this.endereco_editora;
    }
    public void setEndereco_editora(String endereco_e) {
        this.endereco_editora=endereco_e;
    }

    public int getTelefone_editora() {
        return this.telefone_editora;
    }
    public void setTelefone_editora(int telefone_e) {
        this.telefone_editora=telefone_e;
    }

    public int getIsbn() {
        return this.isbn;
    }
    public void setIsbn(int i) {
        this.isbn=i;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String t) {
        this.titulo=t;
    }

    public int getAno_edicao() {
        return this.ano_edicao;
    }
    public void setAno_edicao(int ano) {
        this.ano_edicao=ano;
    }
}