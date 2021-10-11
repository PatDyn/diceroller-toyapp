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
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       //  setContentView(R.layout.activity_main)
       //  val rollButton = findViewById<Button>(R.id.roll_button)
       //  rollButton.text = "Lets Roll"

        // this somehow overrides the main_activity.xml gravity
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // binding.root.setVerticalGravity(2)
        binding.rollButton.text = "Throw Dice"
        binding.rollButton.setOnClickListener { Toast.makeText(
            this,
            "button clicked",
            Toast.LENGTH_SHORT).show()}

    }
}
