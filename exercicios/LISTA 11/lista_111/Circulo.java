package lista_111;
public class Circulo extends Quadrilatero{
    private float pi;

    public Circulo(float raio) {
        super(raio);
        this.pi=3.14f;
    }

    public float calcularArea() {
        return this.pi*(super.getLado()*super.getLado());
    };
    public float calcularPerimetro() {
        return 2*this.pi*super.getLado();
    };

    public void setPi(float pi) {
        this.pi=pi;
    }
    public float getPi() {
        return this.pi;
    }
}