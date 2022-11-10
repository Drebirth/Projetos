package list.Optionals;

import java.util.Optional;

/*
Optionals
1. Tratamento para valores que podem ser nulos
1.1 Possui 2 estados
    1.2 Presente
    1.3 Vazio
1.4 Permite que você execute operações em valores que podem ser nulos
sem preocupaçã com as famosas NullPointerExceptions
 */

public class ExemploOptionalEstados {
    public static void main(String[] args){

        //Se receber um valor nulo ele dá um noPointExcess
    Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        //Se o valor for nulo ele vai retornar o valor que nao esta presente
    Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não estpa presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));


   Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = não está presente"));


  Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro =  não está presente"));

    }
}
