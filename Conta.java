
package Tarefa_7;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conta {

    // O nº da conta, o nome do cliente e o saldo
    private int Numero;
    private String Nome;
    private float Saldo;

    
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

   
    public String getNome() {
        return Nome;
    }
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getSaldo() {
        return Saldo;
    }

    
    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public void InicializarConta(String Nome, int Numero, float Saldo) {
        this.setNome(Nome);
        this.setNumero(Numero);
        this.setSaldo(Saldo);
    }

    public void Depositar(float Montante) {
        this.setSaldo(getSaldo() + Montante);
    }

    public void levantar(float Montante) {
        this.setSaldo(this.getSaldo() - Montante);
    }

    public void consultar(String nomeDoCliente) {
        DecimalFormat Fs = new DecimalFormat("#,##0.00 €");
        JOptionPane.showMessageDialog(null,this.Nome+"\n"+
                +this.getNumero()+"\n"+
                Fs.format(this.getSaldo()));
    }
}

    
