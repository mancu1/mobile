package com.example.lab4_1

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://pastebin.com/") // замените на ваш базовый URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(ApiService::class.java)

        apiService.getFruits().enqueue(object : Callback<Fruits> {
            override fun onResponse(call: Call<Fruits>, response: Response<Fruits>) {
                if (response.isSuccessful) {
                    val fruits = response.body()
                    fruits?.fruits?.let {
                        val fruitList = it.joinToString(", ")
                        textView.text = fruitList
                    }
                }
            }

            override fun onFailure(call: Call<Fruits>, t: Throwable) {
                Log.e("MainActivity", "Error fetching fruits", t)
                textView.text = "Error fetching fruits"
            }
        })

        // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        // val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        // v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        // insets
        // }
    }
}
