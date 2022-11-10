package list.Comparators;
import java.util.Comparator;

/*
Interface comparator tem o metodo abstraco de comparacao entre dois objetos
 não deve ser usada em classes de dominio
 deve ser usada em classes externas
 */

public class EstudanteOrdemIdadeReversaComparator implements Comparator<EstudanteExemplo> {

    @Override
    public int compare(EstudanteExemplo o1, EstudanteExemplo o2){
        return o2.getIdade() - o1.getIdade();
    }
}
