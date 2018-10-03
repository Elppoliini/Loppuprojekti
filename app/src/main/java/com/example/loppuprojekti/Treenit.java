package com.example.loppuprojekti;

import java.util.Scanner;

public class Treenit {


    private String nimi;
    private int sarjat;
    private int toistot;
    private int kilot;

    public Treenit (String nimi, int sarjat, int toistot, int kilot) {
        this.nimi = nimi;
        this.sarjat = sarjat;
        this.toistot = toistot;
        this.kilot = kilot;
    }

    public String getNimi() {
        return nimi;
    }

    public int getsarjat() {
        return sarjat;
    }

    public int gettoistot () {
        return toistot;
    }

    public int getkilot() {
        return kilot;
    }
    @Override
    public String toString() {
        return nimi;
    }
}
