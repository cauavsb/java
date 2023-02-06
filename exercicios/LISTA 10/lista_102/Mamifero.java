package lista_102;
public class Mamifero extends Animal{
    protected String alimento;

    public Mamifero(String nome,float comprimento,int num_patas,String cor,String ambiente,String velocidade,String alimento) {
        super(nome,comprimento,num_patas,cor,ambiente,velocidade);
        this.alimento=alimento;
    }

    public String getAlimento() {
        return this.alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento=alimento;
    }
}