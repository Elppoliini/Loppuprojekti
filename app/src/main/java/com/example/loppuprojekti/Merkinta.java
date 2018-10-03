package com.example.loppuprojekti;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Merkinta extends AppCompatActivity {
    String TAG = "com.example.loppuprojekti";

  /*  public void tallennadata (String avain, Counter laskin) {
        SharedPreferences sharedpref = getSharedPreferences("tallennustiedot", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpref.edit();

        editor.putInt(avain , laskin.haeluku());
        editor.apply();
    }

    public void palautadata ( String avain, Counter laskin) {
        SharedPreferences sharedpref = getSharedPreferences("tallennustiedot", Context.MODE_PRIVATE);

        int laskimenArvo = sharedpref.getInt(avain, 0);
        laskin.laskinasetaluku(laskimenArvo);
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merkinta);

    Spinner treenispinneri;
    treenispinneri = findViewById(R.id.spinner);
      ArrayAdapter<Treenit> treeniadapteri = (new ArrayAdapter<Treenit>
                (this, android.R.layout.simple_list_item_1,
                        Treenilista.getInstance().getTreenilista()));
      treenispinneri.setAdapter(treeniadapteri);


    }
}
