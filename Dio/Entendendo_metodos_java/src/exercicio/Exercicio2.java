package exercicio;

/*

2. A partir da hora do dia, informe a mensagem adequada: Bom dia,
Boa tarde e Boa noite.
*/
public class Exercicio2 {

    public static void bomDia() {
        System.out.println("Bom dia!");
    }

    public static void boaTarde() {
        System.out.println("Boa tarde!");
    }

    public static void boaNoite() {
        System.out.println("Boa noite!");
    }

    public static void main(String[] args) {

        double hora;
        hora = 5;

        if (hora >= 6 && hora < 12) {
            bomDia();

        }
        if (hora >= 12 && hora < 18) {
            boaTarde();
        }

        if (hora >= 18 && hora < 23.59) {
            boaNoite();
        }
    }

}
