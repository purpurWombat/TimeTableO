package com.example.jannikokan.timetable.Helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.jannikokan.timetable.Edit.EditActivity;

import java.net.ConnectException;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Stundenplan.db";
    public static final String TABLE_NAME = "Fach_table";
    public static final String FACH_ID = "ID";
    public static final String FACH_NAME = "FACHNAME";
    public static final String FACH_KUERZEL = "FACHKUERZEL";
    public static final String FACH_RAUM = "FACHRAUM";
    public static final String FACH_LEHRER = "FACHLEHRER";
    public static final String FACH_FARBE = "FACHFARBE";
    public static final String TABLE_LEHRER = "Lehrer_table";
    public static final String LEHRERID = "ID_L";
    public static final String LEHRERNAME = "LEHRERNAME";
    public static final String LEHRERKUERZEL = "LEHRERKUERZEL";
    public static final String LEHRERRAUM = "LEHRERRAUM";
    public static final String LEHRERMAIL = "LEHRERMAIL";
    public static final String TABLE_RAUM = "Raum_table";
    public static final String RAUM_ID = "ID_RAUM";
    public static final String RAUM_NUMMER = "RAUMNUMMER";
    public static final String RAUM_ART = "RAUMART";


    private static final String create_Table2 = "create table " + TABLE_LEHRER + "(" + LEHRERID + " INTEGER PRIMARY KEY AUTOINCREMENT," + LEHRERNAME + " TEXT," + LEHRERKUERZEL + " TEXT," + LEHRERMAIL + " TEXT)";
    private static final String create_Table = "create table " + TABLE_NAME + "(" + FACH_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + FACH_NAME + " TEXT," + FACH_KUERZEL + " TEXT)";
    private static final String create_TableRaum = "create table " + TABLE_RAUM + "(" + RAUM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + RAUM_NUMMER + " TEXT," + RAUM_ART + " TEXT)";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

        Log.d("MeineAPP", "DB angelegt");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        Log.d("MeineAPP", "Tabelle angelegt");
        db.execSQL(create_Table);
        db.execSQL(create_Table2);
        db.execSQL(create_TableRaum);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {


        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LEHRER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RAUM);

        onCreate(db);
        Log.d("MeineAPP", "in upgrade");

    }

    /**
     * fuegeNeueTabllenHinzu() enthält die Tabellen, die erstellt werden müssen und die entsprechenden Strings zum erstellen der Tabelle.
     */
    public void fuegeNeueTabellenHinzu() {
        String[] benoetigte_tabellen = new String[]{
                TABLE_NAME,
                TABLE_LEHRER,
                TABLE_RAUM,

        };

        String[] table_create_statements = new String[]{
                create_Table,
                create_Table2,
                create_TableRaum,

        };
        erstelleTabellenDieNichtExistieren(benoetigte_tabellen, table_create_statements);
    }

    /**
     * Diese Methode überprüft die Gültigkeit der Längen und wenn sie gültig sind, werden die create statements an die CheckeUndErstelleTabelle() Methode weitergegeben.
     *
     * @param benoetigte_tabellen
     * @param table_create_statements
     */
    private void erstelleTabellenDieNichtExistieren(String[] benoetigte_tabellen, String[] table_create_statements) {

        /**
         * Wenn keine keine Tabellen oder table create statements, dann beende
         */
        if (benoetigte_tabellen.length < 1 || table_create_statements.length < 1) {
            return;
        }

        /**
         * Elemente in den Arrays müssen gleich sein
         */
        if (benoetigte_tabellen.length != table_create_statements.length) {
            return;
        }
        SQLiteDatabase db = this.getWritableDatabase();
        String whereclause = "name";
        for (int i = 0; i < benoetigte_tabellen.length; i++) {
            if (benoetigte_tabellen[i].length() > 0 && table_create_statements[i].length() > 0) {
                CheckeUndErstelleTabelle(
                        benoetigte_tabellen[i].toString(),
                        table_create_statements[i].toString()
                );
            }
        }
    }

    /**
     * Diese Methode "befragt" den sqlite_master, ob die Tabelle existiert. Falls nicht, wird die Tabelle erstellt.
     *
     * @param table
     * @param create_statement
     */
    private void CheckeUndErstelleTabelle(String table, String create_statement) {
        SQLiteDatabase db = this.getWritableDatabase();
        String whereclause = "name=? AND type=?";
        String[] whereargs = new String[]{table, "table"};
        String table_to_query = "sqlite_master";
        Cursor csr = db.query(table_to_query, null, whereclause, whereargs, null, null, null);
        if (csr.getCount() < 1) {
            db.execSQL(create_statement);
        }
        csr.close();
    }


    public boolean speichereFach(String fachName, String fachKuerzel, String fachRaum, String fachLehrer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FACH_NAME, fachName);
        contentValues.put(FACH_KUERZEL, fachKuerzel);
        contentValues.put(FACH_RAUM, fachRaum);
        contentValues.put(FACH_LEHRER, fachLehrer);
        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * speichereFachOkan() speichert Fach anhand von den Übergabeparametern im Fach-Table
     *
     * @param fachName
     * @param fachKuerzel
     * @return
     */
    public boolean speichereFachOKan(String fachName, String fachKuerzel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FACH_NAME, fachName);
        contentValues.put(FACH_KUERZEL, fachKuerzel);
        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * speichereRaum() speichert Raum anhand von den Übergabeparametern im Raum-Table
     *
     * @param raumNummer
     * @param raumArt
     * @return
     */
    public boolean speichereRaum(String raumNummer, String raumArt) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(RAUM_NUMMER, raumNummer);
        contentValues.put(RAUM_ART, raumArt);

        long result = db.insert(TABLE_RAUM, null, contentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * speicherLehrer() speichert Lehrer anhand von den Übergabeparametern im Lehrer-Table
     *
     * @param lehrerName
     * @param lehrerKuerzel
     * @param lehrerMail
     * @return
     */
    public boolean speicherLehrer(String lehrerName, String lehrerKuerzel, String lehrerMail) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(LEHRERNAME, lehrerName);
        contentValues.put(LEHRERKUERZEL, lehrerKuerzel);
        contentValues.put(LEHRERMAIL, lehrerMail);
        long result = db.insert(TABLE_LEHRER, null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }


    /**
     * zeigeLehrer() übergibt dem Cursor res via einer SQLite-Abfrage alle Einträge des Lehrer-Tables
     *
     * @return
     */
    public Cursor zeigeLehrer() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_LEHRER, null);
        return res;
    }

    /**
     * zeigeFaecher() übergibt dem Cursor res via einer SQLite-Abfrage alle Einträge des Fach-Tables
     *
     * @return
     */
    public Cursor zeigeFaecher() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }


    /**
     * zeigeRaeume() übergibt dem Cursor res via einer SQLite-Abfrage alle Einträge des Raum-Tables
     *
     * @return
     */
    public Cursor zeigeRaeume() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_RAUM, null);
        return res;
    }

    public int loescheFach(String fach) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, FACH_NAME + "=?", new String[]{fach});

    }

    public int loescheFach(long id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, FACH_ID + "=?", new String[]{String.valueOf(id)});
    }

    public int loescheLehrer(long id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_LEHRER, LEHRERID + "=?", new String[]{String.valueOf(id)});
    }

    public int loescheRaum(long id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_RAUM, RAUM_ID + "=?", new String[]{String.valueOf(id)});
    }


}
