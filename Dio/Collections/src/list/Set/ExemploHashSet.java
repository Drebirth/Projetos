package list.Set;

/*
Java util Set

1 - Por padrao, nao garante ordem
2 - Não permite itens repetidos
3 - Permite adição e remoção normalmente. Não possui busca por item e atualizacoes.
Para leitura, apenas navegação.
4 - Não permite mudança de ordenação


 */

/*
HashSet = Quando nao é necessário manter uma ordenação
LinkedHashSet = Quando é necessário manter a ordem de inserção dos elementos
TreeSet = Quando é necessário alterar a ordem através do uso de comparators

 */


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {


        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        // Não garante a ordem de inserção
        System.out.println(notasAlunos);

        // Remove a nota do set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        // Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        // Retorna a quantidade de itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Double nota: notasAlunos){
            System.out.println(nota);
        }

        //notasAlunos.clear();

        // Retorna se o set está vazio ou nao
        System.out.println(notasAlunos.isEmpty());
    }
}
