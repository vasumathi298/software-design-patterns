# software-design-patterns

# Creational Pattern

## Singleton Pattern

This pattern is used when we need to ensure that only object of a particular class needs to be created. All further references to that object are referred to the same underlying instance created.

### Advantage of Singleton
- controls concurrent access to resources.
- Ensures there is only one object available across the application in controlled state.

### Implementation guidelines
- Ensure that only one instance of the class exists.
- Provide global access to that instance by
    + Declaring all constructor of that class to be private.
    + Providing static method that returns a reference to the instance.
    + Instance is stored as private static variable
