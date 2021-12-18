package com.example.movielist_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnMovieClickListener {
    var movies = arrayListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          movies = arrayListOf<Movie>(
            Movie(1,"Captain America","movie description","Director","actor1, actor2, actor3"),
            Movie(2,"Lucy","movie description","Director","actor1, actor2, actor3"),
            Movie(3,"Thor","movie description","Director","actor1, actor2, actor3"),
            Movie(4,"Inception","movie description","Director","actor1, actor2, actor3"),
            Movie(5,"Shutter Island","movie description","Director","actor1, actor2, actor3"),
            Movie(6,"Ready Player One","movie description","Director","actor1, actor2, actor3"),
             Movie(7,"Source Code","movie description","Director","actor1, actor2, actor3"),
             Movie(8,"Spider-Man","movie description","Director","actor1, actor2, actor3"),
             Movie(9,"Stalker","movie description","Director","actor1, actor2, actor3"),
             Movie(10,"Youve Got Mail","movie description","Director","actor1, actor2, actor3"),
             Movie(11,"Zodiac","movie description","Director","actor1, actor2, actor3"),
             Movie(12,"Mystic River","movie description","Director","actor1, actor2, actor3"),
             Movie(13,"Harry Potter","movie description","Director","actor1, actor2, actor3"),
             Movie(14,"Lord Of The Rings","movie description","Director","actor1, actor2, actor3"),
             Movie(15,"The God Father","movie description","Director","actor1, actor2, actor3"),
             Movie(16,"Brothers","movie description","Director","actor1, actor2, actor3"),
             Movie(17,"Cloud Atlas","movie description","Director","actor1, actor2, actor3"),
             Movie(18,"Dune","movie description","Director","actor1, actor2, actor3"),
             Movie(1,"","","",""),
             Movie(2,"","","",""),

         )

        var movieAdapter = MovieAdapter(movies, this)
        rv_movie_list.layoutManager = LinearLayoutManager(this)
        rv_movie_list.adapter = movieAdapter

        var addMovieButton: Button = findViewById(R.id.addMovieButton)

        addMovieButton.setOnClickListener(){
            val builder = AlertDialog.Builder(this)
        }


    }


    override fun onMovieItemClicked(position: Int) {

        Toast.makeText(this,"Movie " + position + " Clicked",Toast.LENGTH_LONG).show()

        val intent = Intent(this, MovieDetailsFragment::class.java)
        intent.putExtra("id", movies[position].id)
        intent.putExtra("name", movies[position].name)
        intent.putExtra("description", movies[position].description)
        intent.putExtra("director", movies[position].director)
        intent.putExtra("actors", movies[position].actors)

        startActivity(intent)
    }


}