package br.senac.rn.introducaooo;

//vamos herda as caracteristicas do pai;
//vai usar um extend;
//quando o extend for feito, o filho(ContaCorrente) vai herda tudo do pai(Conta);
//chamado tb de herança;
//aspas simples '' = para caracter e dupla pra string
//preciso de um methodo estatico main
//modificadores de acesso = public e private, protected

public class ContaCorrente extends Conta {

    private Double taxa;

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + "}";
    }
}

