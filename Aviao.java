package tarefa8;

import javax.swing.JOptionPane;

public class Aviao extends Veiculo{
private String TipodeAsa;

public Aviao(String Marca, String Modelo, String Combustivel, int Ano, 
    int VelocidadeMaxima, double Preco, String TipodeAsa){
    super(Marca, Modelo, Combustivel, Ano, VelocidadeMaxima,Preco);
    this.TipodeAsa=TipodeAsa;
}
public void DadosVeiculo(){
    super.DadosVeiculo();
    JOptionPane.showMessageDialog(null, 
            "Tipos de Asas: "+this.getTipodeAsa());
}

    /**
     * @return the TipodeAsa
     */
    public String getTipodeAsa() {
        return TipodeAsa;
    }

    /**
     * @param TipodeAsa the TipodeAsa to set
     */
    public void setTipodeAsa(String TipodeAsa) {
        this.TipodeAsa = TipodeAsa;
    }
}
