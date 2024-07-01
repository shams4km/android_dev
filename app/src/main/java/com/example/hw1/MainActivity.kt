package com.example.hw1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputField: EditText = findViewById(R.id.inputField)
        val startButton: Button = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            Log.d(TAG, "Start button clicked")
            val numCars = inputField.text.toString().toIntOrNull()
            if (numCars != null && numCars > 0) {
                Log.d(TAG, "Number of cars: $numCars")
                val cars = generateRandomCars(numCars)
                val winner = RaceManager().organizeRaces(cars)
                Log.d(TAG, "Winner: ${winner.brand} ${winner.model}")
            } else {
                Log.d(TAG, "Write correct number of cars")
            }
        }
    }


    private fun generateRandomCars(num: Int): List<Car> {
        val carTypes = listOf("Crossover", "Sedan", "Truck", "ElectricCar")
        val cars = mutableListOf<Car>()
        for (i in 1..num) {
            val brand = carTypes.random()
            val car = CarBuilder(brand)
                .setModel("Model$i")
                .setYear((2000..2023).random())
                .setHorsepower((100..500).random())
                .setEnginePower((100..500).random())
                .setLuxuryLevel((1..10).random())
                .setLoadCapacity((1000..10000).random())
                .setBatteryCapacity((50..200).random())
                .build()
            cars.add(car)
        }
        return cars
    }
}