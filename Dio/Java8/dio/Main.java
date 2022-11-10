package dio;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello there!");

        Funcao1 funcao = valor -> valor;
    }

}

// interface funcional
@FunctionalInterface
interface Funcao1 {
    String gerar(String valor);
}