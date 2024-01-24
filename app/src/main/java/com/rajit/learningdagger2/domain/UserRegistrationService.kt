package com.rajit.learningdagger2.domain

import javax.inject.Inject

/**
 * Called CONSTRUCTOR INJECTION
 * `@Inject constructor` tells Component to create the Class using its Constructor
 */
class UserRegistrationService @Inject constructor(
    private val userService: UserService,
    private val notificationService: NotificationService // UserRegistrationService doesn't need to know about the actual implementation
) {

    fun registerUser(email: String, password: String) {
        userService.saveUserToDB(email, password)
        notificationService.send(email, "no-reply@example.com", email)
    }

}