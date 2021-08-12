package com.fgardila.stores

import android.app.Application
import androidx.room.Room

class StoreApplication : Application() {

    /**
     * Patron Singlenton
     * Nos permite acceder a la base de datos desde cualquier parte de la aplicacion
     */
    companion object {
        lateinit var database: StoreDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, StoreDatabase::class.java, "StoreDatabase")
            .build()
    }
}