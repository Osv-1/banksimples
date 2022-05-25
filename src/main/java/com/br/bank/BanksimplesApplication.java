package com.br.bank;

import com.br.bank.model.Cliente;
import com.br.bank.model.Conta;
import com.br.bank.model.ContaCorrente;
import com.br.bank.model.ContaPoupanca;



public class BanksimplesApplication {

    public static void main(String[] args) {
        Cliente takeo = new Cliente();
        takeo.setNome("takeo");

        Conta cc = new ContaCorrente(takeo);
        Conta poupanca = new ContaPoupanca(takeo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
