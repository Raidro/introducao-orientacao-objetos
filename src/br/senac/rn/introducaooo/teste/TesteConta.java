package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.Conta;
import br.senac.rn.introducaooo.ContaCorrente;

public class TesteConta {

    public static void main(String[] args) {

        Conta contaFilipe = new ContaCorrente();

        contaFilipe.setAgencia("0001-0");
        //contaFilipe.setNumero("1239-4");
        //contaFilipe.setTitular("Filipe Vasco");

        contaFilipe.deposita(80.0);

        System.out.println(contaFilipe);

        Conta contaJota = new ContaCorrente();

        contaJota.setAgencia("0003-2");
        //contaJota.setNumero("5214-5");
        //contaJota.setTitular("Jota Lopes");

        contaJota.deposita(200.0);

        System.out.println(contaJota);

        contaJota.transfere(contaFilipe, 50.0);

        System.out.println(contaFilipe);
        System.out.println(contaJota);

    }


}
