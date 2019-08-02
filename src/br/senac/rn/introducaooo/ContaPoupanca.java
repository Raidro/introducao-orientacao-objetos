package br.senac.rn.introducaooo;

public class ContaPoupanca extends Conta {

    private final Double RENDIMENTO = 0.005;

    public void rende() {
        saldo = saldo + saldo * RENDIMENTO; // saldo +=saldo*rendimento

    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + "}";
    }
}
