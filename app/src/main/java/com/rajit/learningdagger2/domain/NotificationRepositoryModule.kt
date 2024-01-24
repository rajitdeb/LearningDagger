package com.rajit.learningdagger2.domain

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class NotificationRepositoryModule {

    // When we are providing the creating logic of the class instance, we use @Provides
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }

}

//@Module
//abstract class NotificationRepositoryModule {
//
//    // When Dagger itself creates the class instance, we use @Binds
//    @Binds
//    abstract fun getEmailService(emailService: EmailService): NotificationService
//
//}