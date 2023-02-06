package lista_111;
abstract class Quadrilatero {
    private float lado;

    public Quadrilatero(float lado) {
        this.lado=lado;
    }

    public abstract float calcularArea();
    public abstract float calcularPerimetro();

    public void setLado(float lado) {
        this.lado=lado;
    }
    public float getLado() {
        return this.lado;
    }
}