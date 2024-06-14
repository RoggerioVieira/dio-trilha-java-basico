package desafio_stream_api.desafios;

import java.util.Arrays;
import java.util.List;

//Verifique se todos os números da lista são iguais
public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean allEqual = numeros.stream()
                                  .distinct()
                                  .count() == 1;
        System.out.println(allEqual);
    }
}

