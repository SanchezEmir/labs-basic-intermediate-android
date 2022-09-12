package com.sanchezemir.listcontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sanchezemir.listcontact.databinding.ActivityMainBinding
import com.sanchezemir.listcontact.entity.Person

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter : PersonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

        configureAdapter()

        loadData()

    }

    private fun configureAdapter() {
        adapter = PersonAdapter()
        binding.recyclerContact.adapter = adapter
    }

    private fun loadData() {
        val persons = listOf(
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Samir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Hemir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Amir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Hemir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com"),
            Person("Emir Sanchez Ramirez","Backend Developer","emir2104@gmail.com")
        )
        adapter.updateList(persons)
    }


}