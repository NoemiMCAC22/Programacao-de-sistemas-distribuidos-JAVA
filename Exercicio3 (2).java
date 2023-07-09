package tarefa2;


import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {
    
    int idade;
           
    idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a sua idade?"));
       
        if(idade >= 18){
          
            JOptionPane.showMessageDialog(null," Já és de maior: " +idade,
                    "Exercicio 3", JOptionPane.INFORMATION_MESSAGE);
        }else{
            
     
            JOptionPane.showMessageDialog(null, "Ainda és de menor: "+idade,
                    "Exercicio 3", JOptionPane.INFORMATION_MESSAGE);
             }
    }
    
}
