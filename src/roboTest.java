import comportamento.ComportamentoAgressivo;
import comportamento.ComportamentoDefensivo;
import comportamento.ComportamentoNormal;
import comportamento.Robo;

import javax.swing.*;

public class roboTest {
    public static void main(String[] args) {
        while (true) {
            String[] opcoes = {"Defensivo", "Agressivo", "Normal", "Sair"};
            String escolha = (String) JOptionPane.showInputDialog(null, "Escolha o comportamento do robô:",
                    "Escolha de Comportamento", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha == null || escolha.equals("Sair")) {
                JOptionPane.showMessageDialog(null, "Saindo da aplicação.");
                break;
            }

            Robo robo = new Robo();
            switch (escolha) {
                case "Defensivo":
                    robo.setComportamento(new ComportamentoDefensivo());
                    break;
                case "Agressivo":
                    robo.setComportamento(new ComportamentoAgressivo());
                    break;
                case "Normal":
                    robo.setComportamento(new ComportamentoNormal());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida.");
                    break;
            }

            robo.mover();
        }
    }
}