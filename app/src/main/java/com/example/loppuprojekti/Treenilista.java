package com.example.loppuprojekti;

import java.util.ArrayList;
import java.util.List;

public class Treenilista {



    private List<Treenit> treenit;

    private static final Treenilista singleton = new Treenilista();

    public static Treenilista getInstance() {
        return singleton;
    }

    private Treenilista() {



        treenit = new ArrayList<>();


        treenit.add(new Treenit("Jalkaprässi", 1, 1, 0));
        treenit.add(new Treenit("Hauiskääntö", 1, 1, 0));
        treenit.add(new Treenit("Pystypunnerrus", 1, 1, 0));
        treenit.add(new Treenit("Askelkyykky", 1, 1, 0));
        treenit.add(new Treenit("Maastaveto", 1, 1, 0));
        treenit.add(new Treenit("Penkkipunnerrus", 1, 1, 0));
        treenit.add(new Treenit("Vatsarutistukset", 1, 1, 0));

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


