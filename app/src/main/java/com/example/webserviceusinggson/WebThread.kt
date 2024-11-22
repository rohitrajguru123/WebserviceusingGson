package com.example.webserviceusinggson

import android.os.AsyncTask

class WebThread : AsyncTask<Any,Any,ApiResponse> (){
    override fun doInBackground(vararg params: Any?): ApiResponse {
        return WebUtil.getAllBooks()
    }
}