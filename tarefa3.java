package tarefa3;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*Recorrendo à classe Random pretende-se criar um programa em Java para gerar um número entre 0 e 
500. O utilizador terá 5 tentativas para adivinhar o número. A cada tentativa o programa deve informar 
se o número do utilizador é menor, maior ou igual. Caso seja igual o programa felicita o utilizador 
informando o número de tentativas usadas. No final deve dar possibilidade ao utilizador de repetir o 
programa
 */
public class tarefa3 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        boolean correto = false;
        int tentativas = 5;
        int numeroAleatorio = aleatorio.nextInt(500);
        long Sorte = 0;

        while (tentativas > 0) {

            while (tentativas > 0 && correto == false) {
                Sorte = Long.parseLong(JOptionPane.showInputDialog(null, "Qual é o número?"));

                if (numeroAleatorio == Sorte) {
                    JOptionPane.showMessageDialog(null, "Parabéns!!!" + Sorte + " Você Acertou =) ", "Tarefa 3",
                            JOptionPane.INFORMATION_MESSAGE);
                    correto = true;
                } else if (Sorte < numeroAleatorio) {
                    --tentativas;
                    JOptionPane.showMessageDialog(null, "Não foi dessa vez! Número " + Sorte + " muito pequeno. "
                            + tentativas + " tentativas restantes.", "Tarefa 3", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    --tentativas;
                    JOptionPane.showMessageDialog(null, "Ainda não foi dessa vez! Número " + Sorte + " muito grande. "
                            + tentativas + " tentativas restantes.", "Tarefa 3", JOptionPane.INFORMATION_MESSAGE);
                }

                if (tentativas == 0) {

                    int respostaJogo = JOptionPane.showConfirmDialog(null, "Quer continuar");

                    if (respostaJogo == 0) {
                        numeroAleatorio = 0;
                        tentativas = 5;
                    }
                }
            }
        }
    }
}
