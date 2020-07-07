package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceimage :ImageView
    lateinit var rollbutton :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceimage = findViewById(R.id.diceimage)
        diceimage.setImageResource(R.drawable.empty_dice);
        rollbutton = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener {
            rolldice()
        }

    }

    private fun rolldice() {

        val RandomInt = Random.nextInt(1,6)
        val randomdice = when (RandomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6

            else -> {
                R.drawable.empty_dice
            }

        }
        diceimage.setImageResource(randomdice)
        }
    }

