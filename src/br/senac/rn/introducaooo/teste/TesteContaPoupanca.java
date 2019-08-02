package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.ContaPoupanca;

public class TesteContaPoupanca {

    public static void main(String[] args) {

        ContaPoupanca contaJefferson = new ContaPoupanca();

        contaJefferson.setTitular("Jefferson Felipe");
        contaJefferson.deposita(1000.0);

        System.out.println(contaJefferson);

        contaJefferson.rende();

        System.out.println(contaJefferson);

        contaJefferson.rende();

        System.out.println(contaJefferson);

    }
}
