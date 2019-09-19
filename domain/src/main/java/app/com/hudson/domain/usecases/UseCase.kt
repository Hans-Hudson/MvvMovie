package app.com.hudson.domain.usecases

import app.com.hudson.domain.Entities.Movie

abstract class UseCase {

    interface withNoParameters<R> {
        suspend fun execute(): Movie
    }

    interface withParameters<in P, R> {
        fun execute(params: P): R
    }
}