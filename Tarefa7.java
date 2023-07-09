package Tarefa_7;

import java.util.Random;
import java.util.Scanner;


public class Tarefa7 {

    public static void main(String[] args) {
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int Conta = 1 + numero.nextInt(9999);

        //Obtendo os dados iniciais do Cliente
        System.out.println("Cadastro novo cliente.");
        System.out.print("Insira seu nome: ");

        nome = entrada.nextLine();

        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();

        //Criando a conta de um cliente
        Inicializacao minhaConta = new Inicializacao(nome, Conta, inicial);
        minhaConta.iniciar();
    }

    @Override
    public String toString() {
        return "Tarefa7{" + '}';
    }

}
