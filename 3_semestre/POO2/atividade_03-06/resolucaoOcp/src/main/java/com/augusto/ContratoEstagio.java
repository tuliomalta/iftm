package com.augusto;

public class ContratoEstagio  implements Remuneravel{
    private double bolsaAuxilio;

    public ContratoEstagio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double remuneracao() {
        return bolsaAuxilio;
    }
}
