package POO

import java.lang.Exception

fun main(){

    var myDog = Dog("Doggy", 10, 32.6)

    println("My dog's name is ${myDog.name}. He is ${myDog.age} years old and weights ${myDog.weight} kilograms.")

    var realMadrid = FootballTeam("Real Madrid");
    println(realMadrid)
    var barcelona = FootballTeam("FC Barcelona", 1914)
    println(barcelona)

    createFootballPlayers()

    var sum = Calculator.sum(5,5);
    var sumDouble = Calculator.sum(4.toDouble(),5.5);
    println("Sum: ${sum.toDouble()}\nSum: ${sumDouble}")
    try{
        print(Calculator.division(5.toDouble(),0.toDouble()))
    }catch (e: Exception){
        println(e.toString())
    }

}

fun createFootballPlayers() {
    var lukaModric = FootballPlayer("Luka Modric", 35)
    println(lukaModric)
    var lionelMessi = FootballPlayer("Lionel Messi", 35, "Striker")
    println(lionelMessi)
}

/**
 * How to define a class in Kotlin
 *
 * */

//The quick constructor way (primary constructor)

class Dog (var  name: String, var age: Int, var weight: Double) {

}

//secondary Constructor
class FootballTeam(var name: String, var foundationYear: Int) {
    constructor(name:String) : this(name, 1900)
    override fun toString(): String {
        return "FootballTeam(name='$name', foundationYear=$foundationYear)"
    }

}

//default values in constructor
class FootballPlayer (var name:String, var age: Int, var position: String = "Midfielder"){
    override fun toString(): String {
        return "FootballPlayer(name='$name', age=$age, position='$position')"
    }

}

//static attributes and methods in classes
class Calculator {
    companion object {

        enum class BasicTypes {
            SUM, SUBSTRACTION, MULTIPLICATION, DIVISION
        }
        //method overload
        fun sum(a: Int, b: Int): Int{
            return a + b;
        }

        fun sum(a:Double, b: Double): Double {
            return a + b;
        }

        fun substract(a: Int, b: Int): Int{
            return a - b;
        }

        fun substract(a:Double, b: Double): Double {
            return a - b;
        }
        fun multiply(a:Double, b:Double): Double = a * b
        fun division(a:Double, b:Double) : Double{
            if(b ==  0.0){
                throw Exception("Cannot divide by 0")
            }
            return a / b ;
        }

    }
}

