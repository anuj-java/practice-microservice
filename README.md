## Sample Application demo for Spring Boot , Docker. It represents various OO principles like SOLID and GRASP

## Pre-requisites:
1. Install Docker on your machine
2. Install Gradle
3. Optional: If your ide does not have support for Gradle add gradle plugin from market place and restart ide.

## Steps to install and run the application
1. Clone the repository (git clone https://github.com/akothiyal-deloitte/home-office.git)
2. Change directory to practice-microservice on terminal and run command "gradle clean build buildDocker". This should create docker images locally. Check by using command- "docker images"
## if using docker to manage containers
3. execute command "docker-compose up" (check processes are running by command "docker ps" )
4. Hit the url http://localhost:8780/customer/1, to test if application is working.
5. To terminate the application use "docker-compose down" command from another terminal tab.


## TODO
1. 