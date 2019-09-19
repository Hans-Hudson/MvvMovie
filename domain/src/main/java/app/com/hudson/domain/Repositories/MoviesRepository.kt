package app.com.hudson.domain.Repositories

import app.com.hudson.domain.Entities.Movie

interface MoviesRepository {
    suspend fun getMovie() : Movie
    suspend fun getMovies() : List<Movie>
    suspend fun getMovieById() : Movie


}