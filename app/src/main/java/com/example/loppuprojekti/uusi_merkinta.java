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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uusi_merkinta);

        Spinner treeniTyyppi = findViewById(R.id.treeniTyyppiSpinner);

        treeniTyyppi.setAdapter(new ArrayAdapter<Treenit> Treenilista.getInstance().getTreenilista());
    }
}
     /*   treenityyppi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> adapterView, View view, int i, long l){
                Log.d(TAG, "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(MainActivity.this, Main2Activity.class);
                nextActivity.putExtra("presidenttiIndeksi", i);
                startActivity(nextActivity);
            }
        } );
        */


