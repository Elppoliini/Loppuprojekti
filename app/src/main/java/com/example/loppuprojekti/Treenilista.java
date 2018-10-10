package com.example.loppuprojekti;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Treenilista {


    private List<Treenit> treenit;

    public Treenilista() {

        treenit = new ArrayList<>();

    }

    public List<Treenit> getTreenilista() {
        return treenit;
    }

    public void lisaaTreeni(Treenit treeni) {
        Log.d("treeni", treeni.getNimi()+ " " + treeni.getkilot()+ " " + treeni.gettoistot());
        treenit.add(treeni);
    }

    public Treenit getTreeni(int i) {
        return treenit.get(i);
    }

}


