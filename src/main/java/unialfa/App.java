package unialfa;

import javax.swing.*;

public class App
{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var tela = new TelaCadastroPessoa();
            tela.setVisible(true);
        });
    }
}
