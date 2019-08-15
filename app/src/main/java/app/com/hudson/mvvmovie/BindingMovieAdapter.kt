package app.com.hudson.mvvmovie

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

class BindingMovieAdapter {
    companion object {
        @BindingAdapter("items")
        @JvmStatic
        fun setItems(recyclerView: RecyclerView, list: List<Any>) {
            recyclerView.adapter.let {

            }
        }
    }
}