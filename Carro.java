package tarefa8;

import javax.swing.JOptionPane;

public class Carro extends Veiculo{
private int Portas;

public Carro(String Marca, String Modelo, String Combustivel, int Ano, 
    int VelocidadeMaxima, double Preco, int Portas){
    super(Marca, Modelo, Combustivel, Ano, VelocidadeMaxima,Preco);
    this.Portas=Portas;
}
public void DadosVeiculo(){
    super.DadosVeiculo();
    JOptionPane.showMessageDialog(null, 
            "Portas "+this.getPortas());
}    

    /**
     * @return the Portas
     */
    public int getPortas() {
        return Portas;
    }

    /**
     * @param Portas the Portas to set
     */
    public void setPortas(int Portas) {
        this.Portas = Portas;
    }
}
