package com.example.loppuprojekti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Paivan_treenin_tiedotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paivan_treenin_tiedot);

        Bundle b = getIntent().getExtras();
        int i = b.getInt("TreenilistaIndeksi", 0);
        HashMap<String, Treenilista> kikki = TallennetutTreenit.getInstance().getTallennetutTreenitMap();



        //((TextView) findViewById(R.id.nimiTextView)).setText(Presidenttilista.getInstance().getPresidentti(i).getNimi());


        ListView lv = findViewById(R.id.treenilista);

        lv.setAdapter(new ArrayAdapter<Treenit>
                (this, android.R.layout.simple_list_item_1, ((Treenilista) kikki.values().toArray()[i]).getTreenilista()
                ));

        //((TextView) findViewById(R.id.nimiTextView)).setText(Presidenttilista.getInstance().getPresidentti(i).getNimi());
       //((TextView) findViewById(R.id.alkuvuosiTextView)).setText(String.valueOf(Presidenttilista.getInstance().getPresidentti(i).getAlkuvuosi()));
        //((TextView) findViewById(R.id.loppuvuosiTextView)).setText(String.valueOf(Presidenttilista.getInstance().getPresidentti(i).getLoppuvuosi()));
        //((TextView) findViewById(R.id.kuvausTextView)).setText(Presidenttilista.getInstance().getPresidentti(i).getKuvaus());
    }
}
