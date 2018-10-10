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

        /* Testi
        Treenit treeni1 = new Treenit("Juoksu", 2, 5, 6);
        Treenit treeni2 = new Treenit("Punnerrus", 2, 3, 4);
        Treenit treeni3 = new Treenit("Nyrkkeily", 2, 7, 9);
        Treenit treeni4 = new Treenit("Miekkailu", 0, 9, 8);
        Treenilista lista1 = new Treenilista();
        Treenilista lista2 = new Treenilista();
        Treenilista lista3 = new Treenilista();


        lista1.lisaaTreeni(treeni1);
        lista1.lisaaTreeni(treeni2);

        lista2.lisaaTreeni(treeni2);
        lista2.lisaaTreeni(treeni3);

        lista3.lisaaTreeni(treeni1);
        lista3.lisaaTreeni(treeni2);
        lista3.lisaaTreeni(treeni3);
        lista3.lisaaTreeni(treeni4); */

    // Luodaan HashMap TallennetutTreenitMap, johon kaikki käyttäjän tallentamat treenimerkinnät tallentuvat
        TallennetutTreenitMap = new HashMap<>();


      /*  TallennetutTreenitMap.put("13.07", lista1);
        TallennetutTreenitMap.put("12.01",lista2);
        TallennetutTreenitMap.put("08.08", lista3); */

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
