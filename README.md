## Todo App Backend
--------------------

This is a simple Todo application backend with CRUD operations on Tasks.


## API Endpoints
-----------------

- create task - `/task/`
- get task - `/task/{id}`
- get all tasks - `/task/`
- update task to done - `/task/{id}/done`
- delete task - `/task/{id}`


## Steps to use
----------------

- Clone the project
- Set up db. 
    - Method 1: Set up your own db and make chages in the project in `./src/main/java/resources/application.yaml`.
    - Method 2: Create a db with user `jpauser`, password `jpauser` and dbname `springboot`.
- Run the project at `http://localhost.com:4141`
