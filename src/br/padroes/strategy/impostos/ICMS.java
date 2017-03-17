package br.padroes.strategy.impostos;

import br.padroes.strategy.Orcamento;

/**
 *
 * @author João Teixeira
 * @lesson Design Patterns
 *
 */
public class ICMS implements Imposto {

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
    
    public String toString() {
        return "ICMS";
    }
    
}
