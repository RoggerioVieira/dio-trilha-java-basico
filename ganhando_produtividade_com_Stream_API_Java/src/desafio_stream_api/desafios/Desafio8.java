package desafio_stream_api.desafios;

import java.util.Arrays;
import java.util.List;

//Somar os dígitos de todos os números
public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int sumOfDigits = numeros.stream()
                                 .flatMap(n -> String.valueOf(n).chars().mapToObj(c -> c - '0'))
                                 .mapToInt(Integer::intValue)
                                 .sum();
        System.out.println(sumOfDigits);
    }
}



