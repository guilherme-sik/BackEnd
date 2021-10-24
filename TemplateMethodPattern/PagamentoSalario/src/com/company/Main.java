package com.company;

public class Main {
    public static void main(String[] args){
        Funcionario funcionario = new Efetivo("Nelson", "Kobayashi", "1234567890", 6000.0, 850.0, 2500.0);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Jennifer", "Mayumi", "9876543210", 350.0, 150);
        funcionario.pagamentoSalario();
    }
}
