package pkg0816_tarefa01;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio1 {
    
    public static void main(String[] args) {
    DecimalFormat ft=new DecimalFormat("#,##0.00");    
    String Password=JOptionPane.showInputDialog(null,
            "Digite uma palavra passe");
    double N1=Double.parseDouble(JOptionPane.showInputDialog(null,
            "Digite o 1º número"));
    double N2=Double.parseDouble(JOptionPane.showInputDialog(null,
            "Digite o 2º número"));
    double Divide=(N1/N2);
    String Password1=JOptionPane.showInputDialog(null,
            "Confirme a palavra passe");
    if (Password.equals(Password1)){
        JOptionPane.showMessageDialog(null, 
                "A divisão é:"+ft.format(Divide));
    }
    else{
        JOptionPane.showMessageDialog(null, 
                "As palavras passe não são iguais");
    }
    
    }

}
