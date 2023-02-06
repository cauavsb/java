package lista_51;
public class Estudante {
    public String nome;
    public int matricula;
    public String endereco;
    public float nota_1,nota_2,nota_3,nota_4;
    public float media;
    public int numero_matricula;
    public String endereco_aluno;

    public Estudante(String n,int m, String end,float n1,float n2,float n3, float n4) {
        this.nome=n;
        this.matricula=m;
        this.endereco=end;
        this.nota_1=n1;
        this.nota_2=n2;
        this.nota_3=n3;
        this.nota_4=n4;
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
    public float getNota_3() {
        return this.nota_3;
    }
    public void setNota_3(float n3) {
        this.nota_3=n3;
    }
    public float getNota_4() {
        return this.nota_4;
    }
    public void setNota_4(float n4) {
        this.nota_4=n4;
    }
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int m) {
        this.matricula=m;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String end) {
        this.endereco=end;
    }

    public float media() {
        return this.media=(getNota_1()+getNota_2()+getNota_3()+getNota_4())/4;
    }
    public int numero_matricula() {
        return this.numero_matricula=getMatricula();
    }
    public String endereco_aluno() {
        return this.endereco_aluno=getEndereco();
    }
}