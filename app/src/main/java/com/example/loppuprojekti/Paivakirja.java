package com.example.loppuprojekti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

public class Paivakirja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paivakirja);


        HashMap <String,Treenilista> kikki = TallennetutTreenit.getInstance().getTallennetutTreenitMap();
        for(Map.Entry m:kikki.entrySet()) {
            Log.d("toimii","ole kiltti");

        }
        //TÄMÄ HAKEE HASHMAPIN
        TallennetutTreenit.getInstance().getTallennetutTreenitMap();
        //TallennetutTreenit.getInstance().getTallennetutTreenitMap();


        //LUOT UUDEN HASHMAPIN!
        //LISÄÄT PARI SAMANLAISTA SISÄLTÖÄ KUIN LISTASSA OLISI OIKEASTI


        //KÄY HASHMAP LÄPI JA ->
        //LISÄÄ SEM SISÄLTÖ NÄKYVIIN!

        HashMap<String, Treenilista> kikki = TallennetutTreenit.getInstance().getTallennetutTreenitMap();
        for (Map.Entry m : kikki.entrySet()) {
            Log.d("toimii", "ole kiltti");

            Set<Entry<String, Treenilista>> entrySet = kikki.entrySet();
            ArrayList<Entry<String, Treenilista>> listOfEntry = new ArrayList<>(entrySet);

            ListView lv = findViewById(R.id.treeniMerkinnat);

            lv.setAdapter(new ArrayAdapter<>
                    (this, android.R.layout.simple_list_item_1, listOfEntry
                    ));



        }
    }
}
