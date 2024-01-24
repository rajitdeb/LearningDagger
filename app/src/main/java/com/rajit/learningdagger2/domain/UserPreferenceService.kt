package com.rajit.learningdagger2.domain

import android.util.Log
import javax.inject.Inject

class UserPreferenceService @Inject constructor() {

    fun savePreference(key: String, value: String) {
        Log.i("UserPreferenceService", "savePreference: $key: $value")
    }

}