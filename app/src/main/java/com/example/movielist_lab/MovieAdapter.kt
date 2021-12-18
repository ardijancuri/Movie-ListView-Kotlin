package com.example.movielist_lab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_list_item.view.*

class MovieAdapter(private val movies : ArrayList<Movie>, private val onMovieClickListener: OnMovieClickListener) : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]

        holder.itemView.movieId.text = movie.id.toString()
        holder.itemView.movieName.text = movie.name
        holder.itemView.movieDirector.text = movie.director

        holder.itemView.setOnClickListener{
            onMovieClickListener.onMovieItemClicked(position)
        }

    }

    override fun getItemCount(): Int {
        return movies.size
    }
}