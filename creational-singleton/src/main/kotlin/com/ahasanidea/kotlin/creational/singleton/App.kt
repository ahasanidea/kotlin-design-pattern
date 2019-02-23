package com.ahasanidea.kotlin.creational.singleton

fun main(){
    println(Singleton.getMessage())
    for (i in 1..3)
    {
        println(CounterSingleton.increment())
    }

   println(SomeObject.someFunction())
   print(SingletonThreadSafe.getInstance("Ahasan").getName())
}