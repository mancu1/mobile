package com.example.lab4

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("raw/dRy9utLy") // замените на ваш путь к JSON
    fun getFruits(): Call<Fruits>
}
