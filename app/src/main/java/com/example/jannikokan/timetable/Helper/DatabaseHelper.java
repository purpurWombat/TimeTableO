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
        public static final String TABLE_UNTERRICHTSSTUNDEN = "Unterrichtsstunden_table";
        public static final String UNTERRICHTSSTUNDE_ID = "UNTERRICHTSSTUNDEID";
        public static final String UNTERRICHTSSTUNDE_FACH = "FachNr";
        public static final String UNTERRICHTSSTUNDE_LEHRER = "LehrerNr";
        public static final String UNTERRICHTSSTUNDE_RAUM = "RaumNr";


        private static final String create_Table2 = "create table " + TABLE_LEHRER + "("+ LEHRERID +" INTEGER PRIMARY KEY AUTOINCREMENT," + LEHRERNAME +" TEXT," + LEHRERKUERZEL + " TEXT," + LEHRERMAIL + " TEXT)";
        private static final String create_Table = "create table " + TABLE_NAME + "("+ FACH_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + FACH_NAME +" TEXT," + FACH_KUERZEL + " TEXT)";
        private static final String create_TableRaum = "create table " + TABLE_RAUM + "("+  RAUM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + RAUM_NUMMER +" TEXT," + RAUM_ART + " TEXT)";
        private static final String create_TableUnterrichtsstunden = "create table " + TABLE_UNTERRICHTSSTUNDEN + "("+  UNTERRICHTSSTUNDE_ID + " TEXT PRIMARY KEY," + UNTERRICHTSSTUNDE_FACH +" TEXT," + UNTERRICHTSSTUNDE_LEHRER +" TEXT," + UNTERRICHTSSTUNDE_RAUM +" TEXT)";



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
            db.execSQL(create_TableUnterrichtsstunden);



            //IDs für einzelne Stunden werden in Tabelle Unterrichtsstunden eingetragen
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO1',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO2',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO3',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO4',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO5',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO6',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO7',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO8',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO9',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MO10',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI1',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI2',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI3',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI4',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI5',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI6',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI7',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI8',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI9',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DI10',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI1',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI2',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI3',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI4',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI5',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI6',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI7',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI8',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI9',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('MI10',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO1',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO2',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO3',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO4',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO5',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO6',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO7',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO8',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO9',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('DO10',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR1',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR2',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR3',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR4',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR5',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR6',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR7',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR8',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR9',NULL,NULL,NULL)");
            db.execSQL("INSERT INTO `Unterrichtsstunden_table` VALUES ('FR10',NULL,NULL,NULL)");

        }




        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {



            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            db.execSQL( "DROP TABLE IF EXISTS " + TABLE_LEHRER);
            db.execSQL( "DROP TABLE IF EXISTS " + TABLE_RAUM);
            db.execSQL( "DROP TABLE IF EXISTS " + TABLE_UNTERRICHTSSTUNDEN);
            onCreate(db);
            Log.d("MeineAPP", "in upgrade");

        }

        //fuegeNeueTabllenHinzu() enthält die Tabellen, die erstellt werden müssen und die entsprechenden Strings zum erstellen der Tabelle.
        public void fuegeNeueTabellenHinzu() {
            String[] benoetigte_tabellen = new String[]{
                    TABLE_NAME,
                    TABLE_LEHRER,
                    TABLE_RAUM,
                    TABLE_UNTERRICHTSSTUNDEN
            };

            String[] table_create_statements = new String[] {
                    create_Table,
                    create_Table2,
                    create_TableRaum,
                    create_TableUnterrichtsstunden
            };
            erstelleTabellenDieNichtExistieren(benoetigte_tabellen,table_create_statements);
        }

        //Diese Methode überprüft die Gültigkeit der Längen und wenn sie gültig sind, werden die create statements an die CheckeUndErstelleTabelle() Methode weitergegeben.
        private void erstelleTabellenDieNichtExistieren(String[] benoetigte_tabellen, String[] table_create_statements) {

            // Wenn keine keine Tabellen oder table create statements, dann beende
            if (benoetigte_tabellen.length < 1 || table_create_statements.length < 1) {
                return;
            }
            // Elemente in den Arrays müssen gleich sein
            if (benoetigte_tabellen.length != table_create_statements.length) {
                return;
            }
            SQLiteDatabase db = this.getWritableDatabase();
            String whereclause = "name";
            for (int i=0; i < benoetigte_tabellen.length;i++) {
                if (benoetigte_tabellen[i].length() > 0 && table_create_statements[i].length() > 0) {
                    CheckeUndErstelleTabelle(
                            benoetigte_tabellen[i].toString(),
                            table_create_statements[i].toString()
                    );
                }
            }
        }

        //Diese Methode "befragt" den sqlite_master, ob die Tabelle existiert. Falls nicht, wird die Tabelle erstellt.
        private void CheckeUndErstelleTabelle(String table, String create_statement) {
            SQLiteDatabase db = this.getWritableDatabase();
            String whereclause = "name=? AND type=?";
            String[] whereargs = new String[]{table,"table"};
            String table_to_query = "sqlite_master";
            Cursor csr = db.query(table_to_query,null,whereclause,whereargs,null,null,null);
            if (csr.getCount() < 1) {
                db.execSQL(create_statement);
            }
            csr.close();
        }




        public boolean speichereFach(String fachName, String fachKuerzel, String fachRaum, String fachLehrer){
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(FACH_NAME, fachName);
            contentValues.put(FACH_KUERZEL, fachKuerzel);
            contentValues.put(FACH_RAUM, fachRaum);
            contentValues.put(FACH_LEHRER, fachLehrer);
            long result = db.insert(TABLE_NAME, null, contentValues);

            if (result == -1){
                return  false;
            }
            else {
                return  true;
            }
        }


    public boolean speichereFachOKan(String fachName, String fachKuerzel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FACH_NAME, fachName);
        contentValues.put(FACH_KUERZEL, fachKuerzel);
        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1){
            return  false;
        }
        else {
            return  true;
        }
    }



        public boolean speichereRaum(String raumNummer, String raumArt){
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(RAUM_NUMMER, raumNummer);
            contentValues.put(RAUM_ART, raumArt);

            long result = db.insert(TABLE_RAUM, null, contentValues);

            if (result == -1){
                return  false;
            }
            else {
                return  true;
            }
        }


        public boolean speicherLehrer(String lehrerName, String lehrerKuerzel, String lehrerMail){
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(LEHRERNAME, lehrerName);
            contentValues.put(LEHRERKUERZEL, lehrerKuerzel);
            contentValues.put(LEHRERMAIL, lehrerMail);
            long result = db.insert(TABLE_LEHRER, null, contentValues);
            if (result == -1){
                return  false;
            }
            else {
                return  true;
            }

        }


        public Cursor zeigeLehrer(){
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("select * from "+ TABLE_LEHRER,null);
            return res;
        }

        public Cursor zeigeFaecher(){
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("select * from "+ TABLE_NAME,null);
            return res;
        }




        public Cursor zeigeRaeume(){
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("select * from "+ TABLE_RAUM,null);
            return res;
        }

    public boolean speicherStunde(String fachKuerzel, String lehrerKuerzel, String raumNummer){
        String id = "MO1";
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UNTERRICHTSSTUNDE_FACH,fachKuerzel);
        contentValues.put(UNTERRICHTSSTUNDE_LEHRER, lehrerKuerzel);
        contentValues.put(UNTERRICHTSSTUNDE_RAUM, raumNummer);
        long result = db.update(TABLE_UNTERRICHTSSTUNDEN, contentValues, UNTERRICHTSSTUNDE_ID+"="+id, null);
        if (result == -1){
            return  false;
        }
        else {
            return  true;
        }



    }





    }
