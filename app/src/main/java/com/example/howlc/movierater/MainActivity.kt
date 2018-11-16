package com.example.howlc.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkNotSuitable.setOnClickListener {
            if(chkNotSuitable.isChecked == true) {
                chkViolence.setVisibility(View.VISIBLE)
                chkLanguage.setVisibility(View.VISIBLE)
                chkViolence.setEnabled(true)
                chkLanguage.setEnabled(true)
            } else {
                chkViolence.setVisibility(View.GONE)
                chkLanguage.setVisibility(View.GONE)
                chkViolence.setEnabled(false)
                chkLanguage.setEnabled(false)
            }
        }
    }

    fun validateMovie(v: View) {
        var movieName: Boolean = movieNameNotEmpty.text.isNotEmpty()
        var movieDescription: Boolean = movieDescriptionNotEmpty.text.isNotEmpty()
        val movieLang: RadioButton = findViewById(radioLanguage.checkedRadioButtonId)
        var movieSuit : Boolean = chkNotSuitable.isChecked
        var suitLang : Boolean = chkLanguage.isChecked
        var suitViol : Boolean = chkViolence.isChecked
        var movieDate : Boolean = movieReleaseText.text.isNotEmpty()

        val msg = "Title="+movieNameNotEmpty.text+
                "\nOverview="+movieDescriptionNotEmpty.text+
                "\nRelease Date="+movieReleaseText.text+
                "\nLanguage= ${movieLang.text}"+
                "\nSuitable for all ages="+(if(movieSuit == true) "false" else "true")+
                (if (movieSuit == true) "\nReason:\n Language= ${suitLang}\nViolence= ${suitViol}" else "")

        if (movieName == false) {
            movieNameNotEmpty.setError("Please Enter a movie name.")
        }
        else if (movieDescription == false) {
            movieDescriptionNotEmpty.setError("Please enter a description.")
        }
        else if (movieDate == false) {
            movieReleaseText.setError("Please enter a release date.")
        }
        else{
            Toast.makeText(this@MainActivity,msg, Toast.LENGTH_LONG).show()
        }


    }

}
