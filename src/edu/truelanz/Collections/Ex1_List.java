package edu.truelanz.collections;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex1_List { 

    public static Object lista;

    public static void main(String[] args) {
        
    

    //Criando Lists - Maneiras de criar "Lists"
/* 
    List notas = new ArrayList<>();
    List<Double> lista = new ArrayList<>(); // <Podendo criar com parametros também.
    ArrayList<Double> lista2 = new ArrayList<Double>(); // Pode ou não repetir o tipo de variável dentro dos "<>"
    List<Double> lista3 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3)); //sempre por o "d" nos números inteiros em "double."
    List<Double> lista4 = List.of(7d, 8.3, 9d, 3d, 7d, 0d, 3.6);
    //lista4.add(1d); - Esse método da lista4 não pode ser adcionado ou removido
    //lista4.remove(7d); - É uma coleção imutável.
    System.out.println(lista3); //Já a lista3 pode.
     */
     
    List<Double> lista = new ArrayList<>();
    lista.add(4.0);
    lista.add(7.0);
    lista.add(6.0);
    lista.add(5.0);
    lista.add(6.0);
    lista.add(9.0);
    
    System.out.println("Lista: " + lista.toString());

    System.out.println("---");

    //Ver a posição que determinado eletemento está na lista.
    System.out.println("Exibir posição da nota 5: " + lista.indexOf(5d));

    System.out.println("---");

    //maneira de adcionar um novo eletemento em determinada posição da lista.
    System.out.println("Adicione na lista a nota 8 na posição 4");
    lista.add(4, 8d);
    System.out.println(lista);

    System.out.println("---");

    //Substituir um determinado elemento por outro la lista.
    System.out.println("Substitua a nota 5 pela nota 9.3");
    lista.set(3, 9.3);
    System.out.println(lista);

    System.out.println("---");

    //Conferir se determinado elemento está na lista:
    System.out.println("Essa nota está na lista: " + lista.contains(5d));

    //uma outra maneira de Exibir lista em ordem:
    //System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
    //for (Double nota : lista) System.out.println(nota);

    System.out.println("---");

    //"Pegar"/Exibir um elemento da lista:
    System.out.println("Exiba a segunda nota da lista: " + lista.get(2));

    System.out.println("---");

    //Exibir o menor número através de comparações:
    System.out.println("Menor nota: " + Collections.min(lista));
    
    System.out.println("---");

    //Exibir o maior número através de comparações:
    System.out.println("Menor nota: " + Collections.max(lista));

    System.out.println("---");

    //Somar volores da lista:
    Iterator <Double> iterator = lista.iterator();
    Double soma = 0d;
    while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;      
    }
    System.out.println("Soma: " + soma);

    System.out.println("---");
    
    //Média das notas (size) <- a quantidade de elementos dentro da list:
    System.out.println("Exiba a média das notas é: " + (soma/lista.size()));
    
    System.out.println("---");
    
    //Conta quantos elementos tem em uma lista, começando do "1" e não do "0":
    System.out.println(lista.size());

    System.out.println("---");

    //Removendo um elemento da lista:
    lista.remove(4.0);
    System.out.println("Removendo a nota '4': " + lista);
    
    System.out.println("---");

    //Removendo um elemento da lista de acordo com sua posição:
    lista.remove(3);
    System.out.println("Removendo a nota que está na posição '3': " + lista);

    System.out.println("---");

    //Removendo ou adicionando notas < ou > que...
    Iterator <Double> iterator1 = lista.iterator();
    while(iterator1.hasNext()) {
        Double next = iterator1.next();
        if(next < 7) iterator1.remove();
    }
    System.out.println("Removida todas as notas menor que 7: " + lista);

    System.out.println("---");

    //Apagando todos os elementos da lista:
    //lista.clear(); //Ou: lista.removeAll(); 
    //System.out.println("Todas as notas foram removidas: " + lista);

    System.out.println("---");

    //isEmpty, está vazio?
    System.out.println("Conferindo se 'true' vazia ou 'false' com elementos: " + lista.isEmpty());

    System.out.println("---");

    //Criando uma nova lista com os elementos da primeira.
    List lista2 = new LinkedList<>(lista);
    System.out.println("Nova lista criada contendo os elementos da primeira lista: " + lista2);

    System.out.println("---");

    //Verificando o primeiro item da lista;
    System.out.println("Ver o primeiro item da lista: " + lista2.get(0));

    System.out.println("---");

    //Verificando o ultimo item da lista:
    System.out.println( lista2.size()-1); //Primeiro verifica o tamahanho da lista.
    System.out.println(lista2.get(2)); //Depois pucha no ultimo "index" da lista


  }
        
    
}
