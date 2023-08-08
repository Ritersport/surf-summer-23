package nsu.leorita.surfapp

import android.app.Application
import androidx.room.Room
import nsu.leorita.surfapp.domain.room.AppDatabase

class App : Application() {
    var db: AppDatabase? = null

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "app-db"
        ).build()
    }
}