fun main() {
println(numbers)
println(numbers)
    println(sortedNumber)
    println(arrayOf(numbers.sortedArray())ToString())

}
// Create one function that is given the below array:
var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//prints out the sum of the second and fifth elements (1 point)
fun numbers(number:Array<Int>){

    var a = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,620)
    var numb=numbers[1]+numbers[4]

}


// prints out the index of 158 (1 point)
var arraynumbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
 var nums=numbers.get(158)

// prints out the elements in ascending order. (1 point)
var sortedNumber = arraynumbers.sortedArray()

//Given a list of Person objects, each with the attributes, name, age, height, and weight.
// Sort the list in order of descending age (2 points)
fun person() {
    class Person(name: String, age: Int, height: Float, weight: Double)
}
//Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)
fun names(name1:String,name2:String,name3:String):String{

    var names = arrayOf(name1,name2,name3)
      return arrayOf(names)

}






// Write a function that takes in a list of Car objects each with a registration and mileage
// attribute and returns the average mileage of all the vehicles in the list. (3 points)
data class Vehicle(var registration:String,var mileage:Int)
fun vehicleObject(vehicle: List<Vehicle>):Int{
    var K= Vehicle("KCC",89)
    var V = Vehicle("KAV",90)
    var V = Vehicle("KWT",58)
    var allVehicles = listOf(K,V,V)
    var ack=0
    vehicle.forEach { car ->
        car.mileage
        ack += car.mileage
    }
    var totalack=vehicle.count()
    return totalack
