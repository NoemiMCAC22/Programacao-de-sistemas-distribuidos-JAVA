package tarefa6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Administrativos extends Funcionarios {

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Administrativos extends Funcionarios{
private float HorasExtras;    

public Administrativos(String Nome, String Email, int Movel,float Salario, float HorasExtras){
    super(Nome,Email,Movel,Salario);
    this.HorasExtras=HorasExtras;
}
/*
public float SalarioAdministrativo(float Salario, float HorasExtras){
    return(Salario+this.HorasExtras*3f);
}
*/
public void SalarioAdministrativo(float Salario, float HorasExtras){
    DecimalFormat Fs=new DecimalFormat("#,##0.00 â‚¬");
    JOptionPane.showMessageDialog(null,
            Fs.format(Salario+HorasExtras*3f),
            "SalÃ¡rio total do administrativo",
            JOptionPane.INFORMATION_MESSAGE);
}
    /**
     * @return the HorasExtras
     */
    public float getHorasExtras() {
        return HorasExtras;
    }

    /**
     * @param HorasExtras the HorasExtras to set
     */
    public void setHorasExtras(float HorasExtras) {
        this.HorasExtras = HorasExtras;
    }

}
