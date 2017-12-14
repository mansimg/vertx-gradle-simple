# Vert.x 3.1 Simplest Gradle Project

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f2a69b0569704402b8341aa18979a79b)](https://www.codacy.com/app/tegenton/vertx-gradle-simple?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=tegenton/vertx-gradle-simple&amp;utm_campaign=Badge_Grade)

This is simple Hello World Vert.x 3.1 project using the Gradle build system. It initializes a simple HTTP server which
simply returns "Hello World!" with every request.

In this example, Vert.x is used in an embedded fashion. It uses Vert.x APIs directly in its classes rather than
deploying code in verticles.

## Setting up the project

1. *Fork* this git repository ![](https://image.ibb.co/nwDFum/fork.png) and *clone* the fork to a local directory [(Reference)](https://guides.github.com/introduction/git-handbook)
![](https://image.ibb.co/gsvyfR/clone.png)

2. Download Vert.x from http://vertx.io/
3. Now, the file that we had downloaded, vertx.x-3.5.0-full, we will insert it into the vertx-gradle-simple folder.

###### If not using an IDE, skip steps 3 and 4

3. If you prefer using an IDE, install [IntelliJ IDEA](https://www.jetbrains.com/idea) or another preferred IDE
4. Import the cloned repository into your IDE
5. [Download Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) for your OS and install.
6. We have to install an IDE that will serve as the code's executor. 
There are several IDEs that you can use:

·IntelliJ IDEA

·Eclipse

·And any IDE that can run JAVA code

7. Configure intelliJ project defaults, project structure, to set the project SDK to java version 1.8


## Running the app

##### If using an IDE like IntelliJ IDEA(1), Eclipse(2)
###### IntelliJ IDEA
1. Right click on the vertx at the top of the code and use the suggested help from intelliJ to link it to the project
2. Right click the **HelloWorldEmbedded** class
3. Click **Run as...**

###### Eclipse
1. We go to run → run configuration.    
2. Create a new Java Aplication called vertx-gradle-simple project. 
3. Then we browse the project, vertx-gradle-simple inside the Github folder. 
4. We choose a main class that is called io.vertx.core.Launcher, and we activate this one.  
5. On the project arguments we write “run io.vertx.example.HelloWorldEmbedded” ← or the name that you have putted on your file .java , and finally we press run.

###### Alternatively,

Directly run the application using the gradle plugin with **./gradlew run**

## Viewing the app after running it

It will run at port 8080, but if it doesen’t work or it shows Failed to listen on port 8080 change the port at 8000 (orthe port you want).
Visit **http://localhost:(port)** on your browser


## Contributing to the project

1. Fork the project on a local device.
2. Make your intended changes on your locally cloned repository
3. add a new branch with a meaningful name indicating your change (i.e. Add-Unit-Tests).
4. *Commit* the changes and *push* the commit to your forked repository on GitHub
5. Ensure the changes on the commit pushed to your GitHub fork are correct.
6. Create a *pull request* requesting to merge the commits on your fork to this repository [(Reference)](https://guides.github.com/introduction/flow)
7. Write a concise and convincing pull request message explaining the purpose of your commits!

