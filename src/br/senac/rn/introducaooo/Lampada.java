package br.senac.rn.introducaooo;

public class Lampada {

    public final Integer FREQUECIA = 60;
    public String cor;
    public Integer potencia;
    public Integer tensao;
    public Float comprimento;
    private Boolean estado = false;

    public void acende() {
        estado = true;
    }


    public void apaga() {
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
                ", estado=" + statsLampada() +
                '}';
    }
}
