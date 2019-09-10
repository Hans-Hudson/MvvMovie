package app.com.hudson.data.repositories

import app.com.hudson.data.remote.contracts.Api
import app.com.hudson.domain.Entities.Movie
import app.com.hudson.domain.Repositories.MoviesRepository

class MoviesRepositoryImpl(val api: Api) : MoviesRepository {
    override suspend fun getMovies(): Movie {
        return api.getMovies("harry").run {
            Movie(this.title)
        }
    }
}