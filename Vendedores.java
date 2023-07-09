package tarefa6;

public class Vendedores extends Funcionarios {

    private float Vendas;

    public Vendedores(String Nome, String Email, int Movel, float Salario, float Vendas) {
        super(Nome, Email, Movel, Salario);
        this.Vendas = Vendas;

    }

    public float SalarioVendedor(float Salario, float Vendas) {
        return (Salario + this.Vendas * 0.05f);
    }

    /**
     * @return the Vendas
     */
    public float getVendas() {
        return Vendas;
    }

    /**
     * @param Vendas the Vendas to set
     */
    public void setVendas(float Vendas) {
        this.Vendas = Vendas;
    }

}
