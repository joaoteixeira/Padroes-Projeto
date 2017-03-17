package br.padroes.strategy;

import br.padroes.strategy.impostos.ICMS;
import br.padroes.strategy.impostos.IPVA;

/**
 *
 * @author João Teixeira
 * @lesson Design Patterns
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICMS icms = new ICMS();
        IPVA ipva = new IPVA();

        Orcamento orcamento = new Orcamento(834.10);

        CalculaImpostos calculador = new CalculaImpostos();

        calculador.realizarCalculo(orcamento, icms);
        calculador.realizarCalculo(orcamento, ipva);
    }

}
