package com.example.project_seven.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class FruitEntity {

    @PrimaryKey
    var fruitId: Int = 0

    @ColumnInfo(name = "FruitName")
    var fruitName: String = ""
}