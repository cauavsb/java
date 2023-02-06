package lista_62;
public class Estudante {
    public String nome;
    public int matricula;
    public float nota_1,nota_2;
    public float media;
    public String nome_pela_matricula;
    public int matricula_estudante;

    public Estudante(String n,int m,float n1,float n2) {
        this.nome=n;
        this.matricula=m;
        this.nota_1=n1;
        this.nota_2=n2;
    }

    public float getNota_1() {
        return this.nota_1;
    }
    public void setNota_1(float n1) {
        this.nota_1=n1;
    }
    public float getNota_2() {
        return this.nota_2;
    }
    public void setNota_2(float n2) {
        this.nota_2=n2;
    }
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int m) {
        this.matricula=m;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome=n;
    }

    public float media() {
        return this.media=(getNota_1()+getNota_2())/2;
    }
    public String nome_pela_matricula() {
        return this.nome_pela_matricula=getNome();
    }
    public int matricula_estudante() {
        return this.matricula_estudante=getMatricula();
    }
}
