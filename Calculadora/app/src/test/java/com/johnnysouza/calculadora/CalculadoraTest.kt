package com.johnnysouza.calculadora

import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Test

class CalculadoraTest {
private val testCalcular: Calcular = Calcular()
    @Test
    fun testSum() {
        val expected = 20F
        assertEquals(expected, testCalcular.sum(10F,10F))
    }

    @Test
    fun `test when float returns 4,5` () {
        val expected = 4.5F
        Assert.assertEquals(expected, testCalcular.sum(4F, 0.5F))
    }
}


