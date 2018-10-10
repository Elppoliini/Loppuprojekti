package com.example.loppuprojekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class Paivakirja extends AppCompatActivity {

    String TAG = "com.example.loppuprojekti";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paivakirja);


        //TÄMÄ HAKEE HASHMAPIN
        TallennetutTreenit.getInstance().getTallennetutTreenitMap();
        //TallennetutTreenit.getInstance().getTallennetutTreenitMap();


        //LUOT UUDEN HASHMAPIN!
        HashMap<String, Treenilista> kikki = TallennetutTreenit.getInstance().getTallennetutTreenitMap();
        for (Map.Entry m : kikki.entrySet()) {
            Log.d("toimii", "ole kiltti");

        }
        //TÄMÄ HAKEE HASHMAPIN
        TallennetutTreenit.getInstance().getTallennetutTreenitMap();
        //TallennetutTreenit.getInstance().getTallennetutTreenitMap();

//k
        }//LUOT UUDEN HASHMAPIN!
        //LISÄÄT PARI SAMANLAISTA SISÄLTÖÄ KUIN LISTASSA OLISI OIKEASTI


        //KÄY HASHMAP LÄPI JA ->
        //LISÄÄ SEM SISÄLTÖ NÄKYVIIN!


    /*    Set<Entry<String, Treenilista>> entrySet = kikki.entrySet();
        ArrayList<Entry<String, Treenilista>> listOfEntry = new ArrayList<>(entrySet); */



//Getting Set of keys from HashMap

        Set<String> keySet = kikki.keySet();

//Creating an ArrayList of keys by passing the keySet

        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);

        ListView lv = findViewById(R.id.treeniMerkinnat);

        lv.setAdapter(new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, listOfKeys
                ));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> adapterView, View view, int i, long l){
                Log.d(TAG, "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(Paivakirja.this, Paivan_treenin_tiedotActivity.class);
                nextActivity.putExtra("TreenilistaIndeksi", i);
                startActivity(nextActivity);
            }
        } );
    }
}

    }}

