public class Main {

    private static No montarLista(int[] valores) {
        No cabeca = new No();
        cabeca.setDado(valores[0]);
        No atual = cabeca;
        for (int i = 1; i < valores.length; i++) {
            No novo = new No();
            novo.setDado(valores[i]);
            atual.setProximo(novo);
            atual = novo;
        }
        return cabeca;
    }

    private static void imprimir(No cabeca) {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.getDado() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        int[] valores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Exercicio 1 - inserir no inicio e no final
        System.out.println("===== Exercicio 1 =====");
        exercicio1 ex1 = new exercicio1();
        for (int v : valores) ex1.inserirNoFinal(v);
        ex1.inserirNoInicio(5);
        System.out.println("inserirNoFinal(10..100) + inserirNoInicio(5):");
        imprimir(ex1.cabeca);

        // Exercicio 2 - imprimir lista
        System.out.println("\n===== Exercicio 2 =====");
        Exercicio2 ex2 = new Exercicio2();
        ex2.head = montarLista(valores);
        ex2.consultar();

        // Exercicio 3 - buscar
        System.out.println("\n===== Exercicio 3 =====");
        Exercicio3 ex3 = new Exercicio3();
        ex3.cabeca = montarLista(valores);
        System.out.println("buscar(30): " + ex3.buscar(30));
        System.out.println("buscar(99): " + ex3.buscar(99));

        // Exercicio 4 - remover elemento especifico
        System.out.println("\n===== Exercicio 4 =====");
        Exercicio4 ex4 = new Exercicio4();
        ex4.inicio = montarLista(valores);
        System.out.print("antes:  "); imprimir(ex4.inicio);
        ex4.excluir(50);
        System.out.print("depois: "); imprimir(ex4.inicio);

        // Exercicio 5 - inserir na posicao
        System.out.println("\n===== Exercicio 5 =====");
        Exercicio5 ex5 = new Exercicio5();
        ex5.cabeca = montarLista(valores);
        System.out.print("antes:  "); imprimir(ex5.cabeca);
        ex5.inserirNaPosicao(99, 3);
        System.out.print("depois: "); imprimir(ex5.cabeca);

        // Exercicio 6 - contar
        System.out.println("\n===== Exercicio 6 =====");
        exercico06 ex6 = new exercico06();
        ex6.cabeca = montarLista(valores);
        imprimir(ex6.cabeca);
        System.out.println("contar(): " + ex6.contar());

        // Exercicio 7 - maior valor
        System.out.println("\n===== Exercicio 7 =====");
        Exercicio7 ex7 = new Exercicio7();
        ex7.head = montarLista(valores);
        imprimir(ex7.head);
        System.out.println("getMaior(): " + ex7.getMaior());

        // Exercicio 8 - menor valor
        System.out.println("\n===== Exercicio 8 =====");
        Exercicio8 ex8 = new Exercicio8();
        for (int v : valores) ex8.inserirFim(v);
        imprimir(ex8.inicio);
        System.out.println("menor(): " + ex8.menor());

        // Exercicio 9 - remover primeiro
        System.out.println("\n===== Exercicio 9 =====");
        Exercicio9 ex9 = new Exercicio9();
        ex9.inicio = montarLista(valores);
        System.out.print("antes:  "); imprimir(ex9.inicio);
        ex9.removerPrimeiro();
        System.out.print("depois: "); imprimir(ex9.inicio);

        // Exercicio 10 - remover ultimo
        System.out.println("\n===== Exercicio 10 =====");
        Exercicio10 ex10 = new Exercicio10();
        ex10.cabeca = montarLista(valores);
        System.out.print("antes:  "); imprimir(ex10.cabeca);
        ex10.removerUltimo();
        System.out.print("depois: "); imprimir(ex10.cabeca);

        // Exercicio 11 - inverter
        System.out.println("\n===== Exercicio 11 =====");
        Exercicio11 ex11 = new Exercicio11();
        ex11.head = montarLista(valores);
        System.out.print("antes:  "); imprimir(ex11.head);
        ex11.inverter();
        System.out.print("depois: "); imprimir(ex11.head);

        // Exercicio 12 - remover pares
        System.out.println("\n===== Exercicio 12 =====");
        Exercicio12 ex12 = new Exercicio12();
        ex12.cabeca = montarLista(new int[]{10, 15, 20, 25, 30, 35, 40});
        System.out.print("antes:  "); imprimir(ex12.cabeca);
        ex12.removerPares();
        System.out.print("depois: "); imprimir(ex12.cabeca);
    }
}