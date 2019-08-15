package app.com.hudson.domain.usecases

abstract class UseCase {

    interface withNoParameters<R> {
        fun execute(): R
    }

    interface withParameters<in P, R> {
        fun execute(params: P): R
    }
}