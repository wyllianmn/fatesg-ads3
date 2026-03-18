
// Integrantes: Isaque Duarte, Jurandir Marques, phillipy Charles, Guilherme silva

public void removerPares() {
    while (cabeca != null && cabeca.getDado() % 2 == 0) {
        cabeca = cabeca.getProximo();
    }

    
    No atual = cabeca;
    while (atual != null && atual.getProximo() != null) {
        if (atual.getProximo().getDado() % 2 == 0) {
           
            atual.setProximo(atual.getProximo().getProximo());
           
        } else {
           
            atual = atual.getProximo();
        }
    }
}