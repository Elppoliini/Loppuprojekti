package com.example.loppuprojekti;

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
        treenit.add(treeni);
    }

    public Treenit getTreeni(int i) {
        return treenit.get(i);
    }

}


