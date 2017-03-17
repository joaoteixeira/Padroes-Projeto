package br.padroes.strategy;

import br.padroes.strategy.impostos.Imposto;

/**
 *
 * @author João Teixeira
 * @lesson Design Patterns
 *
 */
public class CalculaImpostos {

    public void realizarCalculo(Orcamento orcamento, Imposto impostoQualquer) {

        double valor = impostoQualquer.calcular(orcamento);

        System.out.println("{ " + impostoQualquer.toString() + ": " + valor + " }");

    }

}
