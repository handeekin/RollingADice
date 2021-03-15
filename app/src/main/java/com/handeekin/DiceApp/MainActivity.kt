package com.handeekin.DiceApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ZarAtButon : Button = findViewById(R.id.button)
        val TemizleButon : Button = findViewById(R.id.button2)
        val ZarImage1 : ImageView = findViewById(R.id.imageView3)
        val ZarImage2 : ImageView = findViewById(R.id.imageView4)
        val text = "Zar Atıldı!"
        val duration = Toast.LENGTH_LONG

        val toast = Toast.makeText(applicationContext, text, duration)




        ZarAtButon.setOnClickListener {
            toast.show()
            val randomSayi1 = (1..6).random()
            val randomSayi2 = (1..6).random()


            when(randomSayi1) {
                1 -> ZarImage1.setImageResource(R.drawable.dice_1)
                2 -> ZarImage1.setImageResource(R.drawable.dice_2)
                3 -> ZarImage1.setImageResource(R.drawable.dice_3)
                4 -> ZarImage1.setImageResource(R.drawable.dice_4)
                5 -> ZarImage1.setImageResource(R.drawable.dice_5)
                6 -> ZarImage1.setImageResource(R.drawable.dice_6)
            }

            when(randomSayi2) {
                1 -> ZarImage2.setImageResource(R.drawable.dice_1)
                2 -> ZarImage2.setImageResource(R.drawable.dice_2)
                3 -> ZarImage2.setImageResource(R.drawable.dice_3)
                4 -> ZarImage2.setImageResource(R.drawable.dice_4)
                5 -> ZarImage2.setImageResource(R.drawable.dice_5)
                6 -> ZarImage2.setImageResource(R.drawable.dice_6)
            }

        }
        TemizleButon.setOnClickListener {
            ZarImage1.setImageResource(R.drawable.empty_dice)
            ZarImage2.setImageResource(R.drawable.empty_dice)
        }




    }


}