package com.example.movielist_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_details_fragment.*
import kotlinx.android.synthetic.main.layout_list_item.*
import kotlinx.android.synthetic.main.layout_list_item.movieId
import kotlinx.android.synthetic.main.layout_list_item.movieName

class MovieDetailsFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details_fragment)

        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val director = intent.getStringExtra("director")
        val actors = intent.getStringExtra("actors")

        movieName.text = name
        movieDescription.text = description
        mDirector.text = director
        movieActors.text = actors
    }
}