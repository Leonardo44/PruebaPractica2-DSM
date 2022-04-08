package com.llopez.carsmotors.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table usuario(idusuario int primary key, nombres text, apellidos text, email text, user text unique, password text, tipo text)");
        sqLiteDatabase.execSQL("create table marca(idmarca int primary key, nombre text)");
        sqLiteDatabase.execSQL("create table color(idcolor int primary key, descripcion text)");
        sqLiteDatabase.execSQL("create table tipo_automovil(idtipoautomovil int primary key, descripcion text)");
        sqLiteDatabase.execSQL("create table automovil(idautomovil int primary key, modelo text, numerovin text, numerochasis text, numeromotor text, numeroasientos int, anio int, capacidadasientos int, precio real, uriimage text, descripcion text, idmarca int references marca, idtipoautomovil int references tipo_automovil, idcolor int references color)");
        sqLiteDatabase.execSQL("create table favorito_automovil(idfavoritoautomovil int primary key, idusuario int references usuario, idautomovil int references automovil, fechaagregado default current_timestamp)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }
}
