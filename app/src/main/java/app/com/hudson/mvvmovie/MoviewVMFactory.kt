package app.com.hudson.mvvmovie

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MoviewVMFactory(
    private val app: Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        with(modelClass) {
            when {
                isAssignableFrom(MovieVM::class.java) ->
                    MovieVM(app)
                else ->
                    throw IllegalArgumentException("Classe desconhecida.")
            }
        } as T
}