package br.senac.rn.introducaooo;

public class Lampada {

    final Integer FREQUECIA = 60;
    String cor;
    Integer potencia;
    Integer tensao;
    Float comprimento;
    Boolean estado;

    void acende() {
        estado = true;
    }

    ;

    void apaga() {
        estado = false;

    }

    String statsLampada() {
        if (estado == true) {
            return "LIGADO";

        } else {
            return "DESLIGADO";

        }
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "cor='" + cor + '\'' +
                ", estado=" + estado +
                '}';
    }
}
