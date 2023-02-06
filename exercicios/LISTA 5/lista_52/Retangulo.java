package lista_52;
public class Retangulo {
	public float base;
    public float altura;
    public float area;
    public float perimetro;

    public Retangulo (float b, float h) {
        this.base=b;
        this.altura=h;
    }

    public float getBase() {
        return this.base;
    }
    public float getAltura() {
        return this.altura;
    }
    public void setBase(float b) {
    	this.base=b;
    }
    public void setAltura(float h) {
        this.altura=h;
    }

    public float area() {
        return this.area=getBase()*getAltura();
    }
    public float perimetro() {
    	return this.perimetro=(getBase()*2)+(getAltura()*2);
    }
}