package com.example.tehtava8;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao

public interface TauluDao {

    @Query("SELECT * From MyEntity")
    LiveData<List<MyEntity>> haelista();

    @Query("SELECT * FROM myentity ORDER BY avain desc")
    String getAllInDescendingOrder();

    @Insert
    void InsertMyEntity(MyEntity myEntity);

    @Delete
    void DeleteMyEntity(MyEntity myentity);
}
