package Tarefa_7;

import java.util.Scanner;

public class Inicializacao {
private String Nome;
    private int Conta, Levantamento;
    private double Saldo;
    private Scanner entrada = new Scanner(System.in);
    
    public Inicializacao(String Nome, int Conta, double Saldo_inicial){
        this.Nome=Nome;
        this.Conta=Conta;
        Saldo=Saldo_inicial;
        Levantamento=0;
    }
    
    
    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Número da conta: " + this.getConta());
        System.out.printf("Saldo atual: %.2f\n", this.getSaldo());
        System.out.println("Levantamentos realizados hoje: " + this.getLevantamento() + "\n");
        
    }
    
    public void sacar(double valor){
        if(getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            setLevantamento(getLevantamento() + 1);
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + Saldo+ "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void depositar(double Valor)
    {
        setSaldo(Saldo + Valor);
        System.out.println("Depositado: " + Valor+"€");
        System.out.println("Novo saldo: " + Saldo+ "€\n");
    }
    
    public void iniciar(){
        int Opcao;

        do{
            exibeMenu();
            Opcao = getEntrada().nextInt();
            escolheOpcao(Opcao);
        }while(Opcao!=4);
    }
    
    public void exibeMenu(){
        
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Levantamento");
        System.out.println("3 - Depósito");
        System.out.println("4 - Sair\n");
        System.out.print("Opção: ");
        
    }
    
    public void escolheOpcao(int opcao){
        double Valor;
        
        switch( opcao ){
            case 1:    
                    extrato();
                    break;
            case 2: 
                    if(getLevantamento()<3){
                        System.out.print("Qual o valor do Levantamento: ");
                        Valor = getEntrada().nextDouble();
                        sacar(Valor);
                    } else{
                        System.out.println("Limite de levantamento diário atingido.\n");
                    }
                    break;
                    
            case 3:
                    System.out.print("Valor à depositar: ");
                    Valor = getEntrada().nextDouble();
                    depositar(Valor);
                    break;
                    
            case 4: 
                    System.out.println("Sistema encerrado.");
                    break;
                    
            default:
                    System.out.println("Opção inválida");
        }
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
     * @return the Conta
     */
    public int getConta() {
        return Conta;
    }

    /**
     * @param Conta the Conta to set
     */
    public void setConta(int Conta) {
        this.Conta = Conta;
    }

    /**
     * @return the Levantamento
     */
    public int getLevantamento() {
        return Levantamento;
    }

    /**
     * @param Levantamento the Levantamento to set
     */
    public void setLevantamento(int Levantamento) {
        this.Levantamento = Levantamento;
    }

    /**
     * @return the Saldo
     */
    public double getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the entrada
     */
    public Scanner getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
}