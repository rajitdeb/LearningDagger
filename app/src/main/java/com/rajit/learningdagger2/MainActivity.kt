package com.rajit.learningdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rajit.learningdagger2.di.DaggerUserPreferenceComponent
import com.rajit.learningdagger2.di.DaggerUserRegistrationComponent
import com.rajit.learningdagger2.domain.UserPreferenceService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userPreferenceService: UserPreferenceService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get UserRegistrationService reference from Dagger
        val userRegistrationComponent = DaggerUserRegistrationComponent.builder().build()
        val userPreferenceComponent = DaggerUserPreferenceComponent.builder().build()
        val userRegistrationService = userRegistrationComponent.getUserRegistrationService()

        // using the inject function of the created UserPreferenceComponent
        userPreferenceComponent.inject(this@MainActivity)

        // Accessing the registerUser function in UserRegistrationService class
        userRegistrationService.registerUser("someone@example.com", "123")

        // Accessing the savePreference function in UserPreferenceService class
        userPreferenceService.savePreference("location", "Silchar")

    }

}