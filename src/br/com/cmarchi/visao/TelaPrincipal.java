package br.com.cmarchi.visao;

import br.com.cmarchi.modelo.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(16,30,18);


        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
