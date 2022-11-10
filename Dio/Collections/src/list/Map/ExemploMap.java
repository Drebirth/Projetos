package list.Map;

import java.util.HashMap;
import java.util.Map;

/*
Java util Map
1.0 Entrada de chave e valor
1.1 Permite valores repetidos, mas não permite repetição de chave
1.2 Permite adição, busca por chave ou valor, atualização, remoção e navegação.
1.3 Pode ser ordenado.
 */
public class ExemploMap {

    public static void main(String[] args){

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        // Adiciona os campeões mundiais fifa no mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        // Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa);

        // Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        // Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("Franca"));

        // Remove o campeão Franca
        campeoesMundialFifa.remove("Franca");

        // Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        // Retorna se existe ou não  alguma seleção hexa campeã
        System.out.println(campeoesMundialFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        // Navega nos registro do mapa
        for(Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println("\n");

        // Navega nos registro do mapa
        for (String key : campeoesMundialFifa.keySet()){
            System.out.println(key + " -- " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        // Verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        // Verifica se o mapa contem o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        // Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());

    }

}
