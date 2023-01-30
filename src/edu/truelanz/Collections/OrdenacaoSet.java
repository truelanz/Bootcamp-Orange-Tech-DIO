package edu.truelanz.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Dadas as seguinte informações sobre minhas séries favoritas,
 * crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - tempo de episódio);
 * 
 * 1º Nome: Shitsel, gênero: Drama, tempo dos Episódios: 45; 
 * 1º Nome: GOT, gênero: Fantasia, tempo dos Episódios: 60; 
 * 1º Nome: Método Kominsky, gênero: Comédia, tempo dos Episódios: 25; 
 */

public class OrdenacaoSet {

    public static void main(String[] args) {

    //Mostrar em ordem aleatória:
    Set<Serie> minhasSeries = new HashSet<>(){{
        add(new Serie("Shitsel", "Drama", 45));
        add(new Serie("GOT", "Fantasia", 60));
        add(new Serie("Método Kominsky", "Comédia", 25));    
    }};
    for(Serie serie : minhasSeries)

    System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
    + serie.getTempoEpisodio());      
    
    System.out.println(" ");
    
    //Mostrar por ordem de inserção:
    Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
        add(new Serie("Shitsel", "Drama", 45));
        add(new Serie("GOT", "Fantasia", 60));
        add(new Serie("Método Kominsky", "Comédia", 25));    
    }};
    for(Serie serie : minhasSeries2)

    System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
    + serie.getTempoEpisodio());
    
    System.out.println(" ");
    
    //Ordem Natural com TreeSet (TempoEpisodio)
    Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
    for(Serie serie : minhasSeries3)

    System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
    + serie.getTempoEpisodio());

    System.out.println(" ");

    //Comparar pelo Nome/Gênero/TempoEpisodio
    Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
    minhasSeries4.addAll(minhasSeries2);
    for (Serie serie: minhasSeries4) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio());
        
    
    
  }

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome; //Se os nomes fores diferentes comparar

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero; //caso os nomes forem iguais comprar pelo genero.

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        //Caso os nomes e os generos forem iguais comprar com Tempo/Episódio.
    }

}




   
    



