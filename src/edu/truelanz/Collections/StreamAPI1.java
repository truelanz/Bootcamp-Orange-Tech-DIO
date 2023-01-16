package edu.truelanz.Collections;

import java.util.Arrays;
//import java.util.Collection;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPI1 {

    public static void main(String[] args) {
        
        List<String> numerosAleatorios = 
        Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        
    //Imprima todos os elementos dessa lista de String:
    /* numerosAleatorios.stream().forEach(new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println(s);
        }});
        
    //USANDO LAMBDA
    numerosAleatorios.stream().forEach(s ->
        System.out.println(s)); */

            
    //USANDO REFERENCE METHOD    
    numerosAleatorios.forEach(System.out::println);

    System.out.println("\n---");

    //Pegue os cinco primeiros números e coloque dentro de um Set:
    numerosAleatorios.stream()
    .limit(5)
    .collect(Collectors.toSet())
    .forEach(System.out::println);

    System.out.println("\n---");

    //Transforme esta lista de String em uma lista de números inteiros:
    numerosAleatorios.stream()
    //.map(s -> Integer.parseInt(s)); //LAMBDA
    .map(Integer::parseInt) //REFERENCE METHOD
    .collect(Collectors.toList())
    .forEach(System.out::println);

    System.out.println("---");

    //Mostre os números pares maiores do que 2 da sua lista:
    /* List<Integer> ListParMaiorQue2 = numerosAleatorios.stream()
    .map(Integer::parseInt)
    .filter(i -> (i% 2 ==0 && i > 2)).collect(Collectors.toList());
    .forEach(System.out::println);   */

    List<Integer> ListParMaiorQue2 = numerosAleatorios.stream()
    .map(Integer::parseInt)
    .filter(i -> (i% 2 ==0 && i > 2)).collect(Collectors.toList());
    System.out.println(ListParMaiorQue2);

    System.out.println("---");

    //Mostre a média dos números:
    numerosAleatorios.stream()
    .mapToInt(Integer::parseInt)
    .average()
    .ifPresent(System.out::println);

    System.out.println("---");

    //Remova os valores ímpares; 
    List<Integer> numerosAleatoriosRemoverImpar = numerosAleatorios.stream()
    .map(Integer::parseInt)
    .collect(Collectors.toList());

    numerosAleatoriosRemoverImpar.removeIf(i -> (i % 2 !=0));
    System.out.println(numerosAleatoriosRemoverImpar);


    }
}
