package com.projectbank.banco.app;

import java.math.BigDecimal;

import com.projectbank.banco.modelo.Banco;
import com.projectbank.banco.modelo.Conta;

public class App5 {

	public static void main(String[] args) {
        Banco banco = new Banco();

//        Optional<Conta> contaOptional = banco.buscar(123, 222);

//        banco.buscar(123, 222)
//                .ifPresent(conta -> System.out.println(conta.getSaldo()));

//        if (contaOptional.isPresent()) {
//            Conta contaEncontrada = contaOptional.get();
//            System.out.println(contaEncontrada.getSaldo());
//        }

//        Conta contaEncontrada = banco.buscar(123, 333)
//                .orElseThrow(() -> new RuntimeException("Conta nÃ£o encontrada"));
//
//        System.out.println(contaEncontrada.getSaldo());

        BigDecimal saldo = banco.buscar(123, 333)
                .map(Conta::getSaldo)
                .orElse(BigDecimal.ZERO);

        System.out.println(saldo);
    }

}
