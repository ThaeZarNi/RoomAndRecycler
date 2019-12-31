package com.example.project_seven.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_seven.R
import com.example.project_seven.dao.FruitDAO
import com.example.project_seven.database.FruitDB
import com.example.project_seven.entity.FruitEntity
import kotlinx.android.synthetic.main.fruit.view.*

class FruitAdapter(val fruitList: ArrayList<FruitEntity>) :
    RecyclerView.Adapter<FruitViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.fruit, parent, false)
        return FruitViewHolder(view)
    }

    override fun getItemCount(): Int {

        return fruitList.size
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {

        holder.fruitsName.text = fruitList[position].fruitName
    }

}

class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val fruitsName = itemView.findViewById<TextView>(R.id.txt_fruit)

}