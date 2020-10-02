package com.example.demo.models;

public class Madvare {
    private String navn;
    private String udloeb;
    private String pris;
    private String tlfnr;

    public Madvare(String navn, String udloeb, String pris, String tlfnr) {
        this.navn = navn;
        this.udloeb = udloeb;
        this.pris = pris;
        this.tlfnr = tlfnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getUdloeb() {
        return udloeb;
    }

    public void setUdloeb(String udloeb) {
        this.udloeb = udloeb;
    }

    public String getPris() {
        return pris;
    }

    public void setPris(String pris) {
        this.pris = pris;
    }

    public String getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }

    @Override
    public String toString(){
        return getNavn() + getPris() + getUdloeb();
    }
}
