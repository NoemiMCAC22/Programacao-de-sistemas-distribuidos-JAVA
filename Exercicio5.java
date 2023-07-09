package tarefa2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {
    DecimalFormat Ft=new DecimalFormat("#,##0.00");       
    double IMC=0f;    
    double Peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso: "));
    double Altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura: "));
    Altura=Altura/100;
    IMC=(Peso/(Altura*Altura));
    
   JOptionPane.showMessageDialog(null, "Seu IMC é: "+Ft.format (IMC),
           "Cálculo IMC", JOptionPane.INFORMATION_MESSAGE);     
    }
    
}
