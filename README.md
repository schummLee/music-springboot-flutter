# To-Do List

## Project Structure

- [ ] Create the following packages:
  - [ ] `do_api.model`: Contains the model classes that represent the data in your application.
  - [ ] `do_api.repository`: Contains the repository interfaces that provide methods for accessing and manipulating data in the database.
  - [ ] `do_api.service`: Contains the service classes that implement the business logic of your application.
  - [ ] `do_api.controller`: Contains the controller classes that handle incoming HTTP requests and delegate to the service layer.
  - [ ] `do_api.bussiness`: Contains the classes that define the API of your application.

## Business Layer

- [ ] Define class names in the service layer and pass them to the controller layer:
  - [ ] `UserService`: Provides methods for managing users.
  - [ ] `SongService`: Provides methods for managing songs.
  - [ ] `AlbumService`: Provides methods for managing albums.
  - [ ] `SingerService`: Provides methods for managing singers.

## Exception Handling

- [ ] Implement a global exception handler:
  - [ ] Create a class named `GlobalExceptionHandler` in the `to_do_api.controller` package.
  - [ ] Annotate the class with `@ControllerAdvice` to indicate that it is a global exception handler.
  - [ ] Add methods to the class annotated with `@ExceptionHandler` to handle specific exceptions.
