package list.Map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args){

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        // Remove um estudante no índice 0
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        // Recupera um estudante no índice 2
        int idadeEstudante = estudantes.get("Mariana");

        System.out.println(idadeEstudante);

        System.out.println(estudantes.size());

        // Navega nos registros do mapa
        for(Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        //  Navega nos registros do mapa
        for(String key : estudantes.keySet()){
            System.out.println(key + " -- " + estudantes.get(key));
        }
    }
}
/*
1 - Crie um Map e execute as seguintes operações:
1.1 Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o
    nome do estado o valor.
1.2 Remova o estado de Minas Gerais
1.3 Adicione o Distrito Federal
1.4 Verificar o tamanho do mapa.
1.5 Remova  estad de Mato Grosso do Sul usando o nome.
1.6 Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA)
1.7 Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC).
1.8 Verifique se o estado de Maranhão existe no map buscando por seu nome.
 */
