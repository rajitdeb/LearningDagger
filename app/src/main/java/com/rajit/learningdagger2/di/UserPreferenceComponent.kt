package com.rajit.learningdagger2.di

import com.rajit.learningdagger2.MainActivity
import dagger.Component

@Component
interface UserPreferenceComponent {

    fun inject(mainActivity: MainActivity)

}