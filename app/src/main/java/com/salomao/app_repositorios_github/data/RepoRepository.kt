package com.salomao.app_repositorios_github.data

import com.salomao.app_repositorios_github.data.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}