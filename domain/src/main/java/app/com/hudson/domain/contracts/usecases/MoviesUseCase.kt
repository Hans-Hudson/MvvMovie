package app.com.hudson.domain.contracts.usecases

import app.com.hudson.domain.Entities.Movie
import app.com.hudson.domain.usecases.UseCase

interface MoviesUseCase : UseCase.withNoParameters<List<Movie>>