package comportamento;

import javax.swing.*;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        JOptionPane.showMessageDialog(null, "Movendo-se defensivamente...");
    }
}