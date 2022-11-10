package dio;

public class Main3 {
    public static void main(String[] args) {
        Funcao3 funcao3 = valor -> {
            System.out.println(valor);
            System.out.println(valor);
            return valor;
        };
        funcao3.gerar("Daniel");
    }

}

@FunctionalInterface
interface Funcao3 {
    String gerar(String valor);
}