package br.padroes.strategy;

import br.padroes.strategy.views.PrincipalForm;
import javax.swing.JFrame;

/**
 *
 * @author João Teixeira
 * @lesson Design Patterns
 * 
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startAplication();
    }
    
    public static void startAplication() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new PrincipalForm());
        frame.pack();
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }

}
