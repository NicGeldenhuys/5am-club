package com.etienne.the5amclub

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockedConstruction
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
internal class ValidateTest {
    @Mock
    private lateinit var mockContext: MockedConstruction.Context

    @Test
    fun validateEmail() {
        assertEquals(true, validateEmail("ryankok@gmail.com"))
        assertEquals(false, validateEmail("ryankokgmail.com"))
        assertEquals(true, validateEmail("sebastian@hotmail.com"))

    }

    @Test
    fun validatePassword() {
        assertEquals(true, validatePassword("hellothere"))
        assertEquals(false, validatePassword("hello there"))
        assertEquals(false, validatePassword(""))
    }

    fun validatePassword(password: String): Boolean {
        if (password.isNotBlank()) {
            if (!password.contains(" ")) {
                return true
            }
        }

        return false
    }

    fun validateEmail(email: String): Boolean {
        if (email.isNotBlank()) {
            if (!email.contains(" ")) {
                if (email.contains("@")) {
                    if (email.contains(".")) {
                        return true
                    }
                }
            }
        }


        return false
    }
}