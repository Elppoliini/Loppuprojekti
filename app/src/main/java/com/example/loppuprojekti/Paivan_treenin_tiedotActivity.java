package com.example.loppuprojekti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Luodaan luokka Paivan_treenin_tiedotActivty, joka perii AppCompatActivityn
 * Luokkaa käytetään näyttämään näkymää, kun tietty päiväkirjasta on valitu tietty päivä ja halutaan
 * näyttää sinä päivänä tehdyt treenit
 */
public class Paivan_treenin_tiedotActivity extends AppCompatActivity {
    /**
     * Ohitetaan AppCompatActivityssa oleva Oncreate metodi ja luodaan oma.
     * Omassa käytämme supermetodia hakemaan kuitenkin yläluokan OnCreate metodin toiminnot.
     * @param savedInstanceState on viittaus Bundle objektille joka välittyy onCreate metodille.
     * setContentView asettaa sovelluksen näkymäksi activity_paivan_treenin_tiedot layoutin
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paivan_treenin_tiedot);

        Bundle b = getIntent().getExtras();
        int i = b.getInt("TreenilistaIndeksi", 0);
        HashMap<String, Treenilista> hashMapOlio = TallennetutTreenit.getInstance().getTallennetutTreenitMap();



        //((TextView) findViewById(R.id.nimiTextView)).setText(Presidenttilista.getInstance().getPresidentti(i).getNimi());
        HashMap<String, Treenilista> hashMapOlio = TallennetutTreenit.getInstance().getTallennetutTreenitMap();

/**
 * Luodaan Listiview Lv, jonka avulla käyttäjä näkee listan päiväkirja näkymstä valitsemansa päivämäärän treeneistä
 */
        ListView lv = findViewById(R.id.treenilista);
        lv.setAdapter(new ArrayAdapter<Treenit>
                (this, android.R.layout.simple_list_item_1, ((Treenilista) hashMapOlio.values().toArray()[i]).getTreenilista()
                ));

        //((TextView) findViewById(R.id.nimiTextView)).setText(Presidenttilista.getInstance().getPresidentti(i).getNimi());
       //((TextView) findViewById(R.id.alkuvuosiTextView)).setText(String.valueOf(Presidenttilista.getInstance().getPresidentti(i).getAlkuvuosi()));
        //((TextView) findViewById(R.id.loppuvuosiTextView)).setText(String.valueOf(Presidenttilista.getInstance().getPresidentti(i).getLoppuvuosi()));
        //((TextView) findViewById(R.id.kuvausTextView)).setText(Presidenttilista.getInstance().getPresidentti(i).getKuvaus());
    }
}
