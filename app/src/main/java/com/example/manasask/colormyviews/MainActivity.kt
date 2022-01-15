package com.example.manasask.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClickListeners()
    }
    private fun setClickListeners()
    {
        val clickableViews : List<View> =
            listOf(findViewById(R.id.box_one_text),findViewById(R.id.box_two_text),
                findViewById(R.id.box_three_text),findViewById(R.id.box_four_text),
                findViewById(R.id.box_five_text),findViewById(R.id.constraint_layout))
        for(item in clickableViews)
            item.setOnClickListener { makeColorChange(it) }
    }

    private fun makeColorChange(View: View) {
        when(View.id)
        {
            R.id.box_one_text -> View.setBackgroundColor(Color.MAGENTA)
            R.id.box_two_text -> View.setBackgroundColor(Color.GREEN)
            R.id.box_three_text -> View.setBackgroundColor(Color.YELLOW)
            R.id.box_four_text -> View.setBackgroundColor(Color.BLUE)
            R.id.box_five_text -> View.setBackgroundColor(Color.WHITE)
            else ->
                View.setBackgroundColor(Color.GRAY)

        }
    }


}