package br.com.converso.modelos;

import com.google.gson.JsonObject;

public class ExchangeRate {
    private double usd;
    private double eur;
    private double gbp;
    private double jpy;
    private double aud;
    private double brl;


    public ExchangeRate(JsonObject conversionRates) {
        this.usd = conversionRates.get("USD").getAsDouble();
        this.eur = conversionRates.get("EUR").getAsDouble();
        this.gbp = conversionRates.get("GBP").getAsDouble();
        this.jpy = conversionRates.get("JPY").getAsDouble();
        this.aud = conversionRates.get("AUD").getAsDouble();
        this.brl = conversionRates.get("BRL").getAsDouble();
    }


    public double getUsd() {
        return usd;
    }

    public double getGbp() {
        return gbp;
    }

    public double getEur() {
        return eur;
    }

    public double getJpy() {
        return jpy;
    }

    public double getAud() {
        return aud;
    }

    public double getBrl() {
        return brl;
    }


    @Override
    public String toString() {
        return "usd: " + usd + ", eur: "  + eur +  ", gbp: " +  gbp + ", jpy " + jpy +  ", aud: " +  aud + ", brl: " +  brl;
    }
}
