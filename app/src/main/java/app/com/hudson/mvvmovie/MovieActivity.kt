package app.com.hudson.mvvmovie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class MovieActivity : AppCompatActivity() {

    val viewmodel by inject<MovieVM>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        GlobalScope.launch {
            try {
                val teste = viewmodel.getMovies()
            } catch (error: Throwable) {
                error.stackTrace
            }
        }
    }
}