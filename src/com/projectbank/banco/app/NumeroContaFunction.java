package com.projectbank.banco.app;

import java.util.function.ToIntFunction;

import com.projectbank.banco.modelo.Conta;

public class NumeroContaFunction implements ToIntFunction<Conta> {

    @Override
    public int applyAsInt(Conta conta) {
        return conta.getNumero();
    }

}
