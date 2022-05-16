# Mock weather Application

This short free form project is using Java spring and is to simulate querying a 
collection of weather data collected by some mock weather sensors

## Technologies 
* [Java Springboot](https://spring.io/projects/spring-boot)
* [MongoDB](https://www.mongodb.com/)
* [Postman](https://www.postman.com/)
* [Studio 3T](https://studio3t.com/)


## Instructions on how to run code

pre-requisites
 * [MongoDB](https://www.mongodb.com/) configured and installed locally
 * [Postman](https://www.postman.com/) configured and installed  
 * [Studio 3T](https://studio3t.com/) configured and installed 


How to run 
1. Download Source code from GitHub
2. Open Source code in IDE (IntelliJ, Eclipse etc)
3. Open Command terminal and run the following command if MongoDB is
configured in your PATH environment variables
    ```
   mongod
   ```
4. If MongoDB is not configured locally, then navigate to the /bin
folder where MongoDB is installed, right click and open command prompt
and then enter command 
    ```
    mongod
    ```
5. Connect Postman to the running database instance
6. Use Postman to access the APIs

## To update the collection
1. Navigate to */src/main/resources*
2. Inside application.properties, update to the collection you wish to use

## To run the API's 
1. Open Postman and configure connection
2. Create Requests for Each API
3. Run API by passing api path to postman, specifying additional arguments if needed
