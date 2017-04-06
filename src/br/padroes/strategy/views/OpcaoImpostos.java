package br.padroes.strategy.views;

import br.padroes.strategy.impostos.*;

/**
 *
 * @author joao
 */
public enum OpcaoImpostos {
    ICMS(new ICMS()), IPTU(new IPTU()), IPVA(new IPVA());

    private final Imposto imposto;

    private OpcaoImpostos(Imposto opcao) {
        this.imposto = opcao;
    }

    public Imposto getImposto() {
        return this.imposto;
    }
    
    @Override
    public String toString() {
        return this.imposto.toString();
    }

}
