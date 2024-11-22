package com.example.webserviceusinggson

import android.util.Log
import com.google.gson.Gson
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class WebUtil {
    companion object{
        fun getAllBooks():ApiResponse{
            val url = URL("https://api.itbook.store/1.0/new")
            var httpURLConnection = url.openConnection() as HttpURLConnection
            httpURLConnection.requestMethod = "GET"
            httpURLConnection.connect()
            var resReader = InputStreamReader(httpURLConnection.inputStream)

            val gson = Gson()
            val response = gson.fromJson<ApiResponse>(resReader,ApiResponse::class.java)
            val books = response.books
            for (eachBook in books){
                Log.e("tag","${eachBook.title}--${eachBook.url}")
            }
            return response
        }
    }
}