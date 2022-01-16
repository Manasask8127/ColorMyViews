package com.example.manasask.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

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
                findViewById(R.id.box_five_text),findViewById(R.id.constraint_layout),
                findViewById(R.id.red_button),findViewById(R.id.blue_button),
                findViewById(R.id.yellow_botton))
        for(item in clickableViews)
            item.setOnClickListener { makeColorChange(it) }
    }

    private fun makeColorChange(View: View) {
        when(View.id)
        {
            R.id.box_one_text -> View.setBackgroundColor(Color.MAGENTA)
            R.id.box_two_text -> View.setBackgroundColor(Color.GREEN)
            R.id.box_three_text -> View.setBackgroundColor(Color.YELLOW)
            R.id.box_four_text -> View.setBackgroundColor(Color.DKGRAY)
            R.id.box_five_text -> View.setBackgroundColor(Color.WHITE)
            R.id.red_button -> findViewById<TextView>(R.id.box_three_text).setBackgroundColor(Color.RED)
            R.id.blue_button -> findViewById<TextView>(R.id.box_four_text).setBackgroundColor(Color.BLUE)
            R.id.yellow_botton -> findViewById<TextView>(R.id.box_five_text).setBackgroundColor(Color.YELLOW)

            else ->
                View.setBackgroundColor(Color.GRAY)

        }
    }


}