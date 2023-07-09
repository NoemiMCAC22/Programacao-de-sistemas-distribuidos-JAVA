package tarefa2;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {

    int Numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));
    
     JOptionPane.showMessageDialog(null, "O quadrado do número digitado é:" +(Numero*Numero),
           "Exercicio 4", JOptionPane.INFORMATION_MESSAGE);   
    
    
    }
    
}
