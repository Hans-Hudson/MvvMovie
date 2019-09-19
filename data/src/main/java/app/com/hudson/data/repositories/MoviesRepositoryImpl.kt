package app.com.hudson.data.repositories

import app.com.hudson.data.remote.contracts.Api
import app.com.hudson.domain.Entities.Movie
import app.com.hudson.domain.Repositories.MoviesRepository

class MoviesRepositoryImpl(val api: Api) : MoviesRepository {
    override suspend fun getMovie(): Movie {
        return api.getMovies("harry").run {
            Movie(this.title)
        }
    }

    override suspend fun getMovies(): List<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getMovieById(): Movie {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}