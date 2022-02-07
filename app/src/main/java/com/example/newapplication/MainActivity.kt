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
    lateinit var diceImage : ImageView

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
        val addButton : Button = findViewById(R.id.add_button)
        diceImage = findViewById(R.id.dice_image)

        rollButton.setOnClickListener { rollDice() }
        addButton.setOnClickListener { oneMoreValue() }
    }

    private fun rollDice() {
        //Show a dialog Toast on android
        Toast.makeText(this, "Rolled!!!", Toast.LENGTH_SHORT).show()

        //resultText.text = randomNum.toString()
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    private fun oneMoreValue() {

        //val resultText : TextView = findViewById(R.id.result_text)
       // if (resultText.text.length == 1) {
         //   if (!resultText.text.equals("6")){
           //     Toast.makeText(this, "added one more", Toast.LENGTH_SHORT).show()
             //   resultText.text = ((resultText.text.toString().toInt()) + 1).toString()
            //}
            //else{
              //  Toast.makeText(this, "No more numbers", Toast.LENGTH_SHORT).show()
            //}
        //}
        //else{
         //   Toast.makeText(this, "is a text? I Cant!", Toast.LENGTH_SHORT).show()
          //  resultText.text = "1"
       // }
    }
}