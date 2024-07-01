package com.example.hw1

class CarBuilder(val brand: String) {
    private var model: String = "Unknown"
    private var year: Int = 0
    private var horsepower: Int = 0
    private var enginePower: Int = 0
    private var luxuryLevel: Int = 0
    private var loadCapacity: Int = 0
    private var batteryCapacity: Int = 0

    fun setModel(model: String) = apply { this.model = model }
    fun setYear(year: Int) = apply { this.year = year }
    fun setHorsepower(horsepower: Int) = apply { this.horsepower = horsepower }
    fun setEnginePower(enginePower: Int) = apply { this.enginePower = enginePower }
    fun setLuxuryLevel(luxuryLevel: Int) = apply { this.luxuryLevel = luxuryLevel }
    fun setLoadCapacity(loadCapacity: Int) = apply { this.loadCapacity = loadCapacity }
    fun setBatteryCapacity(batteryCapacity: Int) = apply { this.batteryCapacity = batteryCapacity }

    fun build(): Car {
        return when (brand) {
            "Crossover" -> Crossover(brand, model, year, horsepower, enginePower)
            "Sedan" -> Sedan(brand, model, year, horsepower, luxuryLevel)
            "Truck" -> Truck(brand, model, year, horsepower, loadCapacity)
            "ElectricCar" -> ElectricCar(brand, model, year, horsepower, batteryCapacity)
            else -> Car(brand, model, year, horsepower)
        }
    }
}