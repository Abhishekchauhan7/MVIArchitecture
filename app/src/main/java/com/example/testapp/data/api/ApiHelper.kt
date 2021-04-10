package com.example.testapp.data.api

import com.example.testapp.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>

}