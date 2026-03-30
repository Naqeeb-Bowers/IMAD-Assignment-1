package com.example.mainscreenass_1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity (mainScreen) {

    override fun onCreate(savedInstanceState: Bundle?) {

        super .onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val inputTime = findViewById<EditText>(R.id.editTime)
        val buttonSuggest = findViewById<Button>(R.id.btnSuggest)
        val buttonReset = findViewById<Button>(R.id.btnReset)
        val textResult = findViewById<TextView>(R.id.txtSuggestion)

        buttonSuggest.setOnClickListener {

            val timeOfDay = inputTime.text.toString().lowercase()

            val suggestion = when (timeOfDay) {

                "morning" ->
                    "send a good morning message to a family member"

                "mid-morning" ->
                    "send a quick thank you message to a colleague"

                "afternoon" ->
                    "Share a funny meme with a friend"

                "lunch time" ->
                    "send a thoughtful message to 2 contacts"

                "dinner" ->
                    "call a friend for a 5-minute catch-up"

                "night", "evening" ->
                    "leave a kind comment under someones post"

                else ->
                    "please enter morning, mid-morning, afternoon, lunch time, dinner, night or evening"

            }

            textResult.text = suggestion
        }

        buttonReset.setOnClickListener {
            inputTime.text.clear()
            textResult.text =""





        }
    }
}