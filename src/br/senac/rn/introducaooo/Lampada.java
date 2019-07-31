package br.senac.rn.introducaooo;

public class Lampada {

    public final Integer FREQUECIA = 60; // frequencia é uma constante
    public String cor; //
    public Integer potencia;
    public Integer tensao;
    public Float comprimento;
    private Boolean estado = false; // não pode ser visto de outros pacotes e inicia com falso (desligado)

    public Lampada() {
    }

    public Lampada(String cor) {
        this.cor = cor;
    }

    public Lampada(String cor, Integer potencia) {
        this.cor = cor;
        this.potencia = potencia;
    }

    public void acende() { //
        estado = true; // retrona um estado (true)
    }


    public void apaga() {
        estado = false;

    }

    public String statsLampada() { // função é publica e pode ser visto de outros pacotes
        if (estado == true) {
            return "LIGADO";

        } else {
            return "DESLIGADO";

        }
    }

    @Override // sobreescreve o metodo toString do object(pai)(herança)
    public String toString() { //
        return "Lampada{" +
                "cor='" + cor + '\'' +
                ", estado=" + statsLampada() +
                '}';
    }
}
