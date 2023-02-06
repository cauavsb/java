package lista_111;
public class Quadrado extends Quadrilatero {

    public Quadrado(float valor) {
        super(valor);
    }

    public float calcularArea() {
        return super.getLado()*super.getLado();
    };
    public float calcularPerimetro() {
        return super.getLado()*4;
    };
}