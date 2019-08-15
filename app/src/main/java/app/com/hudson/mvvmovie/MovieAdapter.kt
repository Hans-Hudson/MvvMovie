package app.com.hudson.mvvmovie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import app.com.hudson.mvvmovie.databinding.MovieItemBinding

class MovieAdapter(var items: List<String>) : RecyclerView.Adapter<MovieAdapter.MovieVH>(),
    AdapterItemsContract {

    companion object {
        @BindingAdapter("balao")
        @JvmStatic
        fun setItems(recyclerView: RecyclerView, list: List<String>) {
            recyclerView.adapter.let {
                if (it is AdapterItemsContract) {
                    it.replaceItems(list)
                }
            }
        }
    }

    override fun replaceItems(item: List<*>) {
        this.items = item as List<String>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieVH {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MovieItemBinding.inflate(inflater, parent, false)
        return MovieVH(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MovieVH, position: Int) {
        holder.bind(items[position])
    }

    class MovieVH(val binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: String) {
            binding.movie = movie
            binding.executePendingBindings()
        }
    }
}