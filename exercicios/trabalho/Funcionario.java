package trabalho;
public class Funcionario {
    private String nome;
    private String data_nascimento;
    private int matricula;
    private String turno;
    private float salario;

    public Funcionario(String nome, String data_nascimento, int matricula, String turno, float salario) {
        this.nome=nome;
        this.data_nascimento=data_nascimento;
        this.matricula=matricula;
        this.salario=salario;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setDataNascimento(String data_nascimento) {
        this.data_nascimento=data_nascimento;
    }
    public String getDataNascimento() {
        return this.data_nascimento;
    }

    public void setMatricula(int matricula) {
        this.matricula=matricula;
    }
    public int getMatricula() {
        return this.matricula;
    }

    public void setTurno(String turno) {
        this.turno=turno;
    }
    public String getTurno() {
        return this.turno;
    }

    public void setSalario(float salario) {
        this.salario=salario;
    }
    public float getSalario() {
        return this.salario;
    }
}