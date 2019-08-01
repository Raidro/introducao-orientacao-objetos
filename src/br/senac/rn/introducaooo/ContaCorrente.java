package br.senac.rn.introducaooo;


//vamos herda as caracteristicas do pai;
//vai usar um extend;
//quando o extend for feito, o filho(ContaCorrente) vai herda tudo do pai(Conta);
//chamado tb de herança;
//aspas simples '' = para caracter e dupla pra string

public class ContaCorrente extends Conta {

    private Double taxa;

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }




}

