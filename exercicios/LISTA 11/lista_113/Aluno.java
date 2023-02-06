package lista_113;
import java.util.ArrayList;
public interface Aluno {
    public float calcular_media(ArrayList<String> notas);
    public void adicionar(ArrayList<String> notas, String nota);
    public void remover(ArrayList<String> notas, String nota);
    public float mostrar(ArrayList<String> notas);
}