# Flight Reservation Application

Welcome to the Flight Reservation Application repository! This project is developed using the Java Spring Boot framework with a Monolithic architecture. It aims to provide a comprehensive solution for managing flight reservations, user information, and related functionalities.

## Technology Stack

- Programming Language: Java
- Framework: Spring Boot
- Architecture: Monolithic
- Databases: MySQL & MongoDB

## Modules

### Flight Management
- Manages the list of flights, including schedules, available seats, and pricing.
- Handles flight routes, destinations, and associated rules or restrictions.

### User Profiles
- Manages user information, including profiles, preferences, and historical flight data.
- Provides functionalities for user authentication and authorization.

### Reservation Booking
- Allows users to search for flights based on criteria such as date, destination, and preferred class.
- Facilitates the booking of flight reservations, including seat selection and optional add-ons.

### Payment Processing
- Integrates a payment gateway for secure and seamless transaction processing.
- Supports various payment methods and ensures the confidentiality of user financial information.

## Application Health Check Mechanism

The application implements a health check mechanism using Spring Boot Actuator. Actuator provides insights into the Spring environment with functions for health checking and metrics gathering. The health check endpoint is exposed over HTTP and JMX.

## Monitoring and Observability

Monitoring and observability are achieved by capturing useful health metrics from Spring Boot applications. These metrics are integrated with popular monitoring tools to predict system health by observing anomalies in metrics like memory utilization, errors, and disk space.

## Future Modules

### Baggage Management
- Introduces a module to manage and track passenger baggage.
- Includes features for users to specify and purchase additional baggage allowances during the reservation process.
- Enables tracking of baggage status and provides notifications for any issues or delays.

### Flight Notifications
- Implements a notification system to keep users informed about flight status, delays, gate changes, and other important updates.
- Utilizes email, SMS, or in-app notifications for timely communication.

### Travel Insurance Integration
- Integrates a module for users to purchase travel insurance during the reservation process.
- Provides details on coverage options, policies, and claim procedures.

### Weather Integration
- Integrates real-time weather updates for departure and arrival locations.
- Provides users with weather forecasts to help them plan their travel more effectively.

## Conclusion

The Flight Reservation Application is a robust solution with modules covering Flight Management, User Profiles, Reservation Booking, Payment Processing, Flight Reviews, and Flight Ratings. The incorporation of Spring Boot Actuator ensures health check mechanisms, making the application observable and monitorable. The envisioned future modules aim to further enrich the application's functionality and enhance the overall user experience.


