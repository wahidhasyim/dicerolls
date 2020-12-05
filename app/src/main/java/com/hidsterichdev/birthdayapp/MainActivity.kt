package com.hidsterichdev.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRoll.setOnClickListener() {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomListInt = (1..6).random()
        val drawableResource = when (randomListInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        iv_dice.setImageResource(drawableResource)
        iv_dice.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
    }
}