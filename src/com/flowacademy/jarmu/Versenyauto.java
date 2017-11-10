package com.flowacademy.jarmu;

public final class Versenyauto extends Auto {
    private String pilota;
    private float beallitas;

    public Versenyauto(int loero, int kmH, String tipus, String pilota, float beallitas) {
        super(loero, kmH, tipus);
        this.pilota = pilota;
        this.beallitas = cleanBeallitas(beallitas);
    }

    private float cleanBeallitas(float beallitas){
        if (beallitas < 0){
          return 0;
        } else if (beallitas > 1){
          return 1;
        } else {
          return beallitas;
        }
    }

    public String getPilota() {
        return pilota;
    }

    public void setPilota(String pilota) {
        this.pilota = pilota;
    }

    public float getBeallitas() {
        return beallitas;
    }

    public void setBeallitas(float beallitas) {
        this.beallitas = cleanBeallitas(beallitas);
    }

    @Override
    public float versenykepesseg() {
        return (super.versenykepesseg())*getBeallitas();
    }

    @Override
    public String toString() {
        return  " F1Auto ( " + tipus +
                " teljesítmény: " + loero +
                " LE, max sebesség: " + kmH +
                " Km/h, versenyk.: " + versenykepesseg() +
                ')';
    }
}
