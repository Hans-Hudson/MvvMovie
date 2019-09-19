package app.com.hudson.domain.usecases

import app.com.hudson.domain.Entities.Movie
import app.com.hudson.domain.Repositories.MoviesRepository
import app.com.hudson.domain.contracts.usecases.MoviesUseCase

class MoviesUsecasesImpl(val api: MoviesRepository) : MoviesUseCase {
    
    override suspend fun execute(): Movie {
        return api.getMovies()
    }
}