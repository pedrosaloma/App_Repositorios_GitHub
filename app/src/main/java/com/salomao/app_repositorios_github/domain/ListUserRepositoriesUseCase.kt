package com.salomao.app_repositorios_github.domain

import com.salomao.app_repositorios_github.core.UseCase
import com.salomao.app_repositorios_github.data.Repo
import com.salomao.app_repositorios_github.data.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}