package lista_71;
public class Livro {
    public String autor;
    public String editora;
    public int isbn;
    public String titulo;
    public int ano_edicao;

    public Livro(String a,String e,int i,String t,int ano) {
        this.autor=a;
        this.editora=e;
        this.isbn=i;
        this.titulo=t;
        this.ano_edicao=ano;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String a) {
        this.autor=a;
    }

    public String getEditora() {
        return this.editora;
    }
    public void setEditora(String e) {
        this.editora=e;
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