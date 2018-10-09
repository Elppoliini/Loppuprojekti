package com.example.loppuprojekti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TallennetutTreenit {

    private HashMap<String, Treenilista> TallennetutTreenitMap = new HashMap<>();
    private static final TallennetutTreenit singleton = new TallennetutTreenit();

    public static TallennetutTreenit getInstance() {
        return singleton;
    }

    private TallennetutTreenit() {

        TallennetutTreenitMap = new HashMap<>();

    }

    public HashMap<String, Treenilista> getTallennetutTreenitMap() {
        return TallennetutTreenitMap;
    }

    public void lisaaTallennus(String avain, Treenilista lista) {
        TallennetutTreenitMap.put(avain, lista);
    }

    public Treenilista getTreenilista(int i) {
        return TallennetutTreenitMap.get(i);
    }

}
