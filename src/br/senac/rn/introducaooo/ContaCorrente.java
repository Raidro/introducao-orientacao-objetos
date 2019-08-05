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

    private Double limite = 0.0;

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public Double getTaxa() {
        return TAXA;
    }

    @Override
    public Boolean saca(Double valor) {
        Double valorComTaxa = valor + TAXA;
        Double saldoComLimite = saldo + limite;
        if (valorComTaxa <= saldoComLimite) {
            saldo -= valorComTaxa;
        }
        System.out.println("SALDO INSUFICIENTE!");
        return false;

    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + "}";
    }
}

