
package tarefa6;

public class Funcionarios {
private String Nome, Email;
private int Movel;
private float Salario;

public Funcionarios(String Nome, String Email, int Movel, float Salario){
    this.Nome=Nome;
    this.Email=Email;
    this.Movel=Movel;
    this.Salario=Salario;
}

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Movel
     */
    public int getMovel() {
        return Movel;
    }

    /**
     * @param Movel the Movel to set
     */
    public void setMovel(int Movel) {
        this.Movel = Movel;
    }

    /**
     * @return the Salario
     */
    public float getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(float Salario) {
        this.Salario = Salario;
    }


}
