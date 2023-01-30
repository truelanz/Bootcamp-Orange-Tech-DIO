package edu.truelanz.padroes_de_projetos.facade;

import edu.truelanz.padroes_de_projetos.subsistema1_crm.CrmService;
import edu.truelanz.padroes_de_projetos.subsistema2_cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
    
}
