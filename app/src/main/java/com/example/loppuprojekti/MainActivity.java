package com.example.loppuprojekti;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;


/**
 * Luodaan luokka MainActivity, joka perii luokan AppCompatActivity ominaisuudet
 * MainActivity on sovelluksen "etusivu" joka tulee näkyviin, kun sovelluksen käynnistää.
 * Sieltä siirrytään sovelluksen muihin näkyviin
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Ohitetaan AppCompatActivityssa oleva Oncreate metodi ja luodaan oma.
     * Omassa käytämme supermetodia hakemaan kuitenkin yläluokan OnCreate metodin toiminnot.
     * @param savedInstanceState on viittaus Bundle objektille joka välittyy onCreate metodille.
     * setContentView asettaa sovelluksen näkymäksi activity_main layoutin
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/**
 * Käytetään singleton Hashmapin metodia, jolla olisi tarkoitus palauttaa sovelluksen edellinen
 * tallennus, jos sellainen on olemassa.
 * Tällä hetkellä tallennus ja tallennuksen haku eivät ole täysin toimivia.
 */
        TallennetutTreenit.getInstance().lueMapMuistista(this, "Tallenne");
        // Luodaan painike jolla siirrytään uuden merkinnän tekoon
/**
 * Luodaan Button painike, jonka avulla siirrytään uuden merkinnän tekoon
 */
        Button button = (Button) findViewById(R.id.uusiMerkintaBtn);
        button.setOnClickListener(new View.OnClickListener() {

            /**
             * Ohitetaan ja luodaan itse korvaava metodi OnClick
             * @param v on View luokan olio, joka ottaa arvokseen näkymän joka siihen on liitetty
             */
            @Override
            public void onClick(View v) {

                /**
                 * Luodaan uusi Intent nextActivity, jonka avulla painiketta painaessa
                 * siirrytään luokasta MainActivity luokkaan MerkintaActivity
                 */
                Intent nextActivity = new Intent(MainActivity.this, MerkintaActivity.class);
                startActivity(nextActivity);
            }
        });

/**
 * Luodaan painike, jolla siirrytään päiväkirjanäkymään
 */
        Button button2 = (Button) findViewById(R.id.paivakirjaBtn);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                /**
                 * Luodaan uusi Intent nextActivity, jonka avulla painiketta painaessa
                 * siirrytään luokasta MainActivity luokkaan Paivakirja (joka on myös activity luokka)
                 */
                Intent nextActivity = new Intent(MainActivity.this, Paivakirja.class);
                startActivity(nextActivity);
            }
        });

/**
 *
 * Luodaan painike Diagrammi näkymään siirtymistä varten
 */
        Button button3 = (Button) findViewById(R.id.diagrammiBtn);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                /**
                 * Luodaan uusi Intent nextActivity, jonka avulla painiketta painaessa
                 * siirrytään luokasta MainActivity luokkaan Diagrammi (joka on myös activity luokka)
                 */
                Intent nextActivity = new Intent(MainActivity.this, Diagrammi.class);
                startActivity(nextActivity);
            }
        });
    }

    /**
     * Luodaan metodi onStart, jolla yritimme saada sovelluksen palauttamaan datan, kun onStart metodia käytetään
     */
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        TallennetutTreenit.getInstance().lueMapMuistista(this, "Tallenne");

        Button button = (Button) findViewById(R.id.uusiMerkintaBtn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Painiketta painamalla uusi aktiviteetti käynnistyy
                Intent nextActivity = new Intent(MainActivity.this, MerkintaActivity.class);
                startActivity(nextActivity);
            }
        });

        // Painike päiväkirjaan siirtymistä varten

        Button button2 = (Button) findViewById(R.id.paivakirjaBtn);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(MainActivity.this, Paivakirja.class);
                startActivity(nextActivity);
            }
        });

        // Painike Diagrammiin siirtymistä varten

        Button button3 = (Button) findViewById(R.id.diagrammiBtn);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(MainActivity.this, Diagrammi.class);
                startActivity(nextActivity);
            }
        });

    }
    /**
     * Luodaan metodi onResume, jolla yritimme saada sovelluksen palauttamaan datan, kun onResume metodia käytetään
     */
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        TallennetutTreenit.getInstance().lueMapMuistista(this, "Tallenne");

        Button button = (Button) findViewById(R.id.uusiMerkintaBtn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Painiketta painamalla uusi aktiviteetti käynnistyy
                Intent nextActivity = new Intent(MainActivity.this, MerkintaActivity.class);
                startActivity(nextActivity);
            }
        });

        // Painike päiväkirjaan siirtymistä varten

        Button button2 = (Button) findViewById(R.id.paivakirjaBtn);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(MainActivity.this, Paivakirja.class);
                startActivity(nextActivity);
            }
        });

        // Painike Diagrammiin siirtymistä varten

        Button button3 = (Button) findViewById(R.id.diagrammiBtn);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(MainActivity.this, Diagrammi.class);
                startActivity(nextActivity);
            }
        });
    }


/**
 * Ohitetaan ja luodaan uusi metodi onStop, jolla yritimme saada sovelluksen palauttamaan datan, kun onStop metodia käytetään
 */
@Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        TallennetutTreenit.getInstance().tallennaMapMuistiin(this,"Tallenne", TallennetutTreenit.getInstance().getTallennetutTreenitMap());

    }


/**
 * Ohitetaan ja luodaan uusi metodi onDestroy, jolla yritimme saada sovelluksen tallentamaan datan, kun onDestroy metodia käytetään
 */
@Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        TallennetutTreenit.getInstance().tallennaMapMuistiin(this,"Tallenne", TallennetutTreenit.getInstance().getTallennetutTreenitMap());


    }


}
