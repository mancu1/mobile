package com.example.lab4

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

//        try {
//            val retrofit = Retrofit.Builder()
//                .baseUrl("https://pastebin.com/") // замените на ваш базовый URL
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//
//            val apiService = retrofit.create(ApiService::class.java)
//
//            apiService.getFruits().enqueue(object : Callback<Fruits> {
//                override fun onResponse(call: Call<Fruits>, response: Response<Fruits>) {
//                    if (response.isSuccessful) {
//                        val fruits = response.body()
//                        fruits?.fruits?.let {
//                            val fruitList = it.joinToString(", ")
//                            textView.text = fruitList
//                        }
//                    }
//                }
//
//                override fun onFailure(call: Call<Fruits>, t: Throwable) {
//                    Log.e("MainActivity", "Error fetching fruits", t)
//                }
//            })
//            } catch (e: Exception) {
//                System.out.println(e.message)
//            TODO("Not yet implemented")
//        }
    }
}
