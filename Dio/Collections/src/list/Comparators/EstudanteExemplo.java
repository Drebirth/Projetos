package list.Comparators;

public class EstudanteExemplo  implements  Comparable<EstudanteExemplo>{

    private final String nome;
    private final Integer idade;

    public EstudanteExemplo(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){return  nome;}

    public Integer getIdade(){return idade;}

    @Override
    public String toString(){return  nome + " -- " + idade;}

    /*
    Temos que retornar um desses 3 números
    1
    0
   -1
     */
    @Override
    public int compareTo(EstudanteExemplo o) {
        return this.getIdade() - o.getIdade();
    }
}
