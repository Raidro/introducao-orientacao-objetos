package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.ContaCorrente;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.setTitular("Flavio Araujo");
        cc.deposita(800.0);
        cc.setTaxa(1.0);

        System.out.println(cc);


    }
}
