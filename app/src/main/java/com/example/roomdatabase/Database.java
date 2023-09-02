package com.example.roomdatabase;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class Database extends RoomDatabase {
    private static Database instance;
    public abstract Doapost doapost();

    public static synchronized Database getInstance(Context context){
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(context.getApplicationContext(),
                                    Database.class, "word_database")
                            .build();
                }
            }
        }
        return instance;
    }

    }

}
