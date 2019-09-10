package app.com.hudson.mvvmovie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.com.hudson.data.remote.contracts.Api
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class MovieActivity : AppCompatActivity() {

    val api by inject<Api>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        GlobalScope.launch {
            try {
                val teste = api.getMovies("harry")
                teste
            } catch (error: Throwable) {
                error.stackTrace
            }
        }
    }
}