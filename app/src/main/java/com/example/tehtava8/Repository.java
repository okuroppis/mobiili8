package com.example.tehtava8;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;

public class Repository {

    private TauluDao tauluDao;
    private LiveData<List<MyEntity>> listaLiveData;


    Repository(Application application) {

        TietoKanta t =  Room.databaseBuilder(application.getApplicationContext(), TietoKanta.class, "tietoa").build();
        this.tauluDao = t.tauluDao();
        this.listaLiveData = tauluDao.haelista();





    }


    public LiveData<List<MyEntity>> haeLista(){
        return listaLiveData;
    }

    public static void insert(String teksti) {



    }
}
