package com.rajit.learningdagger2.domain

import javax.inject.Inject

/**
 * Called CONSTRUCTOR INJECTION
 * `@Inject constructor` tells Component to create the Class using its Constructor
 */
class UserRegistrationService @Inject constructor(
    private val userService: UserService,
    private val emailService: EmailService
) {

    /**
     * This is field injection, but Dagger only supports public fields for Field Injection
     */
//    @Inject
//    lateinit var emailService: EmailService

    fun registerUser(email: String, password: String) {
        userService.saveUserToDB(email, password)
        emailService.sendWelcomeEmail(email)
    }

}