package com.example.loppuprojekti;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

//Luodaan luokka Treenilista, johon tallentuu yhteen merkintään lisätyt treenit
public class Treenilista {

    //Luodaan muuttuja treenit
    private List<Treenit> treenit;

    public Treenilista() {

        //Luodaan muuttujasta treenit uusi Arraylist, johon liikkeet ja niiden tiedot tallentuvat
        treenit = new ArrayList<>();

    }

    //Luodaan metodi jolla voidaan palauttaa treenit lista
    public List<Treenit> getTreenilista() {
        return treenit;
    }


    //Luodaan metodi, jolla voidaan lisätä listaan uusi treeni
    public void lisaaTreeni(Treenit treeni) {
        Log.d("treeni", treeni.getNimi() + " " + treeni.getkilot() + " " + treeni.gettoistot());
        treenit.add(treeni);
    }

    // luodaan metodi jolla voi hakea tiettyä treeniä treenit- listasta
    public Treenit getTreeni(int i) {
        return treenit.get(i);
    }

}


