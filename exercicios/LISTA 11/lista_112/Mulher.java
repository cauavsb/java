package lista_112;
public class Mulher extends PessoaIMC {

    public Mulher(String nome, String data_nascimento, double peso, double altura) {
        super(nome,data_nascimento,peso,altura);
    }

    public double calculaIMC(double peso, double altura) {
        double calculo=peso/(altura*altura);
        return calculo;
    };

    public String resultIMC() {
        if(calculaIMC(super.getPeso(),super.getAltura())<19) {
            return "Abaixo do peso ideal";
        }
        else if(calculaIMC(super.getPeso(),super.getAltura())>19 && calculaIMC(super.getPeso(),super.getAltura())<25.8) {
            return "Peso ideal";
        }
        else {
            return "Acima do peso ideal";
        }
    };
}