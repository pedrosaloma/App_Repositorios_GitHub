package com.salomao.app_repositorios_github.data

import com.salomao.app_repositorios_github.data.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String) : List<Repo>
}