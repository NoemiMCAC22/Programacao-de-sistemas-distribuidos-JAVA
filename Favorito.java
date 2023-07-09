package tarefa8;

import javax.swing.JOptionPane;

public class Favorito extends Veiculo{
private int Lugares;

public Favorito(String Marca, String Modelo, String Combustivel, int Ano, 
    int VelocidadeMaxima, double Preco,int Lugares){
    super(Marca, Modelo, Combustivel, Ano, VelocidadeMaxima,Preco);
    this.Lugares=Lugares;    
}
public void DadosVeiculo(){
    super.DadosVeiculo();
    JOptionPane.showMessageDialog(null, 
            "Nº de Lugares: "+this.getLugares());
}    

    /**
     * @return the Lugares
     */
    public int getLugares() {
        return Lugares;
    }

    /**
     * @param Lugares the Lugares to set
     */
    public void setLugares(int Lugares) {
        this.Lugares = Lugares;
    }
}
