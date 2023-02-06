package trabalho;
import java.util.ArrayList;
public class Aula {
    private int codigo;
    private String data;
    private String conteudo;

    public Aula(int codigo, String data, String conteudo) {
        this.codigo=codigo;
        this.data=data;
        this.conteudo=conteudo;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}