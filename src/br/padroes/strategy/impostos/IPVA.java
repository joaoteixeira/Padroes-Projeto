package br.padroes.strategy.impostos;

import br.padroes.strategy.Orcamento;

/**
 *
 * @author João Teixeira
 * @lesson Design Patterns
 *
 */
public class IPVA implements Imposto {
    
    private double porcentagem = 0.2;

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.2;
    }
    
    @Override
    public double getPorcentagem() {
       return this.porcentagem * 100; 
    }

    @Override
    public String toString() {
        return "IPVA";
    }

}
