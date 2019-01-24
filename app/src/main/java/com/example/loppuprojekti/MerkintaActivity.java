package com.example.loppuprojekti;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Luodaan luokka MerkintaActivity, jossa luodaan uusi päiväkirjamerkintä.
 *@author Elisa Urjansson
 */
public class MerkintaActivity extends AppCompatActivity {

    /**
     * Luodaan Treenilista treenit, johon tallentuvat näkymässä lisätyt liikkeet ja niiden tiedot
     */
    Treenilista treenit = new Treenilista();


    /**
     * Ohitetaan AppCompatActivityssa oleva Oncreate metodi ja luodaan oma.
     * Omassa käytämme supermetodia hakemaan kuitenkin yläluokan OnCreate metodin toiminnot.
     * @param savedInstanceState on viittaus Bundle objektille joka välittyy onCreate metodille.
     * setContentView asettaa sovelluksen näkymäksi activity_merkinta layoutin
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merkinta);




        /**
         * Luodaan spinneri (pudotusvalikko) treenispinneri, jossa näkyvät merkintöihin lisättävien treenivaihtoehtojen nimet.
         * Tehdään spinnerille oma adapteri, joka tekee Arraylistin treenien nimistä
         */
        /*Näkymän auetessa luodaan Spinner (pudotusvalikko), josta voi valita mistä treenistä merkinnän tekee.
        * Tälle luodaan oma adapteri jolla asennetaan pudotusvalikon näkymä*/
        /* Tarkasta tämä kohta!
        Gson gson = new Gson();
        String hashMapString = gson.toJson(TallennetutTreenit.getInstance().getTallennetutTreenitMap());

        //tallennetaan shared preferenceihin
        SharedPreferences prefs = getSharedPreferences("Shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();


        editor.putString("hashString", hashMapString);
        editor.apply();

        // haetaan shared preferenceistä
        String storedHashMapString = prefs.getString("hashString", "Oops, jotain meni vikaan");


        java.lang.reflect.Type type = new TypeToken<HashMap<String, String>>() {
        }.getType(); */


        Spinner treenispinneri;
        treenispinneri = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> treeniadapteri = ArrayAdapter.createFromResource(this,
                R.array.treeniNimi, android.R.layout.simple_spinner_item);
        treeniadapteri.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        treenispinneri.setAdapter(treeniadapteri);

        Button lisaatreeni = (Button) findViewById(R.id.lisaa_treeni_btn);


    }
    //Tehdään metodi, jota käytetään kun näkymässä olevia painikkeita käytetään

    /**
     * Luodaan metodi buttonpress, jota käytetään kun jotain layoutissa olevista painikkeista painetaan.
     * @param v kuvaa näkymää, josta haemme painikkeen
     */
    public void buttonPress(View v) {
        /**
         * Luodaan spinneri ja sen widget metodin sisään, jotta niitä voidaan hakea ja käyttää
         */
        Spinner treenispinneri;
        treenispinneri = findViewById(R.id.spinner);
        /**
         * Luodaan Switch joka tarkastelee tapauksia (case) ja riippuen mikä tapaus toteutuu,
         * toteutetaan siihen kuuluvat toiminnot
         */
        switch (v.getId()) {

            /**
             * Lisätään metodiin tapaus, joka toteutuu kun Lisää treeni painiketta painetaan
             */
            case R.id.lisaa_treeni_btn:

                Log.i("Lisätyt:treenit", "Treeni lisätty");

                /**
                 * Etsitään näkymässä olevat tekstikentät niiden id:eiden avulla
                 */
                EditText sarjanakym = (EditText) findViewById(R.id.Sarjatkentta);
                EditText toistonakym = (EditText) findViewById(R.id.toistotkentta);
                EditText kilotnakym = (EditText) findViewById(R.id.kilotkentta);
                EditText pmnakym = (EditText) findViewById(R.id.pmkentta);

                /**
                 * Muutetaan tekstikentät haluttuun muotoon
                 */
                int sarjanakyma = Integer.parseInt(sarjanakym.getText().toString());
                int toistonakyma = Integer.parseInt(toistonakym.getText().toString());
                int kilotnakyma = Integer.parseInt(kilotnakym.getText().toString());
                String pmnakyma = pmnakym.getText().toString();
                String treeninNimi = treenispinneri.getSelectedItem().toString();


                /**
                 * Luodaan TreeniOlio, joka saa arvoikseen Spinnerissä sen hetkellä näkyvän liikkeen nimen,
                 * käyttäjän tietoihin syöttämät tiedot sarjoista, toistoista ja liikkeessä käyetyistä painoista
                 */
                Treenit treeniOlio = new Treenit(treeninNimi,
                        sarjanakyma, toistonakyma,
                        kilotnakyma);

                /**
                 * Lisätään treeniOlio alussa luotuun treenit listaan
                 */
                treenit.lisaaTreeni(treeniOlio);


                /**
                 * Luodaan adapteri jonka avulla saadaan treenit lista näkymään käyttäjälle
                 */
                ArrayAdapter lvadapter = new ArrayAdapter<Treenit>(this,
                        android.R.layout.simple_list_item_1, treenit.getTreenilista());

                ListView lv = findViewById(R.id.paivan_treenit);

                lv.setAdapter(lvadapter);

                /**
                 * Huomautetaan adapterille että alussatyhjänä ollut Listview näkymä
                 * on kokenut muutoksia, jolloin se päivittää näkymän
                 */
                lvadapter.notifyDataSetChanged();




                break;


            /**
             * Lisätään tapaus kun Tallenna ja poistu painiketta käytetään
             */
            case R.id.tallennusBtn:

                /**
                 * Luodaan tallennaJaPoistu painike ja muokataan päivämäärä tekstikenttään syötetyn päivämäärän tiedot Stringiksi
                 */
                Button tallennaJaPoistu = findViewById(R.id.tallennusBtn);
                EditText pmnakym = (EditText) findViewById(R.id.pmkentta);
                String pmnakyma = pmnakym.getText().toString();


                /**
                 * Lisätään singleton Hashmappiin avain (syötetty päivämäärä, ja päivän treenit Arraylist
                 * Sen jälkeen yritetään saada Hashmapin tiedot tallentumaan muistiin
                 */
                TallennetutTreenit.getInstance().lisaaTallennus(pmnakyma, treenit);
                TallennetutTreenit.getInstance().tallennaMapMuistiin(this,"Tallenne", TallennetutTreenit.getInstance().getTallennetutTreenitMap());

                tallennaJaPoistu.setOnClickListener(new View.OnClickListener() {

                    // Asetetaan että painiketta painaessa näkymä siirtyy takaisin etusivulle ( activity_main)

                    /**
                     * Ohitetaan ja luodaan oma metodi OnClick tilalle,
                     * jonka avulla siirrytään Tallenna ja poistu painiketta painamlla takaisin sovelluksen
                     * MainActivity näkymään.
                     * @param v on View luokan olio, joka ottaa arvokseen näkymän joka siihen on liitetty
                     */
                    @Override
                    public void onClick(View v) {
                        Intent nextActivity = new Intent(MerkintaActivity.this, MainActivity.class);
                        startActivity(nextActivity);


                    }
                });
        }

    }

}
