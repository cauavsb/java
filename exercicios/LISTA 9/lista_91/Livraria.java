package lista_91;
import java.util.ArrayList;
public class Livraria {
    public String nome_livraria;
    public String cidade_livraria;
    public String estado_livraria;
    public String gerente_livraria;
    public ArrayList<String> funcionarios;
    public ArrayList<String> livros;

    public Livraria(String nome_l,String cidade_l,String estado_l,String gerente_l,ArrayList f,ArrayList l) {
        this.nome_livraria=nome_l;
        this.cidade_livraria=cidade_l;
        this.estado_livraria=estado_l;
        this.gerente_livraria=gerente_l;
        this.funcionarios=f;
        this.livros=l;
    }

    public String getNome_livraria() {
        return this.nome_livraria;
    }
    public void setNome_livraria(String nome_l) {
        this.nome_livraria=nome_l;
    }

    public String getCidade_livraria() {
        return this.cidade_livraria;
    }
    public void setCidade_livraria(String cidade_l) {
        this.cidade_livraria=cidade_l;
    }

    public String getEstado_livraria() {
        return this.estado_livraria;
    }
    public void setEstado_livraria(String estado_l) {
        this.estado_livraria=estado_l;
    }

    public String getGerente_livraria() {
        return this.gerente_livraria;
    }
    public void setGerente_livraria(String gerente_l) {
        this.gerente_livraria=gerente_l;
    }

    public ArrayList getFuncionarios() {
        return this.funcionarios;
    }
    public void setFuncionarios(ArrayList f) {
        this.funcionarios=f;
    }

    public ArrayList getLivros() {
        return this.livros;
    }
    public void setLivros(ArrayList l) {
        this.livros=l;
    }
}