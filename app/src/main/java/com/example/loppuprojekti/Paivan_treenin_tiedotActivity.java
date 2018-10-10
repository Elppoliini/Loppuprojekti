package com.example.loppuprojekti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Paivan_treenin_tiedotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paivan_treenin_tiedot);

      /*  Bundle b = getIntent().getExtras();
        int i = b.getInt("presidenttiIndeksi", 0);

        ((TextView) findViewById(R.id.nimiTextView)).setText(Presidenttilista.getInstance().getPresidentti(i).getNimi());
        ((TextView) findViewById(R.id.alkuvuosiTextView)).setText(String.valueOf(Presidenttilista.getInstance().getPresidentti(i).getAlkuvuosi()));
        ((TextView) findViewById(R.id.loppuvuosiTextView)).setText(String.valueOf(Presidenttilista.getInstance().getPresidentti(i).getLoppuvuosi()));
        ((TextView) findViewById(R.id.kuvausTextView)).setText(Presidenttilista.getInstance().getPresidentti(i).getKuvaus());
    } */
}
