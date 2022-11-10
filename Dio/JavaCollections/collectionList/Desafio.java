package collectionList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Resolva esses exercicios utilizando os métodos da implementação LinledList
public class Desafio {

    public static void main(String[] args) {

        System.out.println(
                "Crie uma lista chamada notas2" + "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.5);
        notas2.add(6.7);
        notas2.add(5.6);
        notas2.add(3.0);
        notas2.add(5.0);
        notas2.add(9.0);
        notas2.add(9.6);
        notas2.add(5.5);
        System.out.println(notas2.toString());

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        Double nota = notas2.get(0);
        System.out.println(nota);

        System.out.println("Mostre a primeira nota da lista removendo-o: ");
        Double nota1 = notas2.get(0);
        notas2.remove(nota1);
        System.out.println("Nota que foi removida: " + nota1);
        System.out.println(notas2.toString());

    }
}
