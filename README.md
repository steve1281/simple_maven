# Create a Barebones MAVEN project

based on: https://www.youtube.com/watch?v=cTzvrCm9P9E

Note:  Original author uses Eclipse, I use Intellij.

## Setting up

```
mkdir simple_maven
cd simple_maven
git init
```

## Notes about POM - Project Object Model

* XML formatted 
* describes dependencies that need to be brought in
* describes plugins that manage project configuration
* File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent! Fix with:

```
<properties>
    ...
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
</properties>
```

## create the project

* open intellij

```
idea 
```

* New  -> Project
* Maven


```
Name:  simple_maven
Location:  ~/projects/home/simple_maven

-- open Artifact Cooridinates --

Groupid: com.test777767ont
Artifactid: myproject 
```

* be careful - intellij will rename your Location to match your project
* intellij will ask to automatically add stuff to git. I don't reccoment this.  You should manage your own commits.

## Created file tree

```
[~/projects/home/simple_maven]  $ tree
.
├── README.md
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        └── java
```

## Add App

* add package com.test777767ltd to src/main/java
* add class App to com.test777767ltd 
* add config.properties to src/main/resources

## Add TestApp
* add package com.test777767ltd to src/test/java
* add class ApipTest to com.test777767ltd 

## About slj4 warning, change the pom.xml

* You will need to add to the pom this:

```
        <!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-nop -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-nop</artifactId>
            <version>1.7.36</version>
            <scope>test</scope>
        </dependency>
```

## The MAVEN build "lifecycle"

* Intellij gives you a side panel- Maven
* under Lifecycle there are options
* interesting ones

### clean  - this deletes up your build artifacts

### test  - this builds and runs your unit tests

### package - this builds your jar file

* note:  [INFO] Building jar: /Users/steve/projects/home/simple_maven/target/simple_maven-1.0-SNAPSHOT.jar

## todo

* manifest
* running jar




## dependencies

link: mvnrepository

