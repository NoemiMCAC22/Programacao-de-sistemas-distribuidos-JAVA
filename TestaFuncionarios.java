package tarefa6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestaFuncionarios {
    
    public static void main(String[] args) {
    String Nome,Email;
    int Movel;
    float SalarioBase, Vendas, HorasExtras, Premio;
    
    ArrayList TipoFuncionario=new ArrayList();
    TipoFuncionario.add("Vendedor");
    TipoFuncionario.add("Administrativo");
    TipoFuncionario.add("Financeiro");
    
    Object[] Opcoes={"Vendedores","Administrativos","Financeiros"};
    
    int Funcionario=JOptionPane.showOptionDialog(null,
                    "Selecione o tipo de funcionÃ¡rio",
                    "CÃ¡lculo do salÃ¡rio",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,Opcoes,null);
            
    Nome=JOptionPane.showInputDialog(null,
            "Nome do "+TipoFuncionario.get(Funcionario));
    Email=JOptionPane.showInputDialog(null,
            "Email do "+TipoFuncionario.get(Funcionario));
    Movel=Integer.parseInt(JOptionPane.showInputDialog(null,
            "MÃ³vel do "+TipoFuncionario.get(Funcionario)));
    SalarioBase=Float.parseFloat(JOptionPane.showInputDialog(null,
            "SalÃ¡rio base do "+TipoFuncionario.get(Funcionario)));    
    
    switch(Funcionario){
        case 0 ->{
            Vendas=Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Vendas do "+TipoFuncionario.get(Funcionario)));
            Vendedores v=new Vendedores(Nome,Email,Movel,SalarioBase,Vendas);
            v.SalarioVendedor(SalarioBase,Vendas);
        }
       case 1 ->{
            HorasExtras=Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Horas extras do "+TipoFuncionario.get(Funcionario)));
            Administrativos a=new Administrativos(Nome,Email,Movel,SalarioBase,HorasExtras);
            a.SalarioAdministrativo(SalarioBase,HorasExtras);
        }   
       case 2 ->{
            Premio=Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Premio do "+TipoFuncionario.get(Funcionario)));
            Financeiros f=new Financeiros(Nome,Email,Movel,SalarioBase,Premio);
            f.SalarioFinanceiro(SalarioBase,Premio);
        }          
    }
    
    }

}
