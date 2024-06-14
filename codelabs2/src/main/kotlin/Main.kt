//package org.example
//
//fun main() {
//    println(1 == 1)
//}

//fun main() {
    //println(1 < 1)
//}

//fun main() {
//    val trafficLightColor = "Red"
//
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    }
//}

//fun main() {
//    val trafficLightColor = "Red"
//
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    } else {
//        println("Go")
//    }
//}

//fun main() {
//    val trafficLightColor = "Green"
//
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    } else {
//        println("Go")
//    }
//}

//fun main() {
//    val trafficLightColor = "Yellow"
//
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    } else if (trafficLightColor == "Yellow") {
//        println("Slow")
//    } else {
//        println("Go")
//    }
//}

//fun main() {
//    val trafficLightColor = "Black"
//
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    } else if (trafficLightColor == "Yellow") {
//        println("Slow")
//    } else {
//        println("Go")
//    }
//}

//fun main() {
//    val trafficLightColor = "Black"
//
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    } else if (trafficLightColor == "Yellow") {
//        println("Slow")
//    } else if (trafficLightColor == "Green") {
//        println("Go")
//    } else {
//        println("Invalid traffic-light color")
//    }
//
//}

//fun main() {
//    val trafficLightColor = "Yellow"
//
//    when (trafficLightColor) {
//        "Red" -> println("Stop")
//        "Yellow" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")
//    }
//}

//fun main() {
//    val x = 2
//
//    when (x) {
//        2 -> println("Este es el número 2.")
//        3 -> println("x is a prime number between 1 and 10.")
//        5 -> println("x is a prime number between 1 and 10.")
//        7 -> println("x is a prime number between 1 and 10.")
//        else -> println("x isn't a prime number between 1 and 10.")
//    }
//}

//fun main() {
//    val x = 4
//
//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        else -> println("x isn't a prime number between 1 and 10.")
//    }
//}

//fun main() {
//    val trafficLightColor = "Amber"
//
//    when (trafficLightColor) {
//        "Red" -> println("Stop")
//        "Yellow", "Amber" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")
//    }
//}

fun main() {
    val trafficLightColor = "Black"

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)
}
