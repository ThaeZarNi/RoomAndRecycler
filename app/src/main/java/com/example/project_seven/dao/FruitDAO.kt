package com.example.project_seven.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.project_seven.entity.FruitEntity

@Dao
interface FruitDAO {

    @Insert
    fun saveFruit(fruit: FruitEntity)

    @Query(value = "Select * from FruitEntity")
    //fun getAllFruit(): ArrayList<FruitEntity>
    fun getAllFruit():List<FruitEntity>
}