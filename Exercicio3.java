// Autores:
// Caio Abreu
// Enzo Aquino
// Filipi Vieira
// João Victor Gonçalves


public class Exercicio3 {
    public No cabeca;

    public boolean buscar(int valor) {
        No atual = cabeca;

        while (atual != null) {
            if (atual.getDado() == valor) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }
}