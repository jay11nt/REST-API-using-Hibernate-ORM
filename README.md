# REST-API-using-Hibernate-ORM
🔸 using Hibernate ORM with mapping annotaion and also no getter setter to reduce Boilerplate code

  **Step 1 -**
  
    To set up the Spring Boot project, add the dependencies in your pom.xml file

  **Step 2 -**
  
     Define two entities (Hyundai and Kia) with bidirectional @OneToOne relationship using Hibernate annotations.

  **Step 3 -**
  
     Create repository interfaces for CRUD operations on Hyundai and Kia
  
  **Step 4 -**
  
     Implement business logic in the service layer for creating entities with relationships.

  **Step 5 -**

     Create a REST controller to handle incoming HTTP requests for creating entities and returning JSON responses.

  **Step 6 -**

     Configure the in-memory H2 database and Hibernate settings for development in application.properties.

  **Step 7 -**

     run the Spring Boot application and test the API endpoints.

### **Testing API Endpoints**

   1. POST  /api/cars/createHyundaiWithKia
     

   **Request Body:**
     
   ```
          {
          "modelName": "Hyundai Sonata"
          }
          {
            "modelName": "Kia Optima"
          }
   ```
   **Response Body:**

   ```
         {
          "id": 1,
          "modelName": "Hyundai Sonata",
           "kia": {
                   "id": 1,
                   "modelName": "Kia Optima"
                  }
         }

   ```

  2. POST  /api/cars/createKiaWithHyundai

  **Request Body:**

  ```
          {
            "modelName": "Kia Optima"
          }  
          {
            "modelName": "Hyundai Sonata"
          }

  ```

**Response Body:**

  ```
           {
             "id": 1,
             "modelName": "Kia Optima",
             "hyundai": {
                         "id": 1,
                         "modelName": "Hyundai Sonata"
                        }
           }
  ```


- The project uses an in-memory H2 database for testing, and you can easily extend it with other features such as validation, error handling, etc.
