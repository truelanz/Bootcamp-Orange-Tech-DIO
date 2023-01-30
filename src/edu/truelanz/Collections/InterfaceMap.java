package edu.truelanz.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/* Dado os modelos do carros e seus respectivos consumos na estrada faça:
modelo gol - consumo = 14,4 km/l
modelo uno - consumo = 15,6 km/l
modelo mobi - consumo = 16,1 km/l
modelo hb20 - consumo = 14,5 km/l
modelo kwid - consumo = 15,6 km/l */

public class InterfaceMap {
    public static void main(String[] args) {


    //Crie um dicionário e relacione os modelos e seus respectivos consumos (put):
    Map<String, Double> carrosPopulares = new HashMap<>(){{
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
    }};
    System.out.println(carrosPopulares.toString());

    //Substitua o consumo do gol por 15,2 km/l (put)
    carrosPopulares.put("gol", 15.2);
    System.out.println("\n" + carrosPopulares);

    //Confira se o modelo Tucson está no dicionário (containskey)
    System.out.println("\nO modelo Tucson está na lista? " + carrosPopulares.containsKey("Tucson"));
   
    //Exiba o consumo do uno: (get)
    System.out.println("\nO consumo do uno: " + carrosPopulares.get("uno"));

    //Exiba o terceiro modelo adicionado
    // **Não existe esse método em Map**

    //Exiba os modelos: (Interface Set e .KeySet)
    Set<String> modelos = carrosPopulares.keySet();
    System.out.println("\n" + modelos);

    //Exiba o consumo dos carros (Collection<Double> e .values):
    Collection<Double> consumo = carrosPopulares.values();
    System.out.println("\n" + consumo);

    //Exiba o modelo mais economico (Colections.max, .values,
    // Set<Entry>, .entrySet, for each, getvalue, .equals e .getKey):
    Double menorConsumo = Collections.max(carrosPopulares.values());
    Set<Entry<String, Double>> entries = carrosPopulares.entrySet();
    String modeloMenorConsumo = "";
    for (Entry<String,Double> entry : entries) {
         if(entry.getValue().equals(menorConsumo))
         modeloMenorConsumo = entry.getKey();
        }
        System.out.println("\nMais econômico: " + modeloMenorConsumo + " - " + menorConsumo);

    //Exiba o modelo menos econômico só muda o (Collections.min):
    Double maiorConsumo = Collections.min(carrosPopulares.values());
    Set<Entry<String, Double>> entries1 = carrosPopulares.entrySet();
    String modeloMaiorConsumo = "";
    for (Entry<String,Double> entry1 : entries1) {
        if(entry1.getValue().equals(maiorConsumo))
        modeloMaiorConsumo = entry1.getKey();
    }
    System.out.println("\nMenos econômico: " + modeloMaiorConsumo + " " + maiorConsumo);

    //Exiba a Soma dos consumos (.iterator, .hasNext e .next): 
    Iterator<Double> iterator = carrosPopulares.values().iterator();
    double soma = 0;
    while(iterator.hasNext()){
        soma += iterator.next();
    }
    System.out.println("\nSoma: " + soma);

    // Exiba a média da soma do dicionário:
    Map<String, Double> carrosPopulares2 = carrosPopulares;
    System.out.println("\nMédia: " + soma / carrosPopulares2.size());

    //Remova os modelos igual a 15,6 km/l (Iterator, .hasNext, .equals e .remove):
    Iterator<Double> iterator2 = carrosPopulares.values().iterator();
    while(iterator2.hasNext()){
    if(iterator2.next().equals(15.6))
        iterator2.remove();
    }
    System.out.println("\nmodelos de 15,6 km/l removidos: " + carrosPopulares);

    //Exiba todos os carros na ordem que foram informados (LinkedHashMap):
    Map<String, Double> carrosPopularesOrdemInformados = new LinkedHashMap<>(){{
    put("gol", 14.4);
    put("uno", 15.6);
    put("mobi", 16.1);
    put("hb20", 14.5);
    put("kwid", 15.6);
}};
    System.out.println("\nOrdem informada: " + carrosPopularesOrdemInformados.toString());


    //Exiba o dicionário ordenado pelo modelo - (Ordem natural (TreeMap)):
    Map<String, Double>  carrosPopularesOrdemNatural = new TreeMap<>(carrosPopularesOrdemInformados);
    System.out.println("\nOrdem natural: " + carrosPopularesOrdemNatural);

    //Apague o dicionários de carros:
    carrosPopulares.clear();
    System.out.println("\nCarros removidos... " + carrosPopulares);

    //Confira se o dicionários está vazio.
    System.out.println("\nEstá vazio? " + carrosPopulares.isEmpty());




  } 
}
