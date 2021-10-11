/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android.diceroller.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       //  setContentView(R.layout.activity_main)
       //  val rollButton = findViewById<Button>(R.id.roll_button)
       //  rollButton.text = "Lets Roll"

        // inflate the layout
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollButton.setOnClickListener {
            rollDice(binding)
        }

    }

    private fun rollDice(binding: ActivityMainBinding ) {
        setContentView(binding.root)

        // random number after click
        val drawableResource = when
                ((Random.nextInt(6) + 1).toString()) {
                    "1" -> R.drawable.dice_1
                    "2" -> R.drawable.dice_2
                    "3" -> R.drawable.dice_3
                    "4" -> R.drawable.dice_4
                    "5" -> R.drawable.dice_5
                    else -> R.drawable.dice_6
        }

        val diceImage: ImageView = binding.diceImage
        diceImage.setImageResource(drawableResource)

    }
}
