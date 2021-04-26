# user_manager_server

> Simple user database server using Spring and JPA.

## Technologies and libraries and tools
* **Java 1.8**
* **InteliJ**
* **Java Persistence API**
* **Spring**

## Features
* Database made on local PostgreSQL server
* JPA based repository and service
* Simple REST api

## Some of REST api endpoints

| Method  |       URL                    |  Request body                          | Response body | Comment
| ------------- | ------------- | ------------- | ------------- | ------------- | 
| POST    |      /users/add  |{ "email": "eduardfranz@gmail.com", "imageUrl": "https://randomuser.me/api/portraits/men/35.jpg", "jobTitle": "HR", "name": "Eduard Franz", "phone": "123123123" } | None          | Add new user
| GET    |      /users/all  |None | [ { "id": 1, "name": "Leo Gill", "email": "leogill@gmail.com", "jobTitle": "JS developer", "phone": "123123123", "imageUrl": "https://randomuser.me/api/portraits/men/32.jpg" },...| Get all users from database
| DELETE    |      /users/delete/3  |login, password | None          |Deletes an account|

 



