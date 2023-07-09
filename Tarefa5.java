package tarefa5;

import javax.swing.JOptionPane;

public class Tarefa5 {

    public static void main(String[] args) {
    Calculadora Conta=new Calculadora();
    
    Conta.setTipo(JOptionPane.showInputDialog(null,"Indique nome da equação"));
    Conta.setTotal(Integer.parseInt(JOptionPane.showInputDialog(null,"Indique um número para equação")));
    Conta.setValor(Integer.parseInt(JOptionPane.showInputDialog(null,"Indique segundo número para equação")));
    
   JOptionPane.showMessageDialog(null, 
           "O resultado da "+Conta.getTipo()+" é: "+Conta.Calculo());
    }
    
    
    
}
