package com.example.loppuprojekti;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



/**
 * Luodaan luokka Sisainen_muisti, jonka avulla tallennetaan käyttäjän antamat treenimerkinnät,
 * vaikka sovellus suljettaisiin
 *
 * Lähde: https://androidresearch.wordpress.com/2013/04/07/caching-objects-in-android-internal-storage/
 */
public final class Sisainen_muisti {


        private Sisainen_muisti() {}

    /**
     * Luodaan metodi tallennaSisaiseenMuistiin, jonka avulla tiedot tallentuvat tiedostoksi
     * @param context on konteksti, johon tässä tapauksessa tulee aktivity, joka on käytössä
     * @param avain on String, jonka avulla tiedon tallennus ja haku metodeissa löydämme tallentamamme tiedon
     * @param objekti on object, jonka haluamme tallentaa
     * @throws IOException tarkoittaa että metodi voi mahdollisesti antaa poikkeustilanteen
     * IoException, joka tarkoittaa Input/Output expectionia, eli poikkeusta.
     */
        public static void tallennaSisaiseenMuistiin(Context context, String avain, Object objekti) throws IOException {
            FileOutputStream fOS = context.openFileOutput(avain, Context.MODE_PRIVATE);
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);
            oOS.writeObject(objekti);
            oOS.close();
            fOS.close();
        }

    /**
     * Luodaan metodi haeSisaisestaMuistista, jonka avulla voimme palauttaa tallentamamme tiedoston
     * @param context on konteksti, jossa metodin käyttö tapahtuu
     * @param avain on String jonka olemme syöttäneet tallentaessamme tiedostoa jonka haemme.
     *              Sen pitää olla sama, jotta haemme juuri siihen avaimeen asetetun tallennuksen
     * @return palauttaa Objektin, eli tässä tapauksessa tallentamamme tiedon
     * @throws IOException tarkoittaa että metodi voi mahdollisesti antaa poikkeustilanteen
     * IoException, joka tarkoittaa Input/Output expectionia, eli poikkeusta.
     * @throws ClassNotFoundException tarkoittaa että metodi voi antaa poikkeustilanteen,
     * jos kyseiseen avaimeen ei ole tallennettu mitään tietoa, jota palauttaa
     */
        public static Object haeSisaisestaMuistista (Context context, String avain) throws IOException,
                ClassNotFoundException {
            FileInputStream fIS = context.openFileInput(avain);
            ObjectInputStream oIS = new ObjectInputStream(fIS);
            Object object = oIS.readObject();
            return object;
        }
    }

