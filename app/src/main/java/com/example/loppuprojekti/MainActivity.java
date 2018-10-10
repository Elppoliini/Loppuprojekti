package com.example.loppuprojekti;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;

//Luodaan pääluokka, josta siirrtytään kaikkiin ohjelman näkymiin
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Luodaan painike jolla siirrytään uuden merkinnän tekoon

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

}
