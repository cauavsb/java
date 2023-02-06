package lista_114;
public class Retangulo implements ObjetoGeometrico {
    private float comprimento;
    private float largura;

    public Retangulo(float comprimento, float largura) {
        this.comprimento=comprimento;
        this.largura=largura;
    }

    public float calcularArea() {
        return getComprimento()*getLargura();
    };
    public float calcularPerimetro() {
        return (getComprimento()*2)+(getLargura()*2);
    };

    public void setComprimento(float comprimento) {
        this.comprimento=comprimento;
    }
    public float getComprimento() {
        return this.comprimento;
    }
    
    public void setLargura(float largura) {
        this.largura=largura;
    }
    public float getLargura() {
        return this.largura;
    }
}