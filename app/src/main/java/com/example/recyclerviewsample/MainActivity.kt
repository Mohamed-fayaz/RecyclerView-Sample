package com.example.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        var WordRv = binding.wordrv
        var adapter = WordAdapter()
        WordRv.layoutManager = LinearLayoutManager(this)

        var List : MutableList<Word>  = mutableListOf(Word("hello world"),
            Word("Data types"),
            Word("Array"),
            Word("Framework"),
            Word("Variable"),
            Word("High-level language"),
            Word("Low-level language"),
            Word("Machine language"),
            Word("Markup language"),
            Word("Package"),
            Word("Runtime"),
            Word("Backend")
            ,Word("Front-end"),
            Word("Server-side"),
            Word(" Source data"),
            Word("Statement"))


        WordRv.adapter = adapter

        adapter.submitList(List)
    }
}