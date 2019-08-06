package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.Conta;
import br.senac.rn.introducaooo.ContaCorrente;
import br.senac.rn.introducaooo.Pessoa;

public class TesteContaCorrente {
    //polimorfismo só tem em heranç
    //quando o objeto assume o comportamento de outra classe

    public static void main(String[] args) {

        ContaCorrente contaFlavio = new ContaCorrente();

        Pessoa flavio = new Pessoa();
        flavio.setNome("Flavio Araujo");
        flavio.setSexo('M');



        contaFlavio.setTitular(flavio);
        contaFlavio.setAgencia("1234-8");
        contaFlavio.setNumero("4567-7");


        contaFlavio.deposita(800.0);

        ContaCorrente contaCaio = new ContaCorrente();

        Pessoa caio = new Pessoa();
        flavio.setNome("Caio Cesar");
        flavio.setSexo('M');

        contaCaio.setTitular(caio);
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
