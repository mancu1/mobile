package com.example.lab4_1

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Fruits(
    @SerializedName("fruits")
    @Expose
    val fruits: List<String>
)
