package desafio_stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filtrar os números primos da lista
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> primes = numeros.stream()
                                      .filter(Desafio17::isPrime)
                                      .collect(Collectors.toList());
        System.out.println(primes);
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
