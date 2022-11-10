package collectionList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Desafio2 {
    /*
     * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
     * e armazene-as em uma lista. Após isto, calcule a média semestral das
     * temperaturas e mostre todas as temperaturas acima desta média, e em que mês
     * elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 Fevereiro e etc).
     */
    public static void main(String[] args) {

        System.out.println("Hello There!");
        List<Tempo> tempos = new ArrayList<>(){{
           add(new Tempo("Janeiro", 29d));
           add(new Tempo("Fevereiro", 25d));
           add(new Tempo("Março", 24.6));
           add(new Tempo("Abril", 33.5));
           add(new Tempo("Maio", 30.2));
           add(new Tempo("Junho", 27.3));
        }};
        System.out.println(tempos.toString());

        int i = 0;
        double soma = 0;
        double media = 0;
        for(Tempo tempo : tempos){
            soma += tempo.getTemperatura();
            media = soma/ tempos.size();
        }
        System.out.println(soma);
        System.out.println("A media: " + (soma / tempos.size()));
        for(Tempo tempo : tempos){
            if(tempo.getTemperatura() >= media ){
                i++;
                System.out.println("Mês superior a média semestral: " + i + " o " + tempo);
            }
        }
    }

}

class Tempo{
    private String mes;
    private Double temperatura;


    public Tempo(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Tempo{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}

