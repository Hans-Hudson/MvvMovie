package app.com.hudson.domain.di

import app.com.hudson.domain.contracts.usecases.MoviesUseCase
import app.com.hudson.domain.usecases.MoviesUsecasesImpl
import org.koin.dsl.module

object DomainModule {
    val instance = module{
        factory <MoviesUseCase>{
            MoviesUsecasesImpl(
                api = get()
            )
        }
    }
}