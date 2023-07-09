package pkg0816_tarefa01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio2a {
    
    public static void main(String[] args) {
    int Afirmacoes=0;    
    // declarar o array com a classe ArrayList
    ArrayList perguntas=new ArrayList();
    // adicionar elementos ao array
    perguntas.add("Telefonou para a vítima?");
    perguntas.add("Esteve no local do crime?");
    perguntas.add("Mora perto da vítima?");
    perguntas.add("Tinha dívidas com a vítima?");
    perguntas.add("Já trabalhou com a vítima?");
    
    for(int i=0;i<perguntas.size();i++){
        int Resposta=JOptionPane.showConfirmDialog(null,
                perguntas.get(i),(i+1)+"ª Pergunta",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (Resposta==0) Afirmacoes++;
    }
    
    switch(Afirmacoes){
        case 2 -> JOptionPane.showMessageDialog(null, "Suspeito");
        case 3,4 -> JOptionPane.showMessageDialog(null, "Cúmplice");
        case 5 -> JOptionPane.showMessageDialog(null, "Assassino");
        default -> JOptionPane.showMessageDialog(null, "Inocente");
    }        
    }

}
