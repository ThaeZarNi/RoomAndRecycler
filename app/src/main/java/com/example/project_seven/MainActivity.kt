package com.example.project_seven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.project_seven.adapter.FruitAdapter
import com.example.project_seven.database.FruitDB
import com.example.project_seven.entity.FruitEntity
import kotlinx.android.synthetic.main.fruit.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        var db = Room.databaseBuilder(applicationContext, FruitDB::class.java, "FruitDB").build()

        Thread {
            var fruitList = ArrayList<FruitEntity>()

            var fruitEntity = FruitEntity()
            fruitEntity.fruitId = 1
            fruitEntity.fruitName = "Apple"
            db.fruitDao().saveFruit((fruitEntity))

            fruitEntity.fruitId = 2
            fruitEntity.fruitName = "banana"
            db.fruitDao().saveFruit((fruitEntity))

            fruitEntity.fruitId = 3
            fruitEntity.fruitName = "Coconut"
            db.fruitDao().saveFruit((fruitEntity))

            fruitEntity.fruitId = 4
            fruitEntity.fruitName = "Orange"
            db.fruitDao().saveFruit((fruitEntity))

            fruitEntity.fruitId = 5
            fruitEntity.fruitName = "Strawberry"
            db.fruitDao().saveFruit((fruitEntity))

            db.fruitDao().getAllFruit().forEach() {

                Log.i("Fruit Record", "Id::${it.fruitId}")
                Log.i("Fruit Record", "Name::${it.fruitName}")

                //txt_fruit.text=it.fruitName
                // var txtName = findViewById<TextView>(R.id.txt_fruit)
                var list=db.fruitDao().getAllFruit()
                fruitList= list as ArrayList<FruitEntity>

                val fruitAdapter = FruitAdapter(fruitList)

                recyclerView.adapter = fruitAdapter
            }

        }.start()
    }
}
