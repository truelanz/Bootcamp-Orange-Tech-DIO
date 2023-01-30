package edu.truelanz.collections;

//import java.util.Collections;
//import java.util.Comparator;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
//import java.util.Map.Entry;
//import java.util.stream.Collectors;
import java.util.Set;

public class OrdenacaoMap {

    /*
     * Dadas as seguintes informações sobre meus Livro favoritos e seus autores
     * crie um dicionário e ordene este dicionário:
     * Exibindo (Nome Autor - Nome Livro);
     * 
     * Autor = Lewis, C.S - Livro = nome: A abolição do homem. páginas: 104
     * Autor = Orwell, George - Livro = nome: 1984. páginas: 336
     * Autor = Shakespeare, Willian - Livro = nome: 1984. páginas: 184
     */

    public static void main(String[] args) {


    //Ordem aleatória (HashMap):
    Map<String, Livro> meusLivros = new HashMap<>(){{
        put("Lewis, C.S", new Livro("A abolição do homem", 408));
        put("Shakespeare, Willian", new Livro("Julio Cesar", 184)); 
        put("Orwell, George", new Livro("1984", 336));
    }};
    for (Map.Entry<String, Livro> livros : meusLivros.entrySet())
    System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
    
    System.out.println("");//-----------------------------------------------\\


    //Ordem por ordem de inserção (LinkedHashMap):
    Map<String, Livro> meusLivrosOrdemDeInsercao = new LinkedHashMap<>() {{
        put("Orwell, George", new Livro("1984", 336));
        put("Lewis, C.S", new Livro("A abolição do homem", 408));
        put("Shakespeare, Willian", new Livro("Julio Cesar", 184)); 
    }};
    for (Map.Entry<String, Livro> livros : meusLivrosOrdemDeInsercao.entrySet())
    System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
    
    System.out.println("");//-----------------------------------------------\\


    //Ordem alfabética NOME DOS AUTORES (Natural Order - TreeMap):
    Map<String, Livro> meusLivrosOrdemNatural = new TreeMap<>(meusLivros);

    for (Map.Entry<String, Livro> livros : meusLivrosOrdemNatural.entrySet())
    System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

    System.out.println("");//------------------------------------------------\\
    
    
    //Ordem alfabética NOME DOS LIVROS ():
    Set<Map.Entry<String, Livro>> meusLivrosOrdemNomes = new TreeSet(new ComparatorNome());
    meusLivrosOrdemNomes.addAll(meusLivros.entrySet());
    for(Map.Entry<String, Livro> livros1 : meusLivrosOrdemNomes)
    System.out.println(livros1.getKey() + " - " + livros1.getValue().getNome()); 

    
    System.out.println("");//------------------------------------------------\\




    

    }
}



