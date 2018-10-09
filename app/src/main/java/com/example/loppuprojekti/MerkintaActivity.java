package com.example.loppuprojekti;

import android.content.Context;
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
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MerkintaActivity extends AppCompatActivity {
    String TAG = "com.example.loppuprojekti";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merkinta);

        Spinner treenispinneri;
        treenispinneri = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> treeniadapteri = ArrayAdapter.createFromResource(this,
                R.array.treeniNimi, android.R.layout.simple_spinner_item);
        treeniadapteri.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        treenispinneri.setAdapter(treeniadapteri);

        Button lisaatreeni = (Button) findViewById(R.id.lisaa_treeni_btn);


        }

    public void buttonPress (View v){
        Spinner treenispinneri;
        treenispinneri = findViewById(R.id.spinner);
        switch (v.getId()) {

            case R.id.lisaa_treeni_btn:
                // lisää 1
                Log.i("Lisätyt:treenit", "Treeni lisätty");

                EditText sarjanakym = (EditText) findViewById(R.id.Sarjatkentta);
                EditText toistonakym = (EditText) findViewById(R.id.toistotkentta);
                EditText kilotnakym = (EditText) findViewById(R.id.kilotkentta);

                String sarjanakyma = sarjanakym.getText().toString();
                String toistonakyma = toistonakym.getText().toString();
                String kilotnakyma = kilotnakym.getText().toString();


                Treenit treeniOlio = new Treenit(treenispinneri.setOnItemSelectedListener(this),
                        sarjanakyma, toistonakyma,
                        kilotnakyma);
                Treenilista treenit = new Treenilista();
                treenit.lisääTreeni(treeniOlio);


                break;
        }
    }
}
