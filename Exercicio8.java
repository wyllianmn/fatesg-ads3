class Exercicio8 {
    No inicio;

    public void inserirFim(int valor) {
        No novo = new No();
        novo.setDado(valor);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        No atual = inicio;
        while (atual.getProximo() != null) {   
            atual = atual.getProximo();         
        }

        atual.setProximo(novo);                 
    }

    public int menor() {
        if (inicio == null) {
            throw new RuntimeException("Lista vazia");
        }

        int menorValor = inicio.getDado();      
        No atual = inicio;

        while (atual != null) {
            if (atual.getDado() < menorValor) { 
                menorValor = atual.getDado();   
            }
            atual = atual.getProximo(); 
        }

        return menorValor;
    }
}