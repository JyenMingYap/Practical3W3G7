package com.example.practical3w3g7

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()

    }

    private fun makeColored(view: View) {

        val box_three_text = findViewById<TextView>(R.id.box_three_text)
        val box_four_text = findViewById<TextView>(R.id.box_four_text)
        val box_five_text = findViewById<TextView>(R.id.box_five_text)

        val root = findViewById<View>(R.id.constraint_layout)

        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.image_two)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            // Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            R.id.red_color -> root.setBackgroundColor(Color.RED)
            R.id.orange_color -> root.setBackgroundColor(Color.DKGRAY)
            R.id.yellow_color -> root.setBackgroundColor(Color.YELLOW)
            R.id.green_color -> root.setBackgroundColor(Color.GREEN)
            R.id.blue_color -> root.setBackgroundColor(Color.BLUE)
            R.id.magenta_color -> root.setBackgroundColor(Color.MAGENTA)
            R.id.cyan_color -> root.setBackgroundColor(Color.CYAN)
            R.id.black_color -> root.setBackgroundColor(Color.BLACK)
            R.id.white_color -> root.setBackgroundColor(Color.WHITE)

            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val red_color = findViewById<TextView>(R.id.red_color)
        val orange_color = findViewById<TextView>(R.id.orange_color)
        val yellow_color = findViewById<TextView>(R.id.yellow_color)
        val green_color = findViewById<TextView>(R.id.green_color)
        val blue_color = findViewById<TextView>(R.id.blue_color)
        val magenta_color = findViewById<TextView>(R.id.magenta_color)
        val cyan_color = findViewById<TextView>(R.id.cyan_color)
        val black_color = findViewById<TextView>(R.id.black_color)
        val white_color = findViewById<TextView>(R.id.white_color)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                redButton, greenButton, yellowButton, blue_color,
                red_color, orange_color, yellow_color, green_color,
                magenta_color, cyan_color, black_color, white_color
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }


    }
}