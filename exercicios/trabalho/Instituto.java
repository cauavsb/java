package trabalho;
import java.util.ArrayList;
public class Instituto {
    private String campus;
    private int codigo;
    private String nome;
    private ArrayList<Funcionario> todos_funcionarios;
    private ArrayList<Curso> todos_cursos;

    public Instituto(String campus, int codigo, String nome, ArrayList todos_funcionarios, ArrayList todos_cursos) {
        this.campus=campus;
        this.codigo=codigo;
        this.nome=nome;
        this.todos_funcionarios=todos_funcionarios;
        this.todos_cursos=todos_cursos;
    }

    public String getCampus() {
        return campus;
    }
    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getTodos_funcionarios() {
        return todos_funcionarios;
    }
    public void setTodos_funcionarios(ArrayList<Funcionario> todos_funcionarios) {
        this.todos_funcionarios = todos_funcionarios;
    }

    public ArrayList<Curso> getTodos_cursos() {
        return todos_cursos;
    }
    public void setTodos_cursos(ArrayList<Curso> todos_cursos) {
        this.todos_cursos = todos_cursos;
    }
}