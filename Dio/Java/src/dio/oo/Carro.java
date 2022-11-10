package dio.oo;

public class Carro {

    String cor;
    String modelo;
    int capTanque;

    Carro(){}

    Carro(String cor, String modelo, int capTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capTanque = capTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapTanque(int capTanque){
        this.capTanque = capTanque;
    }

    int getCapTanque(){
        return capTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capTanque * valorCombustivel;
    }
    

}
