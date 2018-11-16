package com.example.howlc.movierater

class movieDetails(movieTitle:String,movieOverview:String,movieLanguage:String,movieRelease:String,movieSuit:String) {
    var movieTitle : String
    var movieOverview : String
    var movieLanguage : String
    var movieRelease : String
    var movieSuit : String

    init {
        this.movieTitle = movieTitle
        this.movieOverview = movieOverview
        this.movieLanguage = movieLanguage
        this.movieRelease = movieRelease
        this.movieSuit = movieSuit
    }
}