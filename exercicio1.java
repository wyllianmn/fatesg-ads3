public class exercicio1 {
    
    public No cabeca;

    public void inserirNoInicio(int valor) {
        No novoNo = new No();
        novoNo.setDado(valor);
        
        novoNo.setProximo(cabeca);
        cabeca = novoNo;
    }

    public void inserirNoFinal(int valor) {
        No novoNo = new No();
        novoNo.setDado(valor);

        if (cabeca == null) {
            cabeca = novoNo;
            return;
        }

        No atual = cabeca;
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }
        atual.setProximo(novoNo);
    }
}