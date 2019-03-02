package com.rasel.netizenregistration;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import android.content.Context;
import android.os.AsyncTask;

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {

    private static UserDatabase instance;

    public abstract UserDao userDao();

    public static synchronized UserDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    UserDatabase.class, "note_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private UserDao userDao;

        private PopulateDbAsyncTask(UserDatabase db) {
            userDao = db.userDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            userDao.insert(new User("RaSeL", "01521437935", "rasel.00x@gmail.com", "rasel.123"));
            userDao.insert(new User("Sajjad Alam", "01521437935", "rasel.00x@gmail.com", "sajjad.123"));
            userDao.insert(new User("Selena", "01521437935", "selena.00x@gmail.com", "selena.123"));

            userDao.insert(new User("RaSeL", "01521437935", "rasel.00x@gmail.com", "rasel.123"));
            userDao.insert(new User("Sajjad Alam", "01521437935", "rasel.00x@gmail.com", "sajjad.123"));
            userDao.insert(new User("Selena", "01521437935", "selena.00x@gmail.com", "selena.123"));

            userDao.insert(new User("RaSeL", "01521437935", "rasel.00x@gmail.com", "rasel.123"));
            userDao.insert(new User("Sajjad Alam", "01521437935", "rasel.00x@gmail.com", "sajjad.123"));
            userDao.insert(new User("Selena", "01521437935", "selena.00x@gmail.com", "selena.123"));

            userDao.insert(new User("RaSeL", "01521437935", "rasel.00x@gmail.com", "rasel.123"));
            userDao.insert(new User("Sajjad Alam", "01521437935", "rasel.00x@gmail.com", "sajjad.123"));
            userDao.insert(new User("Selena", "01521437935", "selena.00x@gmail.com", "selena.123"));

            userDao.insert(new User("RaSeL", "01521437935", "rasel.00x@gmail.com", "rasel.123"));
            userDao.insert(new User("Sajjad Alam", "01521437935", "rasel.00x@gmail.com", "sajjad.123"));
            userDao.insert(new User("Selena", "01521437935", "selena.00x@gmail.com", "selena.123"));

            userDao.insert(new User("RaSeL", "01521437935", "rasel.00x@gmail.com", "rasel.123"));
            userDao.insert(new User("Sajjad Alam", "01521437935", "rasel.00x@gmail.com", "sajjad.123"));
            userDao.insert(new User("Selena", "01521437935", "selena.00x@gmail.com", "selena.123"));

            return null;
        }
    }
}
