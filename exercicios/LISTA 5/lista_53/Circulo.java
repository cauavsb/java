package lista_53;
public class Circulo {
	public float raio;
    public float pi;
    public float area;
    public float perimetro;

    public Circulo (float r) {
        this.raio=r;
        this.pi=3.14f;
    }

    public float getRaio() {
        return this.raio;
    }
    public void setRaio(float r) {
        this.raio=r;
    }

    public float area() {
        return this.area=pi*(getRaio()*getRaio());
    }
    public float perimetro() {
    	return this.perimetro=2*pi*getRaio();
    }
}