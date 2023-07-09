package pkg0816_tarefa01;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio3 {
    
    public static void main(String[] args) {
    DecimalFormat ft=new DecimalFormat("#,##0.00€");
    float Total=0;
    float KgBananas=Float.parseFloat(JOptionPane.showInputDialog(null,
            "Peso em Kg(Bananas)"));
    float KgPeras=Float.parseFloat(JOptionPane.showInputDialog(null,
            "Peso em Kg(Peras)"));
    if (KgBananas<=5) Total=(KgBananas*2.5f); else Total=(KgBananas*2.2f);
    if (KgPeras<=5) Total+=(KgPeras*1.8f); else Total+=(KgPeras*1.5f); 
    
    if ((KgBananas+KgPeras>8) || (Total > 25)) Total=Total*0.9f;
    
    JOptionPane.showMessageDialog(null, 
            "Valor a pagar é:"+ft.format(Total));
    
    }

}
