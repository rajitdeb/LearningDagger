package com.rajit.learningdagger2.domain

import android.util.Log
import javax.inject.Inject

/**
 * Called CONSTRUCTOR INJECTION
 * `@Inject constructor` tells Component to create the Class using its Constructor
 */
class UserService @Inject constructor() {

    fun saveUserToDB(email: String, password: String) {
        Log.i("UserService", "Saved User to DB")
    }

}