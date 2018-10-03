package com.example.loppuprojekti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.Scanner;

public class uusi_merkinta extends AppCompatActivity {

    Scanner lukija = new Scanner(System.in);
    String TAG = "com.example.loppuprojekti";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uusi_merkinta);

        Spinner treeniTyyppi = findViewById(R.id.treeniTyyppiSpinner);

        treeniTyyppi.setAdapter(new ArrayAdapter<Treenit>
                (this, android.R.layout.simple_list_item_1,Treenilista.getInstance().getTreenilista()));


        treeniTyyppi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick(" + i + ")");
            }
        });
    }
}


