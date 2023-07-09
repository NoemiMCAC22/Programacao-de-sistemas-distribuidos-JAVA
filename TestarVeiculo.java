
package tarefa8;


public class TestarVeiculo {

    
    public static void main(String[] args) {
    Veiculo Veiculo1=new Veiculo("Range Rover","XPTO 20 ","Gasóleo",2000,240,20.000f);   
    Veiculo1.DadosVeiculo(); 
    
    Carro Carro1=new Carro("Honda","Civic ","Gasolina",2004,200,15.000f,5);
    Carro1.DadosVeiculo();
    
    Aviao Aviao1=new Aviao("Boing","777","Jet Fuel",2004,950,400.000f,"Fixa");
    Aviao1.DadosVeiculo();
    
    Favorito Favorito1=new Favorito(" PEUGEOT "," 5008 SUV GT "," Gasóleo ",2021,220,37.000f,7);
    Favorito1.DadosVeiculo();
    }
    
}
