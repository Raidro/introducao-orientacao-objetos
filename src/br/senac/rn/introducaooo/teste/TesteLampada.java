package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.Lampada;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada("Branco",80); // criaodu ma lampada nova

        //lampada.cor = "Branca"; // outra forma de fazer
        //lampada.potencia = 80;

        lampada.acende();

        System.out.println(lampada);

    }


}
