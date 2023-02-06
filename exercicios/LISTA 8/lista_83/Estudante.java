package lista_83;
public class Estudante {
    public String matricula;
    public String aluno;
    public int nota_1;
    public int nota_2;
    public int nota_3;
    public int nota_4;

    public Estudante(String m,String a,int n_1,int n_2,int n_3,int n_4) {
        this.matricula=m;
        this.aluno=a;
        this.nota_1=n_1;
        this.nota_2=n_2;
        this.nota_3=n_3;
        this.nota_4=n_4;
    }

    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String m) {
        this.matricula=m;
    }

    public String getAluno() {
        return this.aluno;
    }
    public void setAluno(String a) {
        this.aluno=a;
    }

    public int getNota_1() {
        return this.nota_1;
    }
    public void setNota_1(int n_1) {
        this.nota_1=n_1;
    }

    public int getNota_2() {
        return this.nota_2;
    }
    public void setNota_2(int n_2) {
        this.nota_2=n_2;
    }

    public int getNota_3() {
        return this.nota_3;
    }
    public void setNota_3(int n_3) {
        this.nota_3=n_3;
    }

    public int getNota_4() {
        return this.nota_4;
    }
    public void setNota_4(int n_4) {
        this.nota_4=n_4;
    }
}