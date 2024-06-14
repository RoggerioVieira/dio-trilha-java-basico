package desafio_stream_api.desafios;

import java.util.Arrays;
import java.util.List;

//Verificar se todos os números são positivos
public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean allPositive = numeros.stream()
                                     .allMatch(n -> n > 0);
        System.out.println(allPositive);
    }
}







 
 
 
 


 
 
