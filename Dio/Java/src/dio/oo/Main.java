package dio.oo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapTanque());
        System.out.println(carro1.totalValorTanque(6.46));
    }
}
