package desafio_stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Verificar se todos os números são distintos

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Set<Integer> uniqueNumbers = numeros.stream()
                                            .collect(Collectors.toSet());
        boolean allDistinct = uniqueNumbers.size() == numeros.size();
        System.out.println(allDistinct);
    }
}

