package com.example.webserviceusinggson

import java.lang.Error

data class ApiResponse(var error: String,
                        var total : String,
                        var books : ArrayList<Book>
)
{
    override fun toString(): String {
        return super.toString()
    }
}
