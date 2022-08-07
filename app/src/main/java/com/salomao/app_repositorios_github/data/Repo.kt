package com.salomao.app_repositorios_github.data

import com.google.gson.annotations.SerializedName
import com.salomao.app_repositorios_github.data.Owner

data class Repo(
    val id: Long,
    val name: String,
    val owner: Owner,
    @SerializedName("stargazers_count")
    val stargazersCount: Long,
    val language: String,
    @SerializedName("html_url")
    val htmlURL: String,
    val description: String
)
