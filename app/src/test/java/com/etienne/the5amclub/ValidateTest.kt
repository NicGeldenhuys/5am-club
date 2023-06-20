package com.etienne.the5amclub

import org.junit.Assert.assertEquals
import org.junit.Test

internal class ValidateTest {
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