package com.example.howlc.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ViewMovieDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_movie_details)

        val movieVenom = movieDetails("Venom", "When Eddie Brock acquires the powers of a symbiote, he will have to release his alter-ego Venom to save his life.","English","30-10-2018","Yes")
        val movieName: TextView = findViewById(R.id.titleMovie)
        val movieOverview: TextView = findViewById(R.id.overviewMovie)
        val movieLanguage : TextView = findViewById(R.id.languageMovie)
        val movieRelease : TextView = findViewById(R.id.dateMovie)
        val movieSuit : TextView = findViewById(R.id.suitMovie)
        movieName.text = movieVenom.movieTitle
        movieOverview.text = movieVenom.movieOverview
        movieLanguage.text = movieVenom.movieLanguage
        movieRelease.text = movieVenom.movieRelease
        movieSuit.text = movieVenom.movieSuit
    }
}
