package pkg0816_tarefa01;

import javax.swing.JOptionPane;

public class Exercicio2 {
    
    public static void main(String[] args) {
    int Afirmacoes=0;    
    int P1=JOptionPane.showConfirmDialog(null,
            "Telefonou para a vítima?",
            "1ª pergunta",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if (P1==0) Afirmacoes++;
    int P2=JOptionPane.showConfirmDialog(null,
            "Esteve no local do crime?",
            "2ª pergunta",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if (P2==0) Afirmacoes++;    
    int P3=JOptionPane.showConfirmDialog(null,
            "Mora perto da vítima?",
            "3ª pergunta",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if (P3==0) Afirmacoes++; 
    int P4=JOptionPane.showConfirmDialog(null,
            "Tinha dívidas com a vítima?",
            "4ª pergunta",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if (P4==0) Afirmacoes++; 
    int P5=JOptionPane.showConfirmDialog(null,
            "Já trabalhou com a vítima?",
            "5ª pergunta",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if (P5==0) Afirmacoes++;
    
    switch(Afirmacoes){
        case 2 -> JOptionPane.showMessageDialog(null, "Suspeito");
        case 3,4 -> JOptionPane.showMessageDialog(null, "Cúmplice");
        case 5 -> JOptionPane.showMessageDialog(null, "Assassino");
        default -> JOptionPane.showMessageDialog(null, "Inocente");
    }
            
    }

}
