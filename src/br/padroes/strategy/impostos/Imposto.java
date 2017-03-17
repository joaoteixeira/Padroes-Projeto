package br.padroes.strategy.impostos;

import br.padroes.strategy.Orcamento;

/**
 *
 * @author João Teixeira
 * @lesson Design Patterns
 *
 */
public interface Imposto {

    public double calcular(Orcamento orcamento);
    
    @Override
    public String toString();

}


