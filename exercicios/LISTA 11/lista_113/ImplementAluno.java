package lista_113;
import java.util.ArrayList;
public class ImplementAluno implements Aluno{
    public float calcular_media(ArrayList<String> notas) {
        int i=0;
        float acumulador=0;
        for(i=0;i<notas.size();i++) {
            acumulador+=Float.parseFloat(notas.get(i));
        }
        return acumulador/notas.size();
    };

    public void adicionar(ArrayList<String> notas, String nota) {
        notas.add(nota);
    };

    public void remover(ArrayList<String> notas) {
        int indice=notas.size();
        notas.remove(indice-1);
    };

    public float mostrar(ArrayList<String> notas) {
        int i=0;
        float maior=0;
        for(i=0;i<notas.size();i++) {
            if(Float.parseFloat(notas.get(i))>maior) {
                maior=Float.parseFloat(notas.get(i));
            }
        }
        return maior;
    }
}