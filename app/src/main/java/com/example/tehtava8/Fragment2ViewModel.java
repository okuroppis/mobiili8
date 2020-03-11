package com.example.tehtava8;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class Fragment2ViewModel extends AndroidViewModel {

    private Repository tokarepo;

    LiveData<List<MyEntity>> listLiveData;


    public Fragment2ViewModel(@NonNull Application application) {
        super(application);
        this.tokarepo = new Repository(application);
        this.listLiveData = tokarepo.haeLista();

    }

    public LiveData<List<MyEntity>> haeLista(){
        return listLiveData;
    }

}
