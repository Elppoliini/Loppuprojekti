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
       /* treenit.add(new Treenit("Kekkonen, Urho Kaleva", 1956, 1982, "UKK, usein kysytty kaveri"));
        treenit.add(new Treenit("Koivisto, Mauno Henrik", 1982, 1994, "Koko kansan Manu"));
        treenit.add(new Treenit("Ahtisaari, Martti Oiva Kalevi", 1994, 2000, "Nobel palkittu rauhanmies"));
        presidentit.add(new Presidentti("Halonen, Tarja Kaarina", 2000, 2012, "Eka naispresidentti"));
        presidentit.add(new Presidentti("Niinistö, Sauli Väinämö", 2012, 2024, "Eka suoralla kansanvaalilla valittu"));
        presidentit.add(new Presidentti("Valittu, Ei Vielä", 2024, 2030, "Seuraavien vaalien voittaja"));
        presidentit.add(new Presidentti("Valittu, Ei Vieläkään", 2030, 2036, "Seuraavien vaalien voittaja")); */
    }
    public List<Treenit> getTreenilista() {
        return treenit;
    }
    public Treenit  getTreeni (int i) {
        return treenit.get(i);
    }
}


