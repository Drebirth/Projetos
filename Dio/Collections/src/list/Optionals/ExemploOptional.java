package list.Optionals;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args){

        Optional<String> optionalString = Optional.of("Valor opcional");

        System.out.println(optionalString);

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println,
                () -> System.out.println("Valor não está presente"));

        if(optionalString.isPresent()){
            String valor = optionalString.get();

            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("***")).ifPresent(System.out::println);

        optionalString.orElseThrow(IllegalStateException::new);


    }
}

/*
1 - Crie um optional de um determinado tipo de dado
. Crie com estado vazio, estado presente, e com null
. Se presente, exiba o valor no console
. Se vazio, lançe uma exceção llegalStateException
. Se vazio, exiba "Opitional vazio" no console
. Se presente, transforme o valor do optional e exiba no console
. Se presente, pegue o valor do optional e atribua em uma variavel
. Se presente, filtre o optional com uma determinada regra de négocio
 */
