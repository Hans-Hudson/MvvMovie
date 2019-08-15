package app.com.hudson.domain.Repositories

import app.com.hudson.domain.Entities.Movie

interface MoviesRepository {
    fun getMovies() : List<Movie>
}