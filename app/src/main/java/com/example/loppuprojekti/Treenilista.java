package com.example.loppuprojekti;

import java.util.ArrayList;
import java.util.List;

public class Treenilista {



    public List<Treenit> treenit;

    public Treenilista() {



        treenit = new ArrayList<>();


        treenit.add(new Treenit("Jalkaprässi", 1, 1, 0));

    }
    public List<Treenit> getTreenilista() {
        return treenit;
    }
    public void lisääTreeni (Treenit treeni) {

    }
    public Treenit  getTreeni (int i) {
        return treenit.get(i);
    }

}


