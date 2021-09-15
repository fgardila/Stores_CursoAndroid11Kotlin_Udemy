package com.fgardila.stores

import android.app.Application
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.fgardila.stores.common.database.StoreDatabase

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

        val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE StoreEntity ADD COLUMN photoUrl TEXT NOT NULL DEFAULT ''")
            }
        }

        database = Room.databaseBuilder(this, StoreDatabase::class.java, "StoreDatabase")
            .addMigrations(MIGRATION_1_2)
            .build()
    }
}