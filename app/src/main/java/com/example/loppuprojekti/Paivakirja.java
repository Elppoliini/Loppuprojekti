package com.example.loppuprojekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.List;
import java.util.Map;

/**
 * Luodaan luokka paivakirja (Activity), jossa voidaan tarkastella käyttäjän tekemiä merkintöjä eri päiviltä.
 * @author Walter Ruoppa
 * @author Elisa Urjansson
 */
public class Paivakirja extends AppCompatActivity {

    String TAG = "com.example.loppuprojekti";

    /**
     * Ohitetaan AppCompatActivityssa oleva Oncreate metodi ja luodaan oma.
     * Omassa käytämme supermetodia hakemaan kuitenkin yläluokan OnCreate metodin toiminnot.
     * @param savedInstanceState on viittaus Bundle objektille joka välittyy onCreate metodille.
     * setContentView asettaa sovelluksen näkymäksi activity_paivakirja layoutin
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paivakirja);
        TallennetutTreenit.getInstance().lueMapMuistista(this, "Tallenne");


        //TÄMÄ HAKEE HASHMAPIN
        TallennetutTreenit.getInstance().getTallennetutTreenitMap();
        //TallennetutTreenit.getInstance().getTallennetutTreenitMap();


        //LUOT UUDEN HASHMAPIN!
        HashMap<String, Treenilista> hashMapOlio = TallennetutTreenit.getInstance().getTallennetutTreenitMap();
        for (Map.Entry m : hashMapOlio.entrySet()) {
            Log.d("toimii", "ole kiltti");

        }
        //TÄMÄ HAKEE HASHMAPIN
        TallennetutTreenit.getInstance().getTallennetutTreenitMap();
        //TallennetutTreenit.getInstance().getTallennetutTreenitMap();

//k
        }//LUOT UUDEN HASHMAPIN!
        //LISÄÄT PARI SAMANLAISTA SISÄLTÖÄ KUIN LISTASSA OLISI OIKEASTI


        //KÄY HASHMAP LÄPI JA ->
        //LISÄÄ SEM SISÄLTÖ NÄKYVIIN!

        /**
         * Luodaan uusi HashMap olio HashMapOlio, singletonin HashMapista
         *
         */
        HashMap<String, Treenilista> hashMapOlio = TallennetutTreenit.getInstance().getTallennetutTreenitMap();

    /*    Set<Entry<String, Treenilista>> entrySet = hashMapOlio.entrySet();
        ArrayList<Entry<String, Treenilista>> listOfEntry = new ArrayList<>(entrySet); */
        /**
         * Testaillaan for loopin avulla että hashMapOlio toimii
         */
        for (Map.Entry m : hashMapOlio.entrySet()) {
            Log.d("testi", "toimii");


        }

//Getting Set of keys from HashMap

        Set<String> keySet = hashMapOlio.keySet();
        //Haetaan avain setti HashMapista
        /**
         * haetaan hashMapolion avaimet ja luodaan niistä stringeistä muodostuva avain setti keyset
         */
        Set<String> keySet = hashMapOlio.keySet();

        /**
         * Luodaan Arraylist avaimista, asettamalla sinne äsken luotu avain setti
         */
        ArrayList<String> avainlista = new ArrayList<String>(keySet);

        /**
         * Luodaan listview Lv, johon avainlista laitetaan näkyviin
         */
        ListView lv = findViewById(R.id.treeniMerkinnat);

        /**
         * Luodaan adapteri
         */
        lv.setAdapter(new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, avainlista
                ));


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /**
             * Luodaan metodi onItemClick jolla Listviewstä jotain päivämäärää painamalla
             * saadaan siirryttyä näkymään, jossa näkyy kyseisenä päivänä tehdyt treenit
             * @param adapterView kuvaa adapterin luomaa näkymää
             * @param view kuvaa näkymää
             * @param i kuvaa indeksiä
             * @param l
             */
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(Paivakirja.this, Paivan_treenin_tiedotActivity.class);
                nextActivity.putExtra("TreenilistaIndeksi", i);
                startActivity(nextActivity);
            }
        });
    }
}

    }}

