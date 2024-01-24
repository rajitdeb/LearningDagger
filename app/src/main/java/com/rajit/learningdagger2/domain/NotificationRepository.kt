package com.rajit.learningdagger2.domain

import android.util.Log
import javax.inject.Inject

/**
 * It might happen that initially we wanted to send a Welcome Email to newly registered user
 * But, at some point in the future, we got a requirement to also notify them via SMS
 *
 * So, we created a generic NotificationService Interface which is implemented by EmailService & MessageService
 */
interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

/**
 * Called CONSTRUCTOR INJECTION
 * `@Inject constructor` tells Component to create the Class using its Constructor
 */
class EmailService @Inject constructor(): NotificationService {

    override fun send(to: String, from: String, body: String?) {
        Log.i("EmailService", "sendWelcomeEmail: Welcome $to")
    }

}

class MessageService: NotificationService {

    override fun send(to: String, from: String, body: String?) {
        Log.i("MessageService", "sendWelcomeMessage: Welcome $to")
    }

}