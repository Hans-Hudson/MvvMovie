package app.com.hudson.mvvmovie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import app.com.hudson.data.remote.contracts.Api
import app.com.hudson.mvvmovie.databinding.ActivityMovieBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class MovieActivity : AppCompatActivity() {

//var viewModel = MovieVM(this.application)

    val api by inject<Api>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMovieBinding>(this, R.layout.activity_movie)
        binding.viewModel = ViewModelProviders.of(this, MoviewVMFactory(this.application)).get(MovieVM::class.java)
        binding.movieList.adapter = MovieAdapter(listOf())
        binding.movieList.layoutManager = LinearLayoutManager(this)

        GlobalScope.launch {
            try {
                val teste = api.getMovies()
            } catch (error: Throwable) {
                error.stackTrace
            }
        }
    }
}