package com.example.tehtava8;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {MyEntity.class},version = 2)
public abstract class TietoKanta extends RoomDatabase {

    public  static final String NIMI = "tietoa";
    public abstract  TauluDao tauluDao();












}