package list.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemploList {

    public static void main(String[] args){

        List<EstudanteExemplo> estudantes = new ArrayList<>();

        estudantes.add(new EstudanteExemplo("Pedro", 19));
        estudantes.add(new EstudanteExemplo("Carlos", 23));
        estudantes.add(new EstudanteExemplo("Mariana", 21));
        estudantes.add(new EstudanteExemplo("João", 18));
        estudantes.add(new EstudanteExemplo("Thiago",20));
        estudantes.add(new EstudanteExemplo("George", 22));
        estudantes.add(new EstudanteExemplo("Larrisa",21));

        System.out.println("--- ordem de inserção ---");
        System.out.println(estudantes + "\n");

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("--- ordem natural dos números - idade ---");
        System.out.println(estudantes + "\n");

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("--- ordem reversa dos números - idade ---");
        System.out.println(estudantes + "\n");

        estudantes.sort(Comparator.comparingInt(EstudanteExemplo::getIdade).reversed());
        System.out.println("--- ordem natural dos números - idade (method reference)");
        System.out.println(estudantes + "\n");

        //Ela precisa override compareTo pra usar a interface comparator
        Collections.sort(estudantes);
        System.out.println("--- ordem natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes+ "\n");

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("--- ordem reversa dos números - idade (interface Comparator) ---");
        System.out.println(estudantes);


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


    }
}
