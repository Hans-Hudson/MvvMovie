package app.com.hudson.mvvmovie

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData

class MovieVM(appVM: Application) : AndroidViewModel(appVM), LifecycleObserver {
    val title = MutableLiveData<String>().apply { value = appVM.getString(R.string.movie_list) }
    val movies = MutableLiveData<List<String>>().apply { value = listOf<String>("f1", "f2", "f3") }
}