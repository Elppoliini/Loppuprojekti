package com.example.loppuprojekti;

/**
 *Luodaan Treenit luokka, joka kuvaa harjoituksissa tehtyä liikettä,
 *  siinä liikkeessä tehtyjen sarjojen määrää, toistoja, sekä liikkeessä käytettyjä painoja
 *  @author Elisa Urjansson
 */
public class Treenit {

    /**
     * Luodaan muuttujat nimi, sarjat, toistot ja kilot, joita käytämme Treenit olion luomiseen
     */
    private String nimi;
    private int sarjat;
    private int toistot;
    private int kilot;


    /**Luodaan Treenit konstruktori, joka saa parametrikseen nimen,
     * sarjojen lukumäärän, toistojen lukumäärän ja kilojen määrä joita on treenissä käytetty
     * @param nimi on treenissä käytetyn liikkeen nimi
     * @param sarjat on liikkeessä tehtyjän sarjojen määrä
     * @param toistot on yhden sarjan aikana tehtyjen toistojen määrä
     * @param kilot on liikkeessä käytettyjen painojen paino
     */

    public Treenit (String nimi, int sarjat, int toistot, int kilot) {
        this.nimi = nimi;
        this.sarjat = sarjat;
        this.toistot = toistot;
        this.kilot = kilot;
    }

    /**
     * Luodaan metodi getNimi, jolla voidaan palauttaa treenin nimi
     * @return palauttaa liikkeen nimen
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Luodaan metodi getsarjat, jolla voidaan palauttaa treenissä tehtyjen sarjojen määrä
     * @return palauttaa liikkeessä tehtyjen sarjojen lukumäärän
     */
    public int getsarjat() {
        return sarjat;
    }

    /**
     * Luodaan metodi gettoistot, jolla voidaan palauttaa treenissä tehtyjen toistojen määrä
     * @return palauttaa liikkeen yhden sarjan aikana tehtyjen toistojen määrän
     */
    public int gettoistot () {
        return toistot;
    }

    /**
     * Luodaan metodi getkilot, jolla voidaan palauttaa treenissä käytettyjen painojen määrä kiloissa
     * @return palauttaa liikkeessä käytettyjen painojen luvun
     */
    public int getkilot() {
        return kilot;
    }

    /**
     * Ohitetaan ja luodaan oma korvaava toString metodi, jolla palautamme liikkeen tiedot String muodossa
     * @return Palauttaa liikkeen nimen, siinä tehtyjen sarjojen määrän, sarjassa
     * tehtyjen toistojen määrän ja liikkeessä käytettyjen painojen määrän kiloissa
     */
    @Override
    public String toString() {
        return "Liike: " + nimi + "\n" + "Sarjat: " + sarjat + "\n" + "Toistot: " + toistot + "\n" + "Kilot: " + kilot + "kg";
    }
}


