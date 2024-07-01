package com.example.hw1

import android.util.Log

open class Car(val brand: String, val model: String, val year: Int, val horsepower: Int) {
    fun printInfo() {
        Log.d("CarInfo", "Brand: $brand, Model: $model, Year: $year, HorsePower: $horsepower")
    }
}

class Crossover(
    brand: String,
    model: String,
    year: Int,
    horsepower: Int,
    val enginePower: Int
) : Car(brand, model, year, horsepower)

class Sedan(
    brand: String,
    model: String,
    year: Int,
    horsepower: Int,
    val luxuryLevel: Int
) : Car(brand, model, year, horsepower)

class Truck(
    brand: String,
    model: String,
    year: Int,
    horsepower: Int,
    val loadCapacity: Int
) : Car(brand, model, year, horsepower)

class ElectricCar(
    brand: String,
    model: String,
    year: Int,
    horsepower: Int,
    val batteryCapacity: Int
) : Car(brand, model, year, horsepower)