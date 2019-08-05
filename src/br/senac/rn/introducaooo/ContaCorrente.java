package br.senac.rn.introducaooo;

//vamos herda as caracteristicas do pai;
//vai usar um extend;
//quando o extend for feito, o filho(ContaCorrente) vai herda tudo do pai(Conta);
//chamado tb de herança;
//aspas simples '' = para caracter e dupla pra string
//preciso de um methodo estatico main
//modificadores de acesso = public e private, protected

public class ContaCorrente extends Conta {

    private final Double TAXA = 1.0; // está maiuscula ´pq é constante

    public Double getTaxa() {
        return TAXA;
    }

    @Override
    public void saca(Double valor) {
        Double valorComTaxa = valor + TAXA;
        super.saca(valorComTaxa);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + "}";
    }
}

