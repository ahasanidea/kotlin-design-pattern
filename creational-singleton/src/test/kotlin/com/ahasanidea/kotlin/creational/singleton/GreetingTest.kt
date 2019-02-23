package com.ahasanidea.kotlin.creational.singleton

import org.junit.Assert
import org.junit.Test

class GreetingTest {

    @Test
    fun `get greeting`() {
        //setup,given,arrange
        val greeting=Greeting()
        //exersise, when ,act
        val message=greeting.greet()
        //verify,then,assert
        Assert.assertEquals("Ahasan",message)
        Assert.assertTrue("Ahasan",true)
    }

    @Test
    fun `get another greet`() {
        //setup,given,arrange
        val greeting=Greeting()
        //exersise, when ,act
        val message=greeting.getAnotherGreet()
        //verify, then,assert
        Assert.assertEquals("Good Morning Ahasan",message)
        Assert.assertTrue("Good Morning Ahasan",true)

    }
}