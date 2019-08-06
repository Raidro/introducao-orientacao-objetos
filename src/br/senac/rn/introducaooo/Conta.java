package br.senac.rn.introducaooo;

public abstract class Conta {

    protected String agencia;
    protected String numero;
    protected Double saldo = 0.0;
    protected Pessoa titular;

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Boolean deposita(Double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;

        }
        return false;
    }

    public abstract Boolean saca(Double valor);

    public Boolean transfere(Conta contaDestino, Double valor) {
        if (saca(valor)) {
            saca(valor);
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "saldo=" + saldo + ", titular='" + titular + "'";
    }
}
