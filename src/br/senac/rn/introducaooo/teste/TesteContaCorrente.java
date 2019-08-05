package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.Conta;
import br.senac.rn.introducaooo.ContaCorrente;

public class TesteContaCorrente {
    //polimorfismo só tem em heranç
    //quando o objeto assume o comportamento de outra classe

    public static void main(String[] args) {

        ContaCorrente contaFlavio = new ContaCorrente();

        contaFlavio.setTitular("Flavio Araujo");
        contaFlavio.setAgencia("1234-8");
        contaFlavio.setNumero("4567-7");


        contaFlavio.deposita(800.0);

        ContaCorrente contaCaio = new ContaCorrente();

        contaCaio.setTitular("Caio");
        contaCaio.setNumero("4567-8");
        contaCaio.setAgencia("1546-7");
        contaCaio.setLimite(500.0);

        contaCaio.deposita(1000.0);

        System.out.println(contaCaio);;
        System.out.println(contaFlavio);

        contaCaio.transfere(contaFlavio,1500.0);

        System.out.println(contaCaio);
        System.out.println(contaFlavio);

    }
}
