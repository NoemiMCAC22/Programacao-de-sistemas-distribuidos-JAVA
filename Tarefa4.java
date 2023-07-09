package tarefa4;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


/*
Jogo do pedra, papel, tesoura.

0 – Representa a Pedra - A mão fechada significa Pedra - Pedra ganha à Tesoura (amassa e parte)

1 - Papel - A mão aberta significa Papel - Tesoura ganha ao Papel (corta-o)

2- Tesoura - A mão com os dedos indicador e médio estendidos significa Tesoura - Papel ganha à Pedra (embrulha-a


 */
public class Tarefa4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random computador = new Random();
        int jogadas = 3;
        int jogadaComputador = computador.nextInt(3);

        while (jogadas > 0) {
            JOptionPane.showMessageDialog(null, "0 - Papel 1 - Pedra 2 - Tesoura",
                    "JoKen Pô", JOptionPane.INFORMATION_MESSAGE);

            int jogador = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Escolha sua jogada: "));

            if (jogador == jogadaComputador) {
                JOptionPane.showMessageDialog(null, "Empate " + jogador);
            } else if ((jogador - jogadaComputador) == -1
                    || (jogador - jogadaComputador) == 2) {
                JOptionPane.showMessageDialog(null, "Usuário Vencedor " + jogador,
                        "JoKen Pô", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Computador Venceu " + jogador,
                        "JoKen Pô", JOptionPane.INFORMATION_MESSAGE);
            }
            switch (jogadaComputador) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Computador escolheu papel",
                            "JoKen Pô", JOptionPane.WARNING_MESSAGE);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Computador escolheu pedra",
                            "JoKen Pô", JOptionPane.WARNING_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Computador escolheu tesoura",
                            "JoKen Pô", JOptionPane.WARNING_MESSAGE);
                    break;
            }
            if (jogadas == 3) {

                int respostaJogo = JOptionPane.showConfirmDialog(null, "Quer continuar",
                        "JoKen Pô", JOptionPane.YES_NO_OPTION);
                if (respostaJogo == JOptionPane.YES_OPTION) {
                    jogadas++;

                }
            }
        }
    }
}

