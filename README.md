# Sleuth Sammies

* **Purpose**
    * To demonstrate database interactions using `JPA` and minimal `Spring`
* **Description**
    * Use the `MainApplication` to serve the webserver on `localhost:8080`.
    * If `8080` is unavailable because it is occupied by another application, _kill_ the application on the port by following the instructions below.
        1. Navigate to the root directory of this project
        2. Execute the command below to ensure the `kill-port.sh` file has _executable privileges_.
           * `chmod u+x`
        3. Execute the command below to kill the application running on `localhost:8080`
            * `./kill-port.sh 8080`





## How to Download

### Part 1 - Forking the Project
* To _fork_ the project, click the `Fork` button located at the top right of the project.


### Part 2 - Navigating to _forked_ Repository
* Navigate to your github profile to find the _newly forked repository_.
* Copy the URL of the project to the clipboard.

### Part 3 - Cloning _forked_ repository
* Clone the repository from **your account** into the `~/dev` directory.
    * if you do not have a `~/dev` directory, make one by executing the following command:
        * `mkdir ~/dev`
    * navigate to the `~/dev` directory by executing the following command:
        * `cd ~/dev`
    * clone the project by executing the following command:
        * `git clone https://github.com/MYUSERNAME/NAMEOFPROJECT`

### Part 4 - Check Build
* Ensure that the tests run upon opening the project.
    * You should see `Tests Failed: ${number-of-tests} of ${number-of-tests} tests`
* Execute the command below to run `JUnit` tests from the command line.
    * `mvn package -Dmaven.test.failure.ignore=true`







## How to Submit

### Part 1 -  _Pushing_ local changes to remote repository
* from a _terminal_ navigate to the root directory of the _cloned_ project.
* from the root directory of the project, execute the following commands:
    * add all changes
        * `git add .`
    * commit changes to be pushed
        * `git commit -m 'I have added changes'`
    * push changes to your repository
        * `git push -u origin main`

### Part 2 - Submitting assignment
* from the browser, navigate to the _forked_ project from **your** github account.
* click the `Pull Requests` tab.
* select `New Pull Request`