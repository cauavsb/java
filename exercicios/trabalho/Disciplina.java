package trabalho;
import java.util.ArrayList;
public class Disciplina {
    private String nome;
    private int codigo;
    private String carga_horaria;
    private String professor;
    private ArrayList<Aula> todas_aulas;

    public Disciplina(String nome, int codigo, String carga_horaria,String professor, ArrayList todas_aulas) {
        this.nome=nome;
        this.codigo=codigo;
        this.carga_horaria=carga_horaria;
        this.professor=professor;
        this.todas_aulas=todas_aulas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCarga_horaria() {
        return carga_horaria;
    }
    public void setCarga_horaria(String carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aula> getTodas_aulas() {
        return todas_aulas;
    }
    public void setTodas_aulas(ArrayList<Aula> todas_aulas) {
        this.todas_aulas = todas_aulas;
    }
}