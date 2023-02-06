package lista_112;
public class Homem extends PessoaIMC {

    public Homem(String nome, String data_nascimento, double peso, double altura) {
        super(nome,data_nascimento,peso,altura);
    }

    public double calculaIMC(double peso, double altura) {
        double calculo=peso/(altura*altura);
        return calculo;
    };

    public String resultIMC() {
        if(calculaIMC(super.getPeso(),super.getAltura())<20.7) {
            return "Abaixo do peso ideal";
        }
        else if(calculaIMC(super.getPeso(),super.getAltura())>20.7 && calculaIMC(super.getPeso(),super.getAltura())<26.4) {
            return "Peso ideal";
        }
        else {
            return "Acima do peso ideal";
        }
    };
}