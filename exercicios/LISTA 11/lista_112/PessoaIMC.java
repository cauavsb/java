package lista_112;
abstract class PessoaIMC extends Pessoa {
    private double peso;
    private double altura;

    public PessoaIMC(String nome, String data_nascimento, double peso, double altura) {
        super(nome,data_nascimento);
        this.peso=peso;
        this.altura=altura;
    }

    public abstract double calculaIMC(double altura, double peso) ;
    public abstract String resultIMC();

    public void info() {
        System.out.println("Nome: "+super.getNome());
        System.out.println("Data de nascimento: "+super.getData_nascimento());
        System.out.println("Peso: "+this.peso);
        System.out.println("Altura: "+this.altura);
    };

    public void setPeso(double peso) {
        this.peso=peso;
    }
    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double altura) {
        this.altura=altura;
    }
    public double getAltura() {
        return this.altura;
    }
}