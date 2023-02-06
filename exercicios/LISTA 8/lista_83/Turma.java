package lista_83;
import java.util.ArrayList;
public class Turma {
    public String codigo;
    public String nome;
    public int numero_alunos;
    public ArrayList<String> estudantes;

    public Turma(String c,String n,int numero_a,ArrayList e) {
        this.codigo=c;
        this.nome=n;
        this.numero_alunos=numero_a;
        this.estudantes=e;
    }

    public String getCodigo() {
        return this.codigo;
    }
    public void setCodigo(String c) {
        this.codigo=c;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome=n;
    }

    public int getNumero_alunos() {
        return this.numero_alunos;
    }
    public void setNumero_alunos(int numero_a) {
        this.numero_alunos=numero_a;
    }

    public ArrayList getEstudantes() {
        return this.estudantes;
    }
    public void setEstudantes(ArrayList e) {
        this.estudantes=e;
    }
}