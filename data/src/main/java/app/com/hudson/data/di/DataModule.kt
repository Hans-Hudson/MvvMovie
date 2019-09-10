package app.com.hudson.data.di

import app.com.hudson.data.repositories.MoviesRepositoryImpl
import app.com.hudson.domain.Repositories.MoviesRepository
import org.koin.dsl.module

object DataModule {
    val instances = module{
        single <MoviesRepository>{
            MoviesRepositoryImpl(
                api = get()
            )
        }
    }
}