package com.example.tapstarters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This forces app into light mode.
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val charmanderBtn = findViewById<Button>(R.id.charmanderBtn)
        val bulbasaurBtn = findViewById<Button>(R.id.bulbasaurBtn)
        val squirtleBtn = findViewById<Button>(R.id.squirtleBtn)
        val counter = findViewById<StrokedTextView>(R.id.counter)
        val tap = findViewById<ImageButton>(R.id.tap)
        val evolve = findViewById<Button>(R.id.evolve)

        var swap = 0
        var tapCount = 0

        fun swapToCharmander() {
            swap = 1
            val charmanderImg2 = findViewById<ImageView>(R.id.charmanderImg2)
            //tap.text = "Feed Charmander!"
            tap.visibility = View.VISIBLE
            counter.visibility = View.VISIBLE
            charmanderImg2.visibility = View.VISIBLE
            tap.setBackgroundResource(R.drawable.fire)
        }
        fun swapToBulbasaur() {
            swap = 2
            val bulbasaurImg2 = findViewById<ImageView>(R.id.bulbasaurImg2)
            //tap.text = "Feed Bulbasaur!"
            tap.visibility = View.VISIBLE
            counter.visibility = View.VISIBLE
            bulbasaurImg2.visibility = View.VISIBLE
            tap.setBackgroundResource(R.drawable.leaf)
        }
        fun swapToSquirtle() {
            swap = 3
            val squirtleImg2 = findViewById<ImageView>(R.id.squirtleImg2)
            //tap.text = "Feed Squirtle!"
            tap.visibility = View.VISIBLE
            counter.visibility = View.VISIBLE
            squirtleImg2.visibility = View.VISIBLE
            tap.setBackgroundResource(R.drawable.water)
        }
        fun clearScreen() {
            val title = findViewById<StrokedTextView>(R.id.title)
            val intro = findViewById<TextView>(R.id.intro)
            val charmanderImg = findViewById<ImageView>(R.id.charmanderImg)
            val bulbasaurImg = findViewById<ImageView>(R.id.bulbasaurImg)
            val squirtleImg = findViewById<ImageView>(R.id.squirtleImg)

            title.visibility = View.INVISIBLE
            intro.visibility = View.INVISIBLE
            charmanderImg.visibility = View.INVISIBLE
            bulbasaurImg.visibility = View.INVISIBLE
            squirtleImg.visibility = View.INVISIBLE
            charmanderBtn.visibility = View.INVISIBLE
            bulbasaurBtn.visibility = View.INVISIBLE
            squirtleBtn.visibility = View.INVISIBLE
        }

        fun charmeleon() {
            Toast.makeText(this, "What?! Charmander is evolving!", Toast.LENGTH_SHORT).show()
            val charmanderImg2 = findViewById<ImageView>(R.id.charmanderImg2)
            val charmeleonImg = findViewById<ImageView>(R.id.charmeleonImg)
            charmanderImg2.visibility = View.INVISIBLE
            charmeleonImg.visibility = View.VISIBLE
        }
        fun charizard() {
            Toast.makeText(this, "What?! Charmeleon is evolving!", Toast.LENGTH_SHORT).show()
            val charmeleonImg = findViewById<ImageView>(R.id.charmeleonImg)
            val charizardImg = findViewById<ImageView>(R.id.charizardImg)
            charmeleonImg.visibility = View.INVISIBLE
            charizardImg.visibility = View.VISIBLE
        }
        fun ivysaur() {
            Toast.makeText(this, "What?! Bulbasaur is evolving!", Toast.LENGTH_SHORT).show()
            val bulbasaurImg2 = findViewById<ImageView>(R.id.bulbasaurImg2)
            val ivysaurImg = findViewById<ImageView>(R.id.ivysaurImg)
            bulbasaurImg2.visibility = View.INVISIBLE
            ivysaurImg.visibility = View.VISIBLE
        }
        fun venusaur() {
            Toast.makeText(this, "What?! Bulbasaur is evolving!", Toast.LENGTH_SHORT).show()
            val ivysaurImg = findViewById<ImageView>(R.id.ivysaurImg)
            val venusaurImg = findViewById<ImageView>(R.id.venusaurImg)
            ivysaurImg.visibility = View.INVISIBLE
            venusaurImg.visibility = View.VISIBLE
        }
        fun wartotle() {
            Toast.makeText(this, "What?! Squirtle is evolving!", Toast.LENGTH_SHORT).show()
            val squirtleImg2 = findViewById<ImageView>(R.id.squirtleImg2)
            val wartotleImg = findViewById<ImageView>(R.id.wartotleImg)
            squirtleImg2.visibility = View.INVISIBLE
            wartotleImg.visibility = View.VISIBLE
        }
        fun blastoise() {
            Toast.makeText(this, "What?! Wartotle is evolving!", Toast.LENGTH_SHORT).show()
            val wartotleImg = findViewById<ImageView>(R.id.wartotleImg)
            val blastoiseImg = findViewById<ImageView>(R.id.blastoiseImg)
            wartotleImg.visibility = View.INVISIBLE
            blastoiseImg.visibility = View.VISIBLE
        }
        fun shinyCharizard() {
            Toast.makeText(this, "What?! Charizard turned Shiny!", Toast.LENGTH_SHORT).show()
            val charizardImg = findViewById<ImageView>(R.id.charizardImg)
            val shinyCharizardImg = findViewById<ImageView>(R.id.shinyCharizard)
            charizardImg.visibility = View.INVISIBLE
            shinyCharizardImg.visibility = View.VISIBLE
        }
        fun shinyVenusaur() {
            Toast.makeText(this, "What?! Venusaur turned Shiny!", Toast.LENGTH_SHORT).show()
            val venusaurImg = findViewById<ImageView>(R.id.venusaurImg)
            val shinyVenusaurImg = findViewById<ImageView>(R.id.shinyVenusaur)
            venusaurImg.visibility = View.INVISIBLE
            shinyVenusaurImg.visibility = View.VISIBLE
        }
        fun shinyBlastoise() {
            Toast.makeText(this, "What?! Blastoise turned Shiny!", Toast.LENGTH_SHORT).show()
            val blastoiseImg = findViewById<ImageView>(R.id.blastoiseImg)
            val shinyBlastoiseImg = findViewById<ImageView>(R.id.shinyBlastoise)
            blastoiseImg.visibility = View.INVISIBLE
            shinyBlastoiseImg.visibility = View.VISIBLE
        }


        charmanderBtn.setOnClickListener {
            swap = 1
            Toast.makeText(this, "Charmander, I choose you!", Toast.LENGTH_SHORT).show()
            clearScreen()
            swapToCharmander()
        }
        bulbasaurBtn.setOnClickListener {
            swap = 2
            Toast.makeText(this, "Bulbasaur, I choose you!", Toast.LENGTH_SHORT).show()
            clearScreen()
            swapToBulbasaur()
        }
        squirtleBtn.setOnClickListener {
            swap = 3
            Toast.makeText(this, "Squirtle, I choose you!", Toast.LENGTH_SHORT).show()
            clearScreen()
            swapToSquirtle()
        }

        tap.setOnClickListener {
            tapCount++
            counter.text = tapCount.toString()

            if (tapCount >= 100) {
                evolve.visibility = View.VISIBLE
                evolve.setOnClickListener {
                    //tap.text = "Add 2"
                    if (swap == 1) {
                        charmeleon()
                    } else if (swap == 2) {
                        ivysaur()
                    } else {
                        wartotle()
                    }
                    tap.setOnClickListener {
                        tapCount += 2
                        counter.text = tapCount.toString()

                        if (tapCount >= 250) {
                            evolve.visibility = View.VISIBLE
                            evolve.setOnClickListener {
                                if (swap == 1) {
                                    charizard()
                                } else if (swap == 2) {
                                    venusaur()
                                } else {
                                    blastoise()
                                }
                                tap.setOnClickListener {
                                    tapCount += 5
                                    counter.text = tapCount.toString()

                                    if (tapCount >= 1000) {
                                        evolve.visibility = View.VISIBLE
                                        evolve.text = "Turn Pokemon Shiny!"
                                        evolve.setOnClickListener {
                                            if (swap == 1) {
                                                shinyCharizard()
                                            } else if (swap == 2) {
                                                shinyVenusaur()
                                            } else {
                                                shinyBlastoise()
                                            }
                                            tap.setOnClickListener {
                                                tapCount += 10
                                                counter.text = tapCount.toString()
                                            }
                                            evolve.visibility = View.INVISIBLE
                                        }
                                    }
                                }
                                evolve.visibility = View.INVISIBLE
                            }
                        }
                    }
                    evolve.visibility = View.INVISIBLE
                }
            }
        }
    }
}