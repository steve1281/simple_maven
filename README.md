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

* add package com.test777767ont to src/main/java
* add class App to com.test777767ont 
* add config.properties to src/main/resources

## Add TestApp
* add package com.test777767ont to src/test/java
* add class AppTest to com.test777767ont 

## About slfj4 warning, change the pom.xml

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

## add a class we can run. 

* add in Main.java and MainTest.java
* build and test:

```
[~/projects/home/simple_maven]  (master) $ java -cp target/simple_maven-1.0-SNAPSHOT.jar com.test777767ont.Main
Maven 4tw?

```

## Runnable jar, aka - add manifest

Add the following in the pom.xml

```

    <build>
        <plugins>
            <plugin>

                <!-- Building an executable jar -->

                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.1.0</version>
                <configuration>
                    <archive>
                        <manifest>

                            <!-- give full qualified name of your main class-->
                            <mainClass>com.test777767ont.Main</mainClass>

                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>

```

Then run with:

```
[~/projects/home/simple_maven]  (master) $ java -jar target/simple_maven-1.0-SNAPSHOT.jar
Maven 4tw?
```





## dependencies

link: mvnrepository

