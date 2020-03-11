package com.example.tehtava8;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import java.util.List;

public class FragmenttiViewModel extends AndroidViewModel {

    private Repository ekarepo;


    LiveData<List<MyEntity>> listLiveData;

    public FragmenttiViewModel(@NonNull Application application) {
        super(application);
        this.ekarepo = new Repository(application);
        this.listLiveData = ekarepo.haeLista();

    }
    LiveData<List<MyEntity>> haeLista() {return listLiveData;}
    public void insert(String teksti) {Repository.insert(teksti);}
}


