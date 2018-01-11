# Vert.x 3.1 Simplest Gradle Project

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f2a69b0569704402b8341aa18979a79b)](https://www.codacy.com/app/jboss-outreach/vertx-gradle-simple?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=tegenton/vertx-gradle-simple&amp;utm_campaign=Badge_Grade)
[![Build Status](https://travis-ci.org/jboss-outreach/vertx-gradle-simple.svg?branch=master)](https://travis-ci.org/jboss-outreach/vertx-gradle-simple)

## What is Vert.x-Gradle-Simple

 Vert.x-Gradle-Simple is a Hello World [Vert.x 3.1](http://vertx.io/) project using the [Gradle](https://gradle.org/) build system. It initializes a simple HTTP server which simply returns "Hello World!" with every request given to it.

 In this example, Vert.x is used in an embedded fashion. It uses Vert.x APIs directly in its classes rather than
 deploying code in verticles.


## Setting up the project

* Download [Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) for your Operating System!
* Make sure you have declared the `JAVA_HOME` environment variable to the directory where JDK was installed. 
* Fork the repository by clicking on the *Fork* icon at the top right corner of this page.
* Clone the repository to your local machine by running the following commands on git:


            ```$ git clone https://github.com/[YOUR-USERNAME]/vertx-gradle-simple```
* If you need help, refer [Forking and Cloning in git](https://help.github.com/articles/fork-a-repo/). You can also ask for help in our [gitter channel](https://gitter.im/jboss-outreach/gci).
* If not using Git, then simply download the [.zip](https://github.com/jboss-outreach/vertx-gradle-simple/archive/master.zip) file of this repository and unzip the file.
* Download Vert.x from http://vertx.io/


###### If not using an IDE, skip steps 1 and 2

1. If you prefer using an IDE, install [IntelliJ IDEA](https://www.jetbrains.com/idea) or any other preferred IDE for Java Application Development.
2. [Configure Java SDK](https://www.jetbrains.com/help/idea/defining-a-jdk-and-a-mobile-sdk-in-intellij-idea.html) version by going to :

			* File ---> Project Structure ---> Project Settings ---> Set the project SDK to  **Java version 1.8**

## Running the app


### Two Methods: 

##### 1. Using an IDE like IntelliJ IDEA,
* Import the cloned repository into your IDE
* Right click on the vertx at the top of the code and use the suggested help from IntelliJ to link it to the project
* Right click the **HelloWorldEmbedded** class
* Click **Run as...**

##### 2. Command Line Method

Directly run the application using the gradle plugin in the command line with ```./gradlew run``` on Linux/macOS OR ``` gradlew run ``` on Windows.
* If permission is denied, then run cmd as admin (for Windows) or use ```chmod +x ./gradlew``` (for Linux/Unix)


## Viewing the app after running it

Visit **http://localhost:8080** on your browser

If everything was setup correctly, you will see  ``` "Hello World" ``` displayed in your browser. 

###### Playing with the code

You can try and edit the request handler response in the **HelloWorldEmbedded** java file.


## Contributing to the project
1. Make your intended changes on your locally cloned repository.
2. Add a new branch with a meaningful name indicating your change (i.e. Add-Unit-Tests).
2. *Commit* the changes and *Push* the commit to your forked repository on GitHub.
3. Ensure the changes on the commit pushed to your GitHub fork are correct.
4. Create a [pull request](https://help.github.com/articles/about-pull-requests/) requesting to merge the commits on your fork to this repository.
5. Write a very conscise but informative pull request message. Remember to use your words wisely!


## Addtional Learning
* [Understanding the Github Flow](https://guides.github.com/introduction/flow/)
* [Working with Git](http://product.hubspot.com/blog/git-and-github-tutorial-for-beginners)
* [Explore Vert.x](http://vertx.io/docs/)
* [Understanding Gradle](http://igorpopov.io/2014/05/01/understanding-gradle/)
* [What is LocalHost](https://en.wikipedia.org/wiki/Localhost)
* [Understanding IDE](https://en.wikipedia.org/wiki/Integrated_development_environment)
* [How to set JAVA_HOME](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/)
* [Chat with us !](https://gitter.im/jboss-outreach)


