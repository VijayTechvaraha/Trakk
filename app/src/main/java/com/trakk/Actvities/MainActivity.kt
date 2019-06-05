package com.trakk.Actvities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.trakk.Adapters.CustomeAdapter
import com.trakk.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Initializing an empty ArrayList to be filled with animals
    val animals: ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Creates a vertical Layout Manager
        xRv_animal_list.layoutManager = LinearLayoutManager(this)

        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")

        xRv_animal_list.adapter = CustomeAdapter(animals, this)
    }
}
