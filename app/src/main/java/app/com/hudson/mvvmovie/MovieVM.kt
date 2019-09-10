package app.com.hudson.mvvmovie

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import app.com.hudson.domain.Repositories.MoviesRepository

class MovieVM(appVM: Application, val repository: MoviesRepository) : AndroidViewModel(appVM),
    LifecycleObserver {
    val title = MutableLiveData<String>().apply { value = appVM.getString(R.string.movie_list) }
    val movies = MutableLiveData<List<String>>().apply { value = listOf<String>("f1", "f2", "f3") }


}