package com.flowacademy.jarmu;

public class Auto {
    protected int loero;
    protected int kmH;
    protected String tipus;


    public Auto(int loero, int kmH, String tipus) {
        this.loero = loero;
        this.kmH = kmH;
        this.tipus = tipus;
    }

    public int getLoero() {
        return loero;
    }

    public void setLoero(int loero) {
        this.loero = loero;
    }

    public int getKmH() {
        return kmH;
    }

    public void setKmH(int kmH) {
        this.kmH = kmH;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public float versenykepesseg(){
        return loero + kmH;
    }

    @Override
    public String toString() {
        return "Auto ( " + tipus +
                "teljesítmény: " + loero +
                "LE, max sebesség: " + kmH +
                "Km/h, versenyk.: " + versenykepesseg() +
                ')';
    }
}
