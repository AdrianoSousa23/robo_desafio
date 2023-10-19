package comportamento;

import javax.swing.*;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        JOptionPane.showMessageDialog(null, "Movendo-se normalmente...");
    }
}

