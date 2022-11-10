package dio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

import dio.base.Order;

/*

        Order order = new Order("1234");

        System.out.println(order);
*/

public class MyFirstProgram {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        System.out.printf("%.2f%%%n", (B / A - 1) * 100);
    }
}
/*
 * //Nao deu certo O Filme Desafio 2/3
 * Scanner sc = new Scanner(System.in);
 * double A = sc.nextDouble();
 * double B = sc.nextDouble();
 * 
 * if (A <= B) {
 * // RESOLVER B - A DPS RESULTADO DE B - A / A DPS POR * 100
 * double rs = ((B - A) / A * 100);
 * System.out.println(rs + "%");
 * BigDecimal bd = new BigDecimal(rs).setScale(2, RoundingMode.HALF_UP);
 * System.out.println(bd.doubleValue() + "%");
 * }
 * }
 * /*
 * 
 * // System.out.println((A / B) * 100 / 2);
 * 
 * /*
 * //Desafio 1 tt
 * double raio;
 * double area;
 * raio = sc.nextDouble();
 * 
 * area = 3.14159 * (Math.pow(raio, 2));
 * System.out.println(area);
 */
/*
 * int N = 0;
 * N = sc.nextInt();
 * 
 * 
 * for (int i = 1; i <= N; i++) {
 * if (i % 2 == 0) {
 * System.out.println(i);
 * }
 * }
 */
