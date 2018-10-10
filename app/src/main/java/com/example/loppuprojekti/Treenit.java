package com.example.loppuprojekti;

import java.util.Scanner;
//Luodaan Treenit luokka
public class Treenit {


    private String nimi;
    private int sarjat;
    private int toistot;
    private int kilot;


    //Luodaan Treenit konstruktori, joka saa parametrikseen nimen,
    // sarjojen lukumäärän, toistojen lukumäärän ja kilojen määrä joita on treenissä käytetty
    public Treenit (String nimi, int sarjat, int toistot, int kilot) {
        this.nimi = nimi;
        this.sarjat = sarjat;
        this.toistot = toistot;
        this.kilot = kilot;
    }

    //Luodaan metodi, jolla voidaan palauttaa treenin nimi
    public String getNimi() {
        return nimi;
    }

    //Luodaan metodi, jolla voidaan palauttaa treenissä tehtyjen sarjojen määrä
    public int getsarjat() {
        return sarjat;
    }

    //Luodaan metodi, jolla voidaan palauttaa treenissä tehtyjen toistojen määrä
    public int gettoistot () {
        return toistot;
    }

    // Luodaanmetodi, jolla voidaan palauttaa treenissä käytettyjen kilojen määrä
    public int getkilot() {
        return kilot;
    }

    @Override
    public String toString() {
        return nimi;
    }
}


