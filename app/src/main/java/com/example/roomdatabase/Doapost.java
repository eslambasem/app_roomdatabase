package com.example.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Doapost {
@Insert
    void insertpost (Post post);
@Query("Select * from Post")

  List<Post> getpost ();


}
