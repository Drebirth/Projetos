package list.Comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Exercicio
        /*
        1 - Crie uma lista de um objeto complexo e execute as seguintes operacoes:
        . Adicione elementos nesta lista.
        . Ordene implementando a interfce java.util.Comparator no seu objeto complexo.
        . Ordene implementando um novo objeto com a interface java.util.Comparable
        . Ordene usando uma expressão lambda na chamada de suaLista,sort()
        . Ordene usando referências de métodos e os métodos estáticos de Comparator
        . Ordene coleções TreeSet e TreeMap

         */
public class ExercicioComparators {
    public static void main(String[] args){
        List<EstudanteExemplo> estudanteExemplos = new ArrayList<>();

        estudanteExemplos.add(new EstudanteExemplo("Daniel", 23));
        estudanteExemplos.add(new EstudanteExemplo("Sandra", 20));
        estudanteExemplos.add(new EstudanteExemplo("Laura", 6));
        estudanteExemplos.add(new EstudanteExemplo("Deyse", 18));
        estudanteExemplos.add(new EstudanteExemplo("Vanda", 49));
        estudanteExemplos.add(new EstudanteExemplo("Daniel", 48));

        System.out.println("Tamanho da lista " +estudanteExemplos.size());
        System.out.println("Ordem de inserção: " +estudanteExemplos);
        System.out.println("\n");

        //Orden Comparator
        estudanteExemplos.sort(Comparator.comparing(EstudanteExemplo::getNome));
        System.out.println("Ordem de Comparator.comparing :" + estudanteExemplos);



    }
}
