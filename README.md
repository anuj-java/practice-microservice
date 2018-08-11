## Sample Application demo for Spring Boot , Docker. It represents various OO principles like SOLID and GRASP

## Pre-requisites:
1. Install Docker on your machine
2. Install Gradle (v4 atleast, i am using 4.9)
3. Optional: If your ide does not have support for Gradle add gradle plugin from market place and restart ide.

## Steps to install and run the application
1. Clone the repository (git clone https://github.com/akothiyal-deloitte/home-office.git)
2. Change directory to practice-microservice on terminal and run command "gradle clean build buildDocker". This should create docker images locally. Check by using command- "docker images"
## if using docker to manage containers
3. execute command "docker-compose up" (check processes are running by command "docker ps" )
4. Hit the url http://localhost:8780/customer/1, to test if application is working.
5. To terminate the application use "docker-compose down" command from another terminal tab.

## Test
1. Hit url http://localhost:8780/customer/1 (display all customers)
2. Hit url http://localhost:8780/demo/add?name=riya&email=riya@gmail.com &
            http://localhost:8780/demo/add?name=anuj&email=anuj@gmail.com (Adds to mysql database)
3. Hit url http://localhost:8780/demo/all to display all users added (reads from database)

## TODO
1. 

## Misc commands
1. Log into sql container: 
    docker exec -it demo-mysql bash -l
    mysql -udbuser -pdbp4ss
2. If problems with finding gradle version 4 then - delete the folders .gradle and gradle and the files gradlew and gradlew.bat
3. docker image prune (delete all unattached docker images)
4. Docker caches for optimization and if you have updated database credentials it might not refresh. Safer to run
 following command in that case: 
            docker-compose rm -v
            
## Asssignment
1. Update CustomerService class to remove hardcoding and retrieving information from database
2. Provide an endpoint method to add that information into database.
3. Write unit  test to make sure everything is running fine. For now i have commented 
out the CustomerControllerTest as its an integration test and will require database dependency. 
4. Write integration test.