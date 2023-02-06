package trabalho;
import java.util.ArrayList;
public class Curso {
    private int codigo;
    private String nome;
    private String ano;
    private String semestre;
    private String turno;
    private int numero_alunos;
    private ArrayList<Aluno> todos_alunos;
    private ArrayList<Disciplina> todos_disciplinas;

    public Curso(int codigo, String nome, String ano, String semestre, String turno, int numero_alunos, ArrayList todos_alunos, ArrayList todas_disciplinas) {
        this.codigo=codigo;
        this.nome=nome;
        this.ano=ano;
        this.semestre=semestre;
        this.turno=turno;
        this.numero_alunos=numero_alunos;
        this.todos_alunos=todos_alunos;
        this.todos_disciplinas=todas_disciplinas;
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

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNumero_alunos() {
        return numero_alunos;
    }
    public void setNumero_alunos(int numero_alunos) {
        this.numero_alunos = numero_alunos;
    }

    public ArrayList<Aluno> getTodos_alunos() {
        return todos_alunos;
    }
    public void setTodos_alunos(ArrayList<Aluno> todos_alunos) {
        this.todos_alunos = todos_alunos;
    }

    public ArrayList<Disciplina> getTodos_disciplinas() {
        return todos_disciplinas;
    }
    public void setTodos_disciplinas(ArrayList<Disciplina> todos_disciplinas) {
        this.todos_disciplinas = todos_disciplinas;
    }
}