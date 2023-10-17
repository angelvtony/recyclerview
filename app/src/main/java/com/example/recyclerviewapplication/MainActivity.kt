package com.example.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)


        recyclerview.layoutManager = LinearLayoutManager(this)


        val data = ArrayList<ItemsViewModel>()


        for (i in 1..50) {
            data.add(ItemsViewModel(R.drawable.baseline_drive_file_move_24, "Item " + i))
        }


        val adapter = CustomAdapter(data)


        recyclerview.adapter = adapter

    }
}