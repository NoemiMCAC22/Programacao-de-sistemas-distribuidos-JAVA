package tarefa8;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Veiculo {
private String Marca, Modelo, Combustivel;
private int Ano, VelocidadeMaxima;
private double Preco;

public Veiculo(String Marca, String Modelo, String Combustivel, int Ano, 
    int VelocidadeMaxima, double Preco){
    this.Marca=Marca;
    this.Modelo=Modelo;
    this.Combustivel=Combustivel;
    this.Ano=Ano;
    this.VelocidadeMaxima=VelocidadeMaxima;
    this.Preco=Preco;
}
public void DadosVeiculo(){
    DecimalFormat ft1=new DecimalFormat ("000 Km/h");
    DecimalFormat ft3=new DecimalFormat ("00.000€");
    
    JOptionPane.showMessageDialog(null, 
            "Marca: "+this.getMarca()+
            "\nModelo: "+this.getModelo()+ 
            "\nCombustível:  "+this.Combustivel+
            "\nAno: "+this.getAno()+
            "\nVelocidade Máxima: "+ft1.format(this.getVelocidadeMaxima())+
            "\nPreço: "+ft3.format(this.getPreco()));
}    

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Combustivel
     */
    public String getCombustivel() {
        return Combustivel;
    }

    /**
     * @param Combustivel the Combustivel to set
     */
    public void setCombustivel(String Combustivel) {
        this.Combustivel = Combustivel;
    }

    /**
     * @return the Ano
     */
    public int getAno() {
        return Ano;
    }

    /**
     * @param Ano the Ano to set
     */
    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    /**
     * @return the VelocidadeMaxima
     */
    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    /**
     * @param VelocidadeMaxima the VelocidadeMaxima to set
     */
    public void setVelocidadeMaxima(int VelocidadeMaxima) {
        this.VelocidadeMaxima = VelocidadeMaxima;
    }

    /**
     * @return the Preco
     */
    public double getPreco() {
        return Preco;
    }

    /**
     * @param Preco the Preco to set
     */
    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
}
