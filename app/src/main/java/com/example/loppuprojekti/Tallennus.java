package com.example.loppuprojekti;

import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;

import static android.content.Context.MODE_PRIVATE;

public class Tallennus { /*

    Gson gson = new Gson();
    String hashMapString = gson.toJson(TallennetutTreenit.getInstance().getTallennetutTreenitMap());


    public void tallennaTreeni() {

        SharedPreferences prefs = getSharedPreferences("Shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();


        editor.putString("hashString", hashMapString);
        editor.apply();
    }

    public void palautaTreeni() {

        SharedPreferences prefs = getSharedPreferences("Shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        String storedHashMapString = prefs.getString("hashString", "Oops, jotain meni vikaan");


        java.lang.reflect.Type type = new TypeToken<HashMap<String, String>>() {
        }.getType();
        HashMap<String, String> testHashMap2 = gson.fromJson(storedHashMapString, type);
    } */
}

