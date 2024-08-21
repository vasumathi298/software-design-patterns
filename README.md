# Software Design Patterns

## Creational Pattern

### Singleton Pattern

The Singleton Pattern ensures that only one instance of a particular class is created. All further references to that object point to the same underlying instance. This pattern is particularly useful when a single instance of a class must control access to resources or maintain a consistent state across the application.

#### Advantages of Singleton
- **Controls concurrent access to resources:** Singleton ensures that shared resources are managed in a controlled manner, preventing conflicts and ensuring consistency.
- **Ensures a single object across the application:** The Singleton pattern guarantees that only one object is available and used throughout the application, maintaining a controlled state.

#### Implementation Guidelines
To implement the Singleton pattern correctly, follow these guidelines:
- **Ensure only one instance exists:** The Singleton class should restrict instantiation to a single object.
- **Provide global access to the instance:**
  - **Private Constructors:** All constructors in the class should be private, preventing direct instantiation from outside the class.
  - **Static Method for Instance Access:** Provide a static method that returns a reference to the single instance of the class.
  - **Static Variable for Instance Storage:** Store the instance as a private static variable within the class.

#### Types of Singleton Implementations

1. **Eager Initialization**
  - **Description:** The instance of the Singleton class is created at the time of class loading. This approach is simple and thread-safe because the instance is created before any threads access it.
  - **Advantages:** Guarantees that the instance is created when the class is loaded, ensuring thread safety.
  - **Disadvantages:** If the instance is not used, it wastes memory and resources since the instance is created regardless of whether it is needed.

2. **Lazy Initialization**
  - **Description:** The instance of the Singleton class is created only when it is first needed. This approach delays the creation of the instance until it is requested for the first time.
  - **Advantages:** Saves resources by creating the instance only when necessary.
  - **Disadvantages:** Not thread-safe unless additional synchronization is used, which can lead to potential issues in a multi-threaded environment.

3. **Thread-Safe Singleton (Synchronized Method)**
  - **Description:** Uses synchronization in the method that provides access to the Singleton instance. This ensures that only one thread can access the method at a time, making the instance creation thread-safe.
  - **Advantages:** Ensures thread safety by preventing multiple threads from creating multiple instances.
  - **Disadvantages:** Synchronization can lead to performance overhead and reduced efficiency.

4. **Double-Checked Locking**
  - **Description:** Combines lazy initialization with double-checked locking to improve performance. It checks if an instance is already created before entering a synchronized block, reducing the overhead of synchronization.
  - **Advantages:** Provides a balance between lazy initialization and thread safety, improving performance.
  - **Disadvantages:** Can be complex to implement correctly and may still suffer from subtle concurrency issues if not implemented properly.

5. **Bill Pugh Singleton (Inner Static Helper Class)**
  - **Description:** Utilizes a static inner helper class to hold the Singleton instance. The instance is created when the inner class is loaded, ensuring thread safety and lazy initialization.
  - **Advantages:** Provides thread-safe and efficient Singleton implementation without the overhead of synchronization.
  - **Disadvantages:** May be less intuitive for developers unfamiliar with this approach.

6. **Enum Singleton**
  - **Description:** Uses an enum to implement Singleton. The instance is created when the enum is loaded, ensuring thread safety and serialization.
  - **Advantages:** Simplifies the Singleton implementation and handles serialization issues automatically.
  - **Disadvantages:** Limited to being used only with enums, which may not be suitable for all use cases.

7. **Serializable Singleton**
  - **Description:** Implements Singleton with serialization support, ensuring that the instance is maintained across serialization and deserialization.
  - **Advantages:** Ensures that the Singleton instance is preserved during serialization and deserialization processes.
  - **Disadvantages:** Requires careful handling to avoid multiple instances being created during deserialization.
### Factory Method Pattern

The Factory Method Design Pattern is a creational design pattern used to provide an interface for creating objects in a superclass while allowing subclasses to alter the type of objects that will be created. It encapsulates the object creation logic in a separate method, abstracting the instantiation process and promoting loose coupling between the creator and the created objects.

#### Advantages of Factory Method
- **Encapsulates Object Creation:** Simplifies client code and promotes reusability by encapsulating complex object creation logic.
- **Decouples Client Code from Concrete Classes:** Abstracts the instantiation details from client code, making it easier to modify or extend the system.
- **Supports Multiple Product Variations:** Allows flexibility in accommodating different product types and variations.
- **Supports Customization and Configuration:** Encapsulates configuration logic, enabling customization of the creation process.

#### When to Use Factory Method Design Pattern

- **When You Want to Encapsulate Object Creation:** If you have a complex object creation process or if the process may vary based on conditions, encapsulating this logic in a factory method can simplify client code and promote reusability.
- **When You Want to Decouple Client Code from Concrete Classes:** Using the Factory Method Pattern allows you to create objects through an interface or abstract class, abstracting away the specific implementation details of the concrete classes from the client code. This promotes loose coupling and makes it easier to modify or extend the system without impacting existing client code.
- **When You Need to Support Multiple Product Variations:** If your application needs to create different variations of a product or if new types of products may be introduced in the future, the Factory Method Pattern provides a flexible way to accommodate these variations by defining factory methods for each product type.
- **When You Want to Support Customization or Configuration:** Factories can be used to encapsulate configuration logic, allowing clients to customize the creation process by providing parameters or configuration options to the factory method.

#### Implementation Guidelines

To implement the Factory Method Pattern effectively, follow these guidelines:
- **Define an Abstract Creator:** Create an abstract class or interface with a factory method that will be responsible for creating objects.
- **Implement Concrete Creators:** Subclass the abstract creator and implement the factory method to instantiate and return specific product types.
- **Create a Product Interface:** Define an interface or abstract class that specifies the operations that all concrete products must implement.
- **Implement Concrete Products:** Develop concrete classes that implement the product interface and define specific behavior for each product type.

#### Components of Factory Method Design Pattern

1. **Creator:**
   - **Description:** An abstract class or interface that declares the factory method. It may contain other methods that work with the created objects.

2. **Concrete Creator:**
   - **Description:** Subclasses of the Creator that implement the factory method to create specific types of objects.

3. **Product:**
   - **Description:** The interface or abstract class for the objects that the factory method creates. It defines the common interface for all objects.
  
4. **Concrete Product:**
   - **Description:** Classes that implement the Product interface or extend the Product abstract class. They are the actual objects created by the factory method.
  
    
