package dio;

public class Main2 {

    public static void main(String[] args) {
        Funcao colocarPrefixo = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixo.gerar("Jão"));
    }
}

@FunctionalInterface
interface Funcao {
    String gerar(String valor);
}