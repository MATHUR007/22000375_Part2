Parcel Collection System - README
Welcome to the Parcel Collection System! This application is designed to streamline the management of parcels and customers, making it easier for users to load data, process customer requests, and calculate fees associated with parcel deliveries. This README will guide you through the features, architecture, and usage of the system.
Overview
The Parcel Collection System is built using Java and follows the Model-View-Controller (MVC) architectural pattern. This design choice ensures a clear separation of concerns, making the application modular, maintainable, and scalable. The system consists of several key components:
Model: This layer handles the core data and business logic. It includes classes like Customer, Parcel, QueueOfCustomers, and ParcelMap, which manage customer and parcel information.
View: The graphical user interface (GUI) is represented by the ParcelView class. It displays customer data, parcel details, and fee information, providing an intuitive experience for users.
Controller: The Manager class acts as the intermediary between the Model and View. It processes user interactions, loads data from files, and updates the View accordingly.
Features
Load Customer and Parcel Data: Users can load customer and parcel information from CSV files. The application reads the data and populates the respective queues and maps.
Process Customers: The system allows users to process customers in the queue, calculating fees based on parcel details. The results are displayed in the GUI for easy reference.
Logging: The application includes a logging mechanism to track events and errors, ensuring that users are informed of any issues that arise during operation.
Getting Started
To run the Parcel Collection System, follow these steps:
Prerequisites: Ensure you have Java Development Kit (JDK) installed on your machine. You can download it from the official Oracle website.
Clone the Repository: Download the source code from the repository.
Compile the Code: Navigate to the project directory in your terminal and compile the Java files using the command:
bash


javac *.java
Run the Application: Execute the main class to start the application:
bash


java Manager
Usage
Once the application is running, you will see the main interface with three sections: Customers, Parcels, and Fees.
Loading Data: Click the "Load Data" button to import customer and parcel information from the specified CSV files (e.g., Custs.csv and Parcels.csv).
Processing Customers: After loading the data, click the "Process Customers" button to calculate fees for each customer based on their associated parcels. The results will be displayed in the Fees section.
Conclusion
The Parcel Collection System is designed to simplify the management of parcels and customer interactions. By leveraging the MVC architecture and implementing a Singleton pattern for logging, the application is both robust and user-friendly. We hope this system meets your needs and enhances your parcel management experience. If you have any questions or feedback, please feel free to reach out!
Thank you for using the Parcel Collection System! Happy parcel processing
