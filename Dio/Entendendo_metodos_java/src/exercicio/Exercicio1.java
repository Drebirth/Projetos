package exercicio;

/*
1. Calcule as 4 operações básicas:soma, subtração, multiplicação e divisão. 
Sempre 2 valores devem ser passados.
*/
public class Exercicio1 {

    public static void soma(int a, int b) {
        System.out.println("O valor da soma será: " + (a + b));
    }

    public static void subtracao(int a, int b) {
        System.out.println("O valor da subtração será: " + (a - b));
    }

    public static void multiplicacao(int a, int b) {
        System.out.println("O valor da multiplicação será: " + (a * b));
    }

    public static void divisao(float a, float b) {
        System.out.println("O valor da divisão será: " + (a / b));
    }

    public static void main(String[] args) {

        soma(5, 6);
        subtracao(10, 8);
        multiplicacao(40, 30);
        divisao(1250, 30);
    }

}
