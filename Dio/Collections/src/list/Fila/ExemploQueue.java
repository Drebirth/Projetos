package list.Fila;


/*
A implementacao do LinkedList
1. Garante ordem de inserção
2. Permite adicão, leitura e remoção considerando a básica de uma fila:
primeiro que entrar, primeiro que sai.
3. Não permite mudança de ordenação.



 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //poll
        //retorna é remove o primeiro elemento da fila
        String clienteASerAtendido = filaBanco.poll();

        System.out.println("Poll = " + clienteASerAtendido);

        System.out.println("Poll = " + filaBanco);

        //peek
        //Mesma funcao do poll so nao vai remover da fila
        String primeiroCliente = filaBanco.peek();

        System.out.println("Peek = " + primeiroCliente);

        System.out.println("Peek = " + filaBanco);

        //Element
        //Ele nao remove o elemento, simplesmente retornar o primeiro elemento
        //Caso a fila esteja vazia, ele vai lançar uma excecao
        String primeiroClienteOuErro = filaBanco.element();

        System.out.println("Element = " +primeiroClienteOuErro);

        System.out.println("Element = " +filaBanco);

        //forEach
        for (String client: filaBanco){
            System.out.println("For Each = " + client);
        }

        //Iterator
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("iterator = " +iteratorFilaBanco.next());
        }

        //Tamanho da fila
        System.out.println(filaBanco.size());

        //Se a lista esta vazia
        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");

        System.out.println(filaBanco);

    }
}
