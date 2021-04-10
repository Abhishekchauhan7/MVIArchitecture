package com.example.testapp.data.api

import com.example.testapp.data.model.User


class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}