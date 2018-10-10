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

public class MerkintaActivity extends AppCompatActivity {
    String TAG = "com.example.loppuprojekti";
    Treenilista treenit = new Treenilista();
    Button tallennaJaPoistu = findViewById(R.id.tallennusBtn);



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

    public void buttonPress(View v) {
        Spinner treenispinneri;
        treenispinneri = findViewById(R.id.spinner);
        switch (v.getId()) {

            case R.id.lisaa_treeni_btn:
                // lisää 1
                Log.i("Lisätyt:treenit", "Treeni lisätty");

                EditText sarjanakym = (EditText) findViewById(R.id.Sarjatkentta);
                EditText toistonakym = (EditText) findViewById(R.id.toistotkentta);
                EditText kilotnakym = (EditText) findViewById(R.id.kilotkentta);
                EditText pmnakym = (EditText) findViewById(R.id.pmkentta);

                int sarjanakyma = Integer.parseInt(sarjanakym.getText().toString());
                int toistonakyma = Integer.parseInt(toistonakym.getText().toString());
                int kilotnakyma = Integer.parseInt(kilotnakym.getText().toString());
                String pmnakyma = pmnakym.getText().toString();
                String treeninNimi = treenispinneri.getSelectedItem().toString();

                Treenit treeniOlio = new Treenit(treeninNimi,
                        sarjanakyma, toistonakyma,
                        kilotnakyma);

                treenit.lisaaTreeni(treeniOlio);

                ArrayAdapter lvadapter = new ArrayAdapter<Treenit>(this,
                        android.R.layout.simple_list_item_1, treenit.getTreenilista());

                ListView lv = findViewById(R.id.paivan_treenit);

                lv.setAdapter(lvadapter);
                lvadapter.notifyDataSetChanged();

                TallennetutTreenit.getInstance().getTallennetutTreenitMap().put(pmnakyma, treenit);


                break;

            case R.id.tallennusBtn:

                tallennaJaPoistu.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent nextActivity = new Intent(MerkintaActivity.this, MainActivity.class);
                        startActivity(nextActivity);


                    }
                });
        }

    }

}
