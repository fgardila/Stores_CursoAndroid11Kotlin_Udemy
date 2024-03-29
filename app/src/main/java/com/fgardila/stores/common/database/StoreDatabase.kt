package com.fgardila.stores.common.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fgardila.stores.common.entities.StoreEntity

@Database(entities = arrayOf(StoreEntity::class), version = 2)
abstract class StoreDatabase : RoomDatabase() {
    abstract fun storeDao(): StoreDao
}