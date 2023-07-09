
package tarefa2;

import javax.swing.JOptionPane;


public class Exercicio1 {

   
    public static void main(String[] args) {
         
    String Nome, Apelido;
        Nome = JOptionPane.showInputDialog(null,"Digite seu nome");
        Apelido = JOptionPane.showInputDialog(null,"Digite seu apelido");
    String Mostre = (Apelido+" "+Nome);
            
    JOptionPane.showMessageDialog(null, "O seu nome é: "+Mostre,
            "Exercicio 1", JOptionPane.INFORMATION_MESSAGE);
           
    }
    
}
