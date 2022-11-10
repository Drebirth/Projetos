package Evento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste {

    public static void main(String[] args){

        LocalDateTime agora = LocalDateTime.of(1998,02,02,15,10,00);

        System.out.println("LocalDateTime antes de formatar: " + agora);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String agoraFormatado =agora.format(formatter);

        System.out.println("LocalDateTime depois de formatar: " + agoraFormatado);
    }
}
