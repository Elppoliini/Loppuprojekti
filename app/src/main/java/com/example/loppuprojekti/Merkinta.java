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
import android.widget.Spinner;

import java.util.ArrayList;

public class Merkinta extends AppCompatActivity  {
    String TAG = "com.example.loppuprojekti";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merkinta);

    Spinner treenispinneri;
    treenispinneri = findViewById(R.id.spinner);
    treenispinneri.setOnItemSelectedListener(this);
      ArrayAdapter<CharSequence> treeniadapteri = ArrayAdapter.createFromResource(this,
              R.array.treeniNimi, android.R.layout.simple_spinner_item);
        treeniadapteri.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      treenispinneri.setAdapter(treeniadapteri);



            }
}
