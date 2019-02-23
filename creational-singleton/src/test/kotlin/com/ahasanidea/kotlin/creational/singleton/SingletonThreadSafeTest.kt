package com.ahasanidea.kotlin.creational.singleton

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class SingletonThreadSafeTest {

    @Test
    fun `get name`() {
        //arrange
        val singleton=SingletonThreadSafe.getInstance(name = "Ahasan")
        //act
        val message=singleton.getName()
        //assert
        Assert.assertEquals("My name is Ahasan",message)
    }
}