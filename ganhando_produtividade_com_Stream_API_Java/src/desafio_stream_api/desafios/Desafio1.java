package desafio_stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Ordenar a lista em ordem crescente

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> sortedList = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);

    }
}
