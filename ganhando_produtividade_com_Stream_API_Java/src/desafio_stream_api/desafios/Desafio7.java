package desafio_stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Encontrar o segundo número maior da lista
public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,  5, 4, 3);
        List<Integer> sortedList = numeros.stream()
                                          .distinct()
                                          .sorted((a, b) -> b - a)
                                          .collect(Collectors.toList());
        if (sortedList.size() > 1) {
            System.out.println(sortedList.get(1));
        } else {
            System.out.println("A lista não possui um segundo número maior.");
        }
    }
}













