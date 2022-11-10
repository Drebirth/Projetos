package collectionList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        // List notas = new ArrayList<>();
        // List<Double> notas = new ArrayList<Double>();
        // ArrayList<Double> notas =new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d,
        // 0d, 3.6));

        // Não se consegue adicionar mais valores
        /*
         * List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
         * notas.add(10d); System.out.println(notas);
         */

        // Não é possivel adicionar ou remover essa lista
        /*
         * List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //notas.add(1d);
         * notas.remove(5d); System.out.println(notas);
         */

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(0.0);
        notas.add(5.0);
        notas.add(3.0);
        notas.add(7.7);
        notas.add(2.4);
        notas.add(9.6);
        System.out.println(notas);
        // ou
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela nota 7.0");
        notas.set(2, 7.0);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas)
            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Exibe a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        // Size retorna um inteiro que significa a quantidade de elementos dentro do
        // list
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Reomva a nota 0: ");
        notas.remove(0d);
        System.out.println(notas.toString());

        System.out.println("Reomva a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);
        /*
         * System.out.println("Apague toda a lista"); notas.clear();
         * System.out.println(notas.toString());
         */

        System.out.println("Confira se a lista está vazia " + notas.isEmpty());

    }
}