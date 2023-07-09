
package Tarefa_7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestaConta {

    public static void main(String[] args) {
        
        Object[] Opcoes = {"Inicializar Conta", "Depósito", "Levantamemto", "Consulta"};
        ArrayList Operacao = new ArrayList();
        Operacao.add("Inicializar Conta");
        Operacao.add("Depósito");
        Operacao.add("Levantamento");
        Operacao.add("Consulta");

        int Numero = 0;
        String Nome="";
        float Saldo=0f;
        Conta conta = new Conta();
        
        do {
            int op = JOptionPane.showOptionDialog(null,
                    "Selecione a operação",
                    "Banco",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    Opcoes, null);
            float Montante = 0f;
            switch (op) {
                case 0:
                    // Inicializar conta
                    Numero++;
                    Nome = JOptionPane.showInputDialog(null,
                            "Introduza o seu nome: ");
                    Saldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduza o seu saldo inicial"));
                    conta.InicializarConta(Nome, Numero, Saldo);
                    break;
                case 1:
                    Montante = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduza quanto pretende depositar:"));
                    // Depositar
                    conta.Depositar(Montante);
                    break;
                case 2:
                    // Levantar
                    Montante = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduza quanto pretende levantar:"));
                    // Depositar
                    conta.levantar(Montante);
                    break;
                case 3:
                    // Consultar
                    conta.consultar(conta.getNome());
                    break;
                case 4:
                default:
                // code block
            }
        } while (JOptionPane.showConfirmDialog(null,
                "Continuar?",
                "Banco",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }

}

