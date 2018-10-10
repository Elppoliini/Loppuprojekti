package com.example.loppuprojekti;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Luodaan singleton Tallennetut treenit, johon päivittyvät kaikki käyttäjän tekemät merkinnät
public class TallennetutTreenit {

    private HashMap<String, Treenilista> TallennetutTreenitMap = new HashMap<>();


    private static final TallennetutTreenit singleton = new TallennetutTreenit();


    public static TallennetutTreenit getInstance() {
        return singleton;
    }

    private TallennetutTreenit() {
    // Luodaan HashMap TallennetutTreenitMap, johon kaikki käyttäjän tallentamat treenimerkinnät tallentuvat
        TallennetutTreenitMap = new HashMap<>();

    }

    //luodaan metodi jolla voidaan hakea TallennetutTreenitMap
    public HashMap<String, Treenilista> getTallennetutTreenitMap() {
        return TallennetutTreenitMap;
    }

    //Luodaan metodi jolla HashMappiin voidaan lisätä uusi tallennus
    public void lisaaTallennus(String avain, Treenilista lista) {
        TallennetutTreenitMap.put(avain, lista);

    // Tehdään merkintä joka tulostuu logcatiin aina kun HashMappiin lisätään uusi tallennus
        Log.d("Tallennus", "Treenilista tallennettu");
    }

    // Luodaan metodi jolla HashMapista voidaan hakea tiettyä merkintää
    public Treenilista getTreenilista(int i) {

        return TallennetutTreenitMap.get(i);
    }

}
