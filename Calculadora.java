
package tarefa5;


public class Calculadora {
   private double Total, Valor;
   private String Tipo;

   public double Calculo(){
        double Calculo;
        Calculo=(Total*Valor);
        if (Tipo.equals("Multiplicação")){
            Calculo=(Total*Valor);
        }
         if (Tipo.equals("Subtração")){
            Calculo=(Total-Valor);
        }
         if (Tipo.equals("Divisão")){
            Calculo=(Total/Valor);
        }
         if (Tipo.equals("Soma")){
            Calculo=(Total+Valor);
        }
         return (Calculo);
    }
	public void setTotal(double Total){
        this.Total=Total;
    }
    public void setValor(double Valor){
        this.Valor=Valor;
    }
     public void setTipo(String Tipo){
        this.Tipo=Tipo;
    }
    //getters
    public double getTotal(){
        return(this.Total);
    }
    public double getValor(){
        return(this.Valor);
    }
    public String getTipo(){
        return(this.Tipo);
    }
}

