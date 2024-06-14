package desafio_stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Encontrar o maior número primo
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> maiorPrimo = numeros.stream()
                                              .filter(Desafio14::isPrime)
                                              .max(Integer::compareTo);
        if (maiorPrimo.isPresent()) {
            System.out.println(maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
















