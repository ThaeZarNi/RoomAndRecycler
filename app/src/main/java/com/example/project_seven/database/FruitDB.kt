package com.example.project_seven.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.project_seven.dao.FruitDAO
import com.example.project_seven.entity.FruitEntity

@Database(entities = [(FruitEntity::class)], version = 1)

abstract class FruitDB : RoomDatabase() {

    abstract fun fruitDao(): FruitDAO
}

