package tarefa2;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {

        String Util;
        Util = JOptionPane.showInputDialog(null,"Digite uma string:");
        System.out.println(Util.toUpperCase());
        
        JOptionPane.showMessageDialog(null, "Sua String: "+Util.toUpperCase(),
            "Exercicio 2", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
