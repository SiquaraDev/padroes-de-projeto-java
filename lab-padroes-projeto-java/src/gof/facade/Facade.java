package gof.facade;

import subsistemas.cep.CepApi;
import subsistemas.crm.CrmService;

public class Facade {
    public Facade() {
    }

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
