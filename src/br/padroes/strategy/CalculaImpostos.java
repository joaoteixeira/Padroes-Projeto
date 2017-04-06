package br.padroes.strategy;

import br.padroes.strategy.impostos.Imposto;
import br.padroes.strategy.views.OpcaoImpostos;

/**
 *
 * @author João Teixeira
 * @lesson Design Patterns
 *
 */
public class CalculaImpostos {

    private double valor;
    
    private Imposto imposto;
    
    public CalculaImpostos(double valor, Imposto imposto) {
        this.valor = valor;
        this.imposto = imposto;
    }
    
    public Double realizarCalculo(Orcamento orcamento, Imposto impostoQualquer) {
        return impostoQualquer.calcular(orcamento);
    }
    
    public Double execute() {
        
        Orcamento orcamento = new Orcamento(this.valor);
        
        return this.realizarCalculo(orcamento, this.imposto);
    }
    
    public Double porcentagem() {
        return this.imposto.getPorcentagem();
    }

}
