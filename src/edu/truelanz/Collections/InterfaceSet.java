package edu.truelanz.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterfaceSet {

    public static void main(String[] args) {
        
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("\n" + notas.toString());

        //Confira se a nota 5.0 está no conjunto:
        System.out.println("\nA nota 5 está no conjunto?: " + notas.contains(5d));

        //Exiba a menor nota:
        System.out.println("\nA menor nota é: " + Collections.min(notas));

        //Exiba a maior nota:
        System.out.println("\nA menor nota é: " + Collections.max(notas));

        //Exiba a soma dos valores:
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("\nA soma dos valores é: " + soma);

        //Exiba a média das notas:
        System.out.println("\nA média das notas é: " + soma/notas.size());

        //Remova a nota 0:
        notas.remove(0d);
        System.out.println("\n" + notas + " Nota 0 removida.");

        //Remova notas menores que 7 e exiba a lista.
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            double next = iterator1.next();
            if(next < 7) iterator1.remove();            
        }
        System.out.println("\n" + notas + " Notas menores que 7 removidas.");
        
        //Exiba todas as notas na ordem em que foram informadas:
        //LinkedHashSet e não HashSet(aleatória);
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("\n" + notas2);
        
        /*Exiba as notas em ordem crescente:
         * O método de interface "TreeSet" Mostra os elementos em
         * ordem naturalmente.*/
        Set<Double> notas3 = new TreeSet<>(notas2); //nota2 porque está em Double, e Double tem o método "Comparable"
        System.out.println("\nOrdem crescente: " + notas3);

        //Exiba em ordem decrescente em TreeSet:
        TreeSet<Double> notas3Reverse = (TreeSet<Double>) ((TreeSet<Double>) notas3).descendingSet();
        System.out.println("\nOrdem decrescente: " + notas3Reverse);

        //Apague um conjunto e confira se está Vazio:
        notas.clear();
        System.out.println("\n'notas' está vazio? " + notas.isEmpty());
        System.out.println("\n'notas2 está vazio? " + notas2.isEmpty());
        System.out.println("\n'notas3' está vazio? " + notas3.isEmpty() + "\n");
   

    }

}
