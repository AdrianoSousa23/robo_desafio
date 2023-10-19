package comportamento;

import javax.swing.*;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        JOptionPane.showMessageDialog(null, "Movendo-se agressivamente...");
    }
}
