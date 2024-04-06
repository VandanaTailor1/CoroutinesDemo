**Clean Architecture MVVM Project with Kotlin, Coroutines, and Hilt**

This is a simple Android application built using Clean Architecture principles along with MVVM (Model-View-ViewModel) pattern. It utilizes Kotlin programming language, Coroutines for asynchronous programming, and Hilt for dependency injection.

**Features**

Implements Clean Architecture principles for better separation of concerns.
Utilizes MVVM architecture pattern for improved maintainability and testability.
Uses Coroutines for asynchronous programming, making network requests and database operations.
Implements Hilt for dependency injection, providing a clean and simple way to manage dependencies.

**Architecture Components**

**Presentation Layer**

MainActivity: Handles UI interactions and displays the API response in a toast message.
MainViewModel: Holds the presentation logic and interacts with the domain layer to fetch data.

**Domain Layer**

UseCase: Implements business logic for fetching data from the repository.
Model: Defines entities or models representing the data used in the application.
Repository: Provides an interface for data operations.

**Data Layer**

DataSource: Implements data operations, such as fetching data from a remote API.
RepositoryImpl: Implements the repository interface, interacting with the data source to fetch data.
