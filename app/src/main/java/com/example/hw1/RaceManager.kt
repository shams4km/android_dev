package com.example.hw1

import android.util.Log

class RaceManager {

    companion object {
        const val TAG = "RaceManager"
    }

    private fun race(car1: Car, car2: Car): Car {
        Log.d(TAG, "Race between ${car1.brand} ${car1.model} and ${car2.brand} ${car2.model}")

        return if (car1.horsepower > car2.horsepower) {
            Log.d(TAG, "Winner: ${car1.brand} ${car1.model}")
            car1
        } else {
            Log.d(TAG, "Winner: ${car2.brand} ${car2.model}")
            car2
        }
    }

    fun organizeRaces(cars: List<Car>): Car {
        var remainingCars = cars.toMutableList()

        while (remainingCars.size > 1) {
            val nextRound = mutableListOf<Car>()
            val shuffledCars = remainingCars.shuffled()

            for (i in 0 until shuffledCars.size step 2) {
                if (i + 1 < shuffledCars.size) {
                    val winner = race(shuffledCars[i], shuffledCars[i + 1])
                    nextRound.add(winner)
                } else {
                    Log.d(TAG, "${shuffledCars[i].brand} ${shuffledCars[i].model} - No pares, next race")
                    nextRound.add(shuffledCars[i])
                }
            }
            remainingCars = nextRound
        }

        return remainingCars.first()
    }
}