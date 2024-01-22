package com.rajit.learningdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rajit.learningdagger2.di.DaggerUserRegistrationComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get UserRegistrationService reference from Dagger
        val userRegistrationComponent = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = userRegistrationComponent.getUserRegistrationService()

        // Accessing the registerUser function in UserRegistrationService class
        userRegistrationService.registerUser("someone@example.com", "123")

    }

}