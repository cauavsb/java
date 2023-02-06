package lista_91;
public class Livro {
    public String autor_livro;
    public String isbn_livro;
    public String editora_livro;
    public String titulo_livro;
    public String ano_livro;

    public Livro(String autor_l,String isbn_l,String editora_l,String titulo_l,String ano_l) {
        this.autor_livro=autor_l;
        this.isbn_livro=isbn_l;
        this.editora_livro=editora_l;
        this.titulo_livro=titulo_l;
        this.ano_livro=ano_l;
    }

    public String getAutor_livro() {
        return this.autor_livro;
    }
    public void setAutor_livro(String autor_l) {
        this.autor_livro=autor_l;
    }

    public String getIsbn_livro() {
        return this.autor_livro;
    }
    public void setIsbn_livro(String isbn_l) {
        this.isbn_livro=isbn_l;
    }

    public String getEditora_livro() {
        return this.editora_livro;
    }
    public void setEditora_livro(String editora_l) {
        this.editora_livro=editora_l;
    }

    public String getTitulo_livro() {
        return this.titulo_livro;
    }
    public void setTitulo_livro(String titulo_l) {
        this.titulo_livro=titulo_l;
    }

    public String getAno_livro() {
        return this.ano_livro;
    }
    public void setAno_livro(String ano_l) {
        this.ano_livro=ano_l;
    }
}