package com.projectbank.banco.app;

import java.util.Comparator;

import com.projectbank.banco.modelo.Banco;
import com.projectbank.banco.modelo.Conta;

public class App3 {

    public static void main(String[] args) {
        Banco banco = new Banco();


        banco.getContas().sort(Comparator.comparingInt(Conta::getNumero));

        for (Conta conta : banco.getContas()) {
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());
        }
    }

}
