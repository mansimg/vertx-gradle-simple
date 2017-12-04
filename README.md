# Vert.x 3.1 Simplest Gradle Project

This is simple Hello World Vert.x 3.1 project using the Gradle build system. It initializes a simple HTTP server which
simply returns "Hello World!" with every request.

In this example, Vert.x is used in an embedded fashion. It uses Vert.x APIs directly in its classes rather than
deploying code in verticles.



## Setting up the project

1. *Fork* this git repository and *clone* the fork to a local directory [(Reference)](https://guides.github.com/introduction/git-handbook)
2. Download Vert.x from http://vertx.io/

###### If not using an IDE, skip steps 3 and 4

3. If you prefer using an IDE, install [IntelliJ IDEA](https://www.jetbrains.com/idea) or another preferred IDE
4. Import the cloned repository into your IDE
5. [Download Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (as JDK 9 won't work) for your OS and install.

6. Configure intelliJ project defaults, project structure, to set the project SDK to java version 1.8


## Running the app

###### If using an IDE like IntelliJ IDEA,

1. Right click on the vertx at the top of the code and use the suggested help from intelliJ to link it to the project
2. Right click the **HelloWorldEmbedded** class
3. Click **Run as...**

###### Alternatively,

Directly run the application using the gradle plugin with **./gradlew run**



## Viewing the app after running it

Visit **http://localhost:8080** on your browser



## Contributing to the project

1. Make your intended changes on your locally cloned repository
2. add a new branch with a meaningful name indicating your change (i.e. Add-Unit-Tests).
2. *Commit* the changes and *push* the commit to your forked repository on GitHub
3. Ensure the changes on the commit pushed to your GitHub fork are correct.
4. Create a *pull request* requesting to merge the commits on your fork to this repository [(Reference)](https://guides.github.com/introduction/flow)
5. Write a concise and convincing pull request message explaining the purpose of your commits!
