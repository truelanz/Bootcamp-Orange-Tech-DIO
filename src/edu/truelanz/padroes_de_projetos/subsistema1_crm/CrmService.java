package edu.truelanz.padroes_de_projetos.subsistema1_crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println(nome + "\n" + cep + "\n" + cidade + "\n" + estado);
    }
    
}
