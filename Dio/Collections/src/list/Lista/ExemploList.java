package list.Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Daniel");
        nomes.add("Sandra");
        nomes.add("Laura");

        System.out.println(nomes);

//        nomes.set(2,"Larissa");
//
//        System.out.println(nomes);
//
//        Collections.sort(nomes);
//
//        int posicao = nomes.indexOf("Sandra");
//
//        System.out.println("A posicao de sandra é = " + posicao);
//
//        nomes.set(0,"Daniul");
//
//        System.out.println(nomes);
//
//        nomes.remove(0);
//
//        System.out.println(nomes);
//
//        nomes.remove("Larissa");
//
//        System.out.println(nomes);
//
//        String nome = nomes.get(0);
//
//        System.out.println(nome);
//
//        int tamanho = nomes.size();
//
//        System.out.println(tamanho);
//
//        boolean temAnderson = nomes.contains("Anderson");
//
//        System.out.println(temAnderson);
//
//        boolean temSandra = nomes.contains("Sandra");
//
//        System.out.println(temSandra);
//
//        nomes.clear();
//
//        boolean listaEstaVazia = nomes.isEmpty();
//
//        System.out.println(listaEstaVazia);

        //ler sobre os outros métodos
        //get, set , stream, addAll
        //métodos do List

        for (String nome: nomes ){
            System.out.println("For each = " + nome);

        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("While = "  +  iterator.next());
        }

        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(3);
        numeros.add(4);

        Iterator<Integer> num = numeros.iterator();

        while (num.hasNext()){
            System.out.println("While = "+ num.next());
        }




    }
}
