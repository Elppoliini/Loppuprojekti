package com.example.loppuprojekti;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;



/**
 * Luodaan luokka Treenilista, johon tallentuu merkintään lisätyt treenit, joita voidaan hakea myöhemmin päiväkirjassa
 */
public class Treenilista {


    /**
     * Luodaan lista treenit, joka saa arvoikseen treenit olioitta ( eri liikkeitä ja niiden tiedot)
     */
    private List<Treenit> treenit;

    public Treenilista() {

        /**
         * Luodaan muuttujasta treenit uusi Arraylist, johon liikkeet ja niiden tiedot tallentuvat
         */
        treenit = new ArrayList<>();

    }

    /**
     * Luodaan metodi getTreenilista, jolla voidaan palauttaa treenit lista
     * @return palauttaa treenit listan
     */
    public List<Treenit> getTreenilista() {
        return treenit;
    }


    /**
     * Luodaan metodi lisaaTreeni, jolla voidaan lisätä treenit listaan uusi treeni
     * @param treeni on Treenit luokan olio, joka on uusi liike ja
     *               sen tiedot (liikkeessä käytetyt sarjat, toistot ja painot)
     */
    public void lisaaTreeni(Treenit treeni) {
        Log.d("treeni", treeni.getNimi() + " " + treeni.getkilot() + " " + treeni.gettoistot());
        treenit.add(treeni);
    }

    /**
     * luodaan metodi getTreeni, jolla voi hakea tiettyä treeniä treenit- listasta
     * @param i on indeksi jonka kohdasta haluamme hakea treenin
     * @return palauttaa treenit listalta valitun indeksin kohdalta olevan treenin
     */
    public Treenit getTreeni(int i) {
        return treenit.get(i);
    }

}


