package list.Map;

/*
1 - Crie um Map e execute as seguintes operações:
1.1 Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o
    nome do estado o valor.
1.2 Remova o estado de Minas Gerais
1.3 Adicione o Distrito Federal
1.4 Verificar o tamanho do mapa.
1.5 Remova  estado de Mato Grosso do Sul usando o nome.
1.6 Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA)
1.7 Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC).
1.8 Verifique se o estado de Maranhão existe no map buscando por seu nome.
 */

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args){

        Map<String, String> estados = new HashMap<>();

        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("DF", "Distrito Federal");
        estados.put("ES", "Espirito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernanbuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");

        System.out.println(estados.size());
        System.out.println(estados+ "\n");

        estados.remove("MG");

        System.out.println(estados.size());
        System.out.println(estados + "\n");

        //Não adiciona valores repetidos?
        estados.put("DF" , "Distrito Federal");
        System.out.println(estados);
        System.out.println(estados.size());

        //1.5 Remova  estado de Mato Grosso do Sul usando o nome.
        estados.remove("MT", "Mato Grosso");
        System.out.println(estados.size());
        System.out.println(estados);

        //1.6 Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA)
        for(Map.Entry<String, String>entry: estados.entrySet() ){
            // Isso também funciona no modo padrao
           // System.out.println(entry);
            //Maneira de pegar a key é o valor de forma custumizada
            System.out.println(entry.getValue()+ " -- " + entry.getKey());

        }

        //1.7 Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC).
        System.out.println(estados.containsKey("SC"));

        //1.8 Verifique se o estado de Maranhão existe no map buscando por seu nome.
        // Verificar a diferencia de acentuação
        //Problema
        System.out.println(estados.containsValue("Maranhão"));








    }
}
