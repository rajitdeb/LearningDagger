package com.rajit.learningdagger2.domain

import android.util.Log
import javax.inject.Inject

/**
 * Called CONSTRUCTOR INJECTION
 * `@Inject constructor` tells Component to create the Class using its Constructor
 */
class EmailService @Inject constructor() {

    fun sendWelcomeEmail(email: String) {
        Log.i("EmailService", "sendWelcomeEmail: Welcome $email")
    }

}