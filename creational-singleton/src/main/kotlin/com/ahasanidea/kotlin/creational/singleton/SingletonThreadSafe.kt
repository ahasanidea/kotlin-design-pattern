package com.ahasanidea.kotlin.creational.singleton

class SingletonThreadSafe private constructor(private val name: String) {
    fun getName(): String {
        return "My name is $name"
    }

    companion object {
        @Volatile
        private var instance: SingletonThreadSafe? = null

        fun getInstance(
            name: String
        ): SingletonThreadSafe =
            instance ?: synchronized(this) {
                instance ?: SingletonThreadSafe(name).also { instance = it }
            }


    }


}