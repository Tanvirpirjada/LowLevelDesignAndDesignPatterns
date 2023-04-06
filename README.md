# Car Service Station Billing System

* This is a billing system software for a car service station, implemented using the Object-Oriented Design Pattern.

## Features:

* Caters to different types of cars – Hatchback, Sedan, SUV.

* Provides different types of services like Basic Service, Engine Fixing, Clutch Fixing, Gear Fixing and Brake Fixing.

* Each service has a service name associated with it and different prices for different types of cars.

* Generates a detailed bill with the total amount for each service request based on the Type of Car specified and the requested Service name.

* Provides a complimentary cleaning if the total service bill is more than ₹ 10000.

## Screenshots

![Screenshot (111)](https://user-images.githubusercontent.com/111841729/230317112-c2a3dd3c-9ca4-4011-9e4f-7b95fb6cd280.png)
![Screenshot (112)](https://user-images.githubusercontent.com/111841729/230317147-9db08b46-4a08-4f1d-b403-de08994724da.png)
![Screenshot (113)](https://user-images.githubusercontent.com/111841729/230317188-abdeda72-f882-42d2-b09e-e91c5b7c2988.png)
![Screenshot (114)](https://user-images.githubusercontent.com/111841729/230317212-a3426762-34e6-4f17-abd5-3b7a8edcc5aa.png)
![Screenshot (115)](https://user-images.githubusercontent.com/111841729/230317240-ee73407b-2a62-4520-9c3b-c106545592d2.png)
![Screenshot (116)](https://user-images.githubusercontent.com/111841729/230317262-0e0b2280-bb88-483e-9de3-8aa99e48ce8c.png)

## OOPs Concepts demonstrated

The following OOPs concepts are demonstrated in this program:

* Abstraction: The program uses abstraction to model the different types of services as interfaces. This allows the program to represent the essential characteristics of services without getting into the details of  implementation.

* Polymorphism: The program uses polymorphism to allow the program to treat different types of cars and services in a uniform way, regardless of their specific implementations. This allows the program to handle different types of cars and services without having to write separate code for each type.

* Encapsulation: The program uses encapsulation to hide the internal details of the car and service implementations and expose only the essential methods and properties to the outside world. This allows the program to ensure that the car and service data is accessed and modified only through a well-defined interface, and prevents unwanted modifications that can lead to errors.


## How to Use:

* Clone the repository or download the ZIP file.
* Open the project in an IDE of your choice.
* Navigate to the src folder and run the Main class.
* Enter the type of car and service Name for which you want to generate the bill.
* The software will generate a detailed bill with the total amount for each service request.
* If the total service bill is more than ₹ 10000, a complimentary cleaning will be provided and specified in the bill.


## Design Pattern Used:

The Decorator Design Pattern is used to implement this software. The different car types and services are treated as components, and the decorators add additional functionalities to them.

## Files Included:

* CarType.Java ->Enums for each cartypes(//instaed of creating class for car we create enums)

* IService.java - Interface for different types of services

* BasicService.java - Concrete implementation of Basic Service

* EngineFixing.java - Concrete implementation of Engine Fixing Service

* ClutchFixing.java - Concrete implementation of Clutch Fixing Service

* GearFixing.java - Concrete implementation of Gear Fixing Service

* BrakeFixing.java - Concrete implementation of Brake Fixing Service

* ServiceProvider - manage Services accordingly to the input 
 
* Main.java - Main class to run the software
