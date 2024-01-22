package com.rajit.learningdagger2.di

import com.rajit.learningdagger2.domain.UserRegistrationService
import dagger.Component

/**
 * `@Component` in Dagger, used to provide dependencies required by the Consumer
 * Basically, Consumer asks the component to provide the dependencies
 * And Consumer looks for the constructors and modules which it can provide
 */
@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

}