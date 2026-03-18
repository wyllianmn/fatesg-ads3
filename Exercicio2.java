// package fila;

/**
 *
 Autores:
 Wyllian Mariano Nogueira,
 Cassiano Abreu,
 Gabriel Naoki,
 Alexsander Nogueira

 **/

public class Exercicio2 {
    public No head;

    public void consultar() {
        if (head == null) {
            System.out.println("A lista está vazia!");
        }

        No aux = head;

        System.out.println("Lista: "+"\n");
        while (aux != null) {

            System.out.print("["+aux.getDado()+"]" + " -> ");
            aux = aux.getProximo();
        }
        System.out.println("null");
    }
}
