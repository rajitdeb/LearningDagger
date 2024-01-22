# LearningDagger2
This repository is primarily focussed on learning about Dagger 2 in a simplistic manner by
implementing dagger in sample project

## Dagger Implementation
### 1. Installing Dependencies
Add the following code in the app-level build.gradle file:
```kotlin
// Dagger 2
implementation("com.google.dagger:dagger:2.50")
kapt("com.google.dagger:dagger-compiler:2.50")
```
For enabling Kapt (if not already enabled):
```kotlin
// App-level build.gradle
plugins {
    ...
    id("org.jetbrains.kotlin.kapt")
}
```
```kotlin
// Project-level build.gradle
plugins {
    ...
    id("org.jetbrains.kotlin.kapt") version "1.9.10" apply false
}
```

### 2. Create a Component
For creating a Component of Dagger, we make use of `@Component` annotation:
```kotlin
@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

}
```

### 3. Using Constructor Injection
For doing constructor injection, we make use of `@Inject constructor` keyword in order to make Dagger understand how to create the instance of the class:
```kotlin
class UserRegistrationService @Inject constructor(
    private val userService: UserService,
    private val emailService: EmailService
) {
    ...
}
```

### Using the Component
For using the created dagger component, we need to create an instance of the component interface:
```kotlin
// Get UserRegistrationService reference from Dagger
val userRegistrationComponent = DaggerUserRegistrationComponent.builder().build()
val userRegistrationService = userRegistrationComponent.getUserRegistrationService()

// Accessing the registerUser function in UserRegistrationService class
userRegistrationService.registerUser("someone@example.com", "123")
```