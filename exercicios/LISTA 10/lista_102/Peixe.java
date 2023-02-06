package lista_102;
public class Peixe extends Animal{
    protected int barbatanas;
    protected float calda;

    public Peixe(String nome,float comprimento,int num_patas,String cor,String ambiente,String velocidade,int barbatanas,float calda) {
        super(nome,comprimento,num_patas,cor,ambiente,velocidade);
        this.barbatanas=barbatanas;
        this.calda=calda;
    }

    public int getBarbatanas() {
        return this.barbatanas;
    }
    public void setBarbatanas(int barbatanas) {
        this.barbatanas=barbatanas;
    }

    public float getCalda() {
        return this.calda;
    }
    public void setCalda(float calda) {
        this.calda=calda;
    }
}