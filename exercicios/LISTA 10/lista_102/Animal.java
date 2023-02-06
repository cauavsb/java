package lista_102;
public class Animal {
    protected String nome;
    protected float comprimento;
    protected int num_patas;
    protected String cor;
    protected String ambiente;
    protected String velocidade;

    public Animal(String nome,float comprimento,int num_patas,String cor,String ambiente,String velocidade) {
        this.nome=nome;
        this.comprimento=comprimento;
        this.num_patas=num_patas;
        this.cor=cor;
        this.ambiente=ambiente;
        this.velocidade=velocidade;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome=nome;
    }

    public float getComprimento() {
        return this.comprimento;
    }
    public void setComprimento(float comprimento) {
        this.comprimento=comprimento;
    }

    public int getNum_patas() {
        return this.num_patas;
    }
    public void setNum_patas(int num_patas) {
        this.num_patas=num_patas;
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor=cor;
    }

    public String getAmbiente() {
        return this.ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente=ambiente;
    }

    public String getVelocidade() {
        return this.velocidade;
    }
    public void setVelocidade(String velocidade) {
        this.velocidade=velocidade;
    }
}