package lista_114;
public class Circulo implements ObjetoGeometrico{
    private float raio;
    private float pi;

    public Circulo(float raio, float pi) {
        this.raio=raio;
        this.pi=pi;
    }

    public float calcularArea() {
        return getPi()*(getRaio()*getRaio());
    };
    public float calcularPerimetro() {
        return 2*getPi()*getRaio();
    };

    public void setRaio(float raio) {
        this.raio=raio;
    }
    public float getRaio() {
        return this.raio;
    }

    public void setPi(float pi) {
        this.pi=pi;
    }
    public float getPi() {
        return this.pi;
    }
}