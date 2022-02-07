package com.example.newapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.mlkit.vision.text.Text

class MainActivity : AppCompatActivity() {

    //Execute later, because the var is not assigned before the onCreate method.
    lateinit var diceOneImage : ImageView
    lateinit var diceTwoImage : ImageView

    override fun onResume() {
        Log.i("Message: ", "onResume activity")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Message: ", "onPause activity")
        super.onPause()
    }

    override fun onDestroy() {
        Log.i("Message: ", "onDestroy activity")
        super.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll_button)
        val resetButton : Button = findViewById(R.id.reset_button)
        diceOneImage = findViewById(R.id.dice_image)
        diceTwoImage = findViewById(R.id.dice_image_two)

        rollButton.setOnClickListener { rollDice() }
        resetButton.setOnClickListener { resetDices() }
    }

    private fun resetDices() {
        Toast.makeText(this, "Reset dices!", Toast.LENGTH_SHORT).show()
        diceOneImage.setImageResource(R.drawable.dice_1)
        diceTwoImage.setImageResource(R.drawable.dice_1)
    }

    private fun rollDice() {
        //Show a dialog Toast on android
        Toast.makeText(this, "Rolled!!!", Toast.LENGTH_SHORT).show()
        //resultText.text = randomNum.toString()
        diceOneImage.setImageResource(diceImages(getRandomInt()))
        diceTwoImage.setImageResource(diceImages(getRandomInt()))
    }

    private fun diceImages(num : Int ) : Int {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource;
    }

    private fun getRandomInt() : Int {
        return (1..6).random()
    }
}