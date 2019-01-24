package com.example.loppuprojekti;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Luodaan singleton Tallennetut treenit, johon päivittyvät kaikki käyttäjän tekemät merkinnät
/**
 * Luodaan luokka TallennetutTreenit, josta tehdään singleton HashMap,
 * johon tiedot tallentuvat kun käyttäjä tallentaa uuden merkinnän.
 * Avainsanaksi HashMapissa laitamme käyttäjän syöttämän päivämäärän ja arvopariksi treenilistan
 * ( eli kaikki treenit jota käyttäjä on merkintäänsä lisännyt)
 * @author Elisa Urjansson
 */
public class TallennetutTreenit {
    /**
     * Luodaan uusi HashMap
     */
    private HashMap<String, Treenilista> TallennetutTreenitMap = new HashMap<>();

    /**
     * Luodaan TallennetutTreeni:stä singleton
     */
    private static final TallennetutTreenit singleton = new TallennetutTreenit();

    /**
     * Luodaan metodi getInstance(), jonka avulla voimme palauttaa singletonin
     * @return palauttaa singletonin
     */
    public static TallennetutTreenit getInstance() {
        return singleton;
    }

    private TallennetutTreenit() {

        /* Testi
        Treenit treeni1 = new Treenit("Juoksu", 2, 5, 6);
        Treenit treeni2 = new Treenit("Punnerrus", 2, 3, 4);
        Treenit treeni3 = new Treenit("Nyrkkeily", 2, 7, 9);
        Treenit treeni4 = new Treenit("Miekkailu", 0, 9, 8);
        Treenilista lista1 = new Treenilista();
        Treenilista lista2 = new Treenilista();
        Treenilista lista3 = new Treenilista();


        lista1.lisaaTreeni(treeni1);
        lista1.lisaaTreeni(treeni2);

        lista2.lisaaTreeni(treeni2);
        lista2.lisaaTreeni(treeni3);

        lista3.lisaaTreeni(treeni1);
        lista3.lisaaTreeni(treeni2);
        lista3.lisaaTreeni(treeni3);
        lista3.lisaaTreeni(treeni4); */

    // Luodaan HashMap TallennetutTreenitMap, johon kaikki käyttäjän tallentamat treenimerkinnät tallentuvat
        TallennetutTreenitMap = new HashMap<>();


      /*  TallennetutTreenitMap.put("13.07", lista1);
        TallennetutTreenitMap.put("12.01",lista2);
        TallennetutTreenitMap.put("08.08", lista3); */

    }

    /**
     * Luodaan metodi getTallennetutTreenitMap(), jotta saamme metodin getinstance() avulla
     * käyttöömme TallennetutTreenitMapin
     * @return palauttaa HashMapin TallennetutTreenitMap
     */
    //luodaan metodi jolla voidaan hakea TallennetutTreenitMap
    public HashMap<String, Treenilista> getTallennetutTreenitMap() {
        return TallennetutTreenitMap;
    }

    /**
     * Luodaan metodi lisaaTallennus, jonka avulla voimme lisätä
     * TallennetutTreenitMap HashMapiin uuden avain-arvo parin
     * @param avain on String jolla voimme hakea HashMapin arvoparia.
     *              Meillä avain on käyttäjän uuteem merkintään syöttämä päivämäärä.
     * @param lista on Treenilista, jonka tallennamme ja voimme hakea avaimen avulla.
     *              Sovelluksessa lista on käyttäjän tallentama Arraylist treeneistä
     *              jotka hän on merkinnyt tehdyksi merkintään lisäämällään päivämäärällä
     *              Lopussa lisäämme logiin Tallennus tagin alle  merkinnän että merkintä on tallennettu
     */
    //Luodaan metodi jolla HashMappiin voidaan lisätä uusi tallennus
    public void lisaaTallennus(String avain, Treenilista lista) {
        TallennetutTreenitMap.put(avain, lista);

    // Tehdään merkintä joka tulostuu logcatiin aina kun HashMappiin lisätään uusi tallennus
        Log.d("Tallennus", "Treenilista tallennettu");
    }

    // Luodaan metodi jolla HashMapista voidaan hakea tiettyä merkintää
    public Treenilista getTreenilista(int i) {

    /**
     * Luodaan metodi TallennaMapMuistiin, jota haluamme käyttää
     * jotta Käyttäjän merkit pysyvät tallennettuina vaikka sovelluksen sulkisi
     * @param aktiviteetti on konteksti jossa tallennus tapahtuu
     * @param avain on String jonka alle tallennamme merkinnän ja jonka avulla sen voi myöhemmin hakea
     * @param objekti on kohde jonka haluamme tallentaa
     */
    public void tallennaMapMuistiin(Context aktiviteetti, String avain, Object objekti) {
/**
 * Luodaan metodi try joka yrittää tallentaa tiedot muistiin
 * ja jos se ei onnistu, vaan tulee jokin poikkeus käytämme catchia luomaan Login,
 * jotta sovellus ei crashaisi jos tallennus ei onnistu
 */
        try {
            Sisainen_muisti.tallennaSisaiseenMuistiin(aktiviteetti, avain, objekti);

        } catch (IOException e) {
            Log.e("Tallennus", "Sisäiseen muistiin ei ole tallennettu mitään");
        }
    }

    /**
     * Luodaan metodi lueMapMuistista, jolla palautetaan tallennetut tiedot
     * @param aktiviteetti on konteksti, jossa tallennuksen haku tapahtuu
     * @param avain on sama jo aiemmin syötetty String, jolla haemme juuri siihen avaimeen tallennettua tietoa
     */
    public void lueMapMuistista(Context aktiviteetti, String avain) {
/**
 * Käytämme try metodia, jotta jos tiedon haku ei onnistu vaan palauttaa jonkin poikkeuksen,
 * ei sovellus crashaisi vaan laittaisi siitä logiin tiedon
 */
        try {
            Object map = Sisainen_muisti.haeSisaisestaMuistista(aktiviteetti, avain);
            this.TallennetutTreenitMap = (HashMap<String, Treenilista>)map;
            ;


        } catch (IOException e) {
            Log.e("Tallennus", "Sisäiseen muistiin ei ole tallennettu mitään");
        }
        catch (ClassNotFoundException e) {
            Log.e("Tallennus", "Luokkaa ei löydy sisäisestä muistista");
        }
    }
}
