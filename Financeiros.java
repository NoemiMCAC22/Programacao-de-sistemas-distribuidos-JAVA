package tarefa6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Financeiros extends Funcionarios{

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Financeiros extends Funcionarios {
private float Premio;

public Financeiros(String Nome, String Email, int Movel, float Salario, float Premio){
    super(Nome,Email,Movel,Salario);
    this.Premio=Premio;
}
/*
public float SalarioFinanceiro(float Salario, float Premio){
    return(Salario+this.Premio);
}
*/
public void SalarioFinanceiro(float Salario, float Premio){
    DecimalFormat Fs=new DecimalFormat("#,##0.00 â‚¬");
    JOptionPane.showMessageDialog(null,
            Fs.format(Salario+this.Premio),
            "SalÃ¡rio total do financeiro",
            JOptionPane.INFORMATION_MESSAGE);
}
    /**
     * @return the Premio
     */
    public float getPremio() {
        return Premio;
    }

    /**
     * @param Premio the Premio to set
     */
    public void setPremio(float Premio) {
        this.Premio = Premio;
    }
    
}
}
