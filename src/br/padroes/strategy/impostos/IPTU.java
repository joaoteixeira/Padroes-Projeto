package br.padroes.strategy.impostos;

import br.padroes.strategy.Orcamento;

/**
 *
 * @author João Teixeira
 * @lesson Design Patterns
 *
 */
public class IPTU implements Imposto {

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.025;
    }

    @Override
    public String toString() {
        return "IPTU";
    }

}
