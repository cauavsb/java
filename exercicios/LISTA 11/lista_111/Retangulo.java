package lista_111;
public class Retangulo extends Quadrilatero {
    private float altura;

    public Retangulo(float lado, float altura) {
        super(lado);
        this.altura=altura;
    }

    public float calcularArea() {
        return super.getLado()*this.altura;
    };
    public float calcularPerimetro() {
        return (super.getLado()*2)+(this.altura*2);
    };
    
    public void setAltura(float altura) {
        this.altura=altura;
    }
    public float getAltura() {
        return this.altura;
    }
}