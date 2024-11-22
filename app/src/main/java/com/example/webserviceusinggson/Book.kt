package com.example.webserviceusinggson

import com.google.gson.annotations.SerializedName

data class Book(
    var title : String,
    var subtitle : String,
    @SerializedName("isbn13")
    var isbn : String,
    var price : String,
    var image : String,
    var url : String
)

