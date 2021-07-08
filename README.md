# Java Functional

## Table of Contents
* [General info](#general-info) 
* [Technologies](#technologies) 
* [Setup](#setup)
* [Extra information](#Extra)

------------
## General info

In this course i learned new style of programming as Functional in the language Java. This repository contains in the folder Java-se-functional, different types of functios available, how to create or own functions and how to use all those functions. It taught about Functions, BiFunctions, Operators (Unary and Binary), Consumers, Suppliers, Predicates, the structure of lambda expression and how to use Streams like list but for 1 use. Inside the folder Java-Functiona-Platzi directory are files used only for practice the functions in each class and it contains the explanation of how to use it by te teacher in each class (java class in spanish by the teacher). In the other directory the *job-search* contains a project which we use all the function learned and is used to send petitions and receive data from the GitHub Job Search Api. The api is deprected so the final code doesnt work.

------------
## Technologies

>- IntelliJ Idea
>- OpenJDK 8
>- Requiered dependencies:
    - JCommander
    - Feign Core
    - Feign Gson

------------
## Setup
This project was made on a Windows 10 OS.

### Netbeans
1. Go to https://www.jetbrains.com/idea/download/ and download the Community version

### OpenJDK
1. go to [https://adoptopenjdk.net/]
2. Download the following version:
>- OpenJDK 8

### Dependencies 
Copy the next code and insert into the pom.xml in dependencies
1. JCommander
    -  `<!-- https://mvnrepository.com/artifact/com.beust/jcommander -->
<dependency>
    <groupId>com.beust</groupId>
    <artifactId>jcommander</artifactId>
    <version>1.81</version>
</dependency>`
2. Feign Core
    -`<!-- https://mvnrepository.com/artifact/io.github.openfeign/feign-core -->
<dependency>
    <groupId>io.github.openfeign</groupId>
    <artifactId>feign-core</artifactId>
    <version>11.2</version>
</dependency>`
3. Feign Gson
    -`<!-- https://mvnrepository.com/artifact/io.github.openfeign/feign-gson -->
<dependency>
    <groupId>io.github.openfeign</groupId>
    <artifactId>feign-gson</artifactId>
    <version>11.2</version>
</dependency>`



------------
## Extra

>- Functional Programming as a style of coding
>- advantage and disadvantage of functional programming
>- what is a function and how to declare them
>- First Class citizens
>- pure and impure functions
>- impure functions generate side effects (CRUD files, Read/write DB, send or recieve redcalls)
>- higher order function (advantage)
>- Lambda and how it works
>- Data Immutability advantages and disadvantages
>- Types of functions as Predicate, Consumer, supplier
>- UnaryOperator, Bifunction, BinaryOperator
>- SAM interface (Single abstract method) to create function's body
>- Lambda Syntax
>- Default as interface for implements methods.
>- Chaining 
>- Composition of functions (.compose and .andThen)
>- Optional used for deal with non existing values
>- Stream kind of list for elements and can autoiterate
>- Intermediate operations
>- Final operations
>- Collector interface

------------
### commands that i learned
|  Command | Function  |
| ------------ | ------------ |
|  Function<T,R> | type of data or object that takes value X and generate value Y |
|  Predicate | Type of function that works on a data and generates boolean |
|  Consumer | makes operations for a list of data, and by each data it consumes and operates in that |
|  Supplier | generates data and provides data |
|  UnaryOperator | works with one kind of data and generates the same kind of data |
|  Bifunction | takes two types of Data and generates one type of data |
|  BinaryOperator | makes the tree data (two input and one output) the same kind |
|  period | period of time in java |
|  @Functionalinterface | allow us to use undefined methods and default methods |
|  Compose | makes run first that part that ir generated and after the rest of the code |
|  AndThen | executes the code after the rest of the code |
|  Optional | avoid problems with non-existent values |
|  Optional.ofNullable | indicates that we have a data of which we do not know if it is null or not |
|  Optional.empty | avoid working with nulls |
|  stream | it is a kind of list that has elements and can be autoiterated, the stream can only be consumed 1 time |
|  Collector | It is an interface that will take data of type T from the Stream, a mutable data type A, where the elements will be added and will generate a result of type R |
|  IntStream | generates infinite integers |
|  .limit | limits the integer of the intStream |
|  AnyMatch, allmatch and nonematch | determinates if in streams are elements that fulfills a certain predicate |
|  findAny, findFirst | return an Optional as a result of searching for an element within the Stream |
|  min, max | obtains the min elements or the max element in streams using comparator |
|  count | count how many elements are in streams |
|  toArray | Add all the elements of the stream into array and bring us that array |
|  Filter | it is in charge of iterating each element of the Stream and evaluating with the Predicate filters the stream |
|  map | it is an operation that transforms from one type to another |
|  flatmap | purge data for additional information that is not required |
|  distinct | compare each element of the Stream against the rest using the equals method |
|  Limit | receives a long that determines how many elements of the original Stream will be preserved |
|  peek | take a Consumer, pass the data as they are present in the Stream and generate a new identical Stream to continue operating |
|  skip | discards the first n elements and generates a Stream with the remaining elements in the Stream |
|  sorted | requires that the elements present in the Stream implement the Comparable interface to be able to do a natural ordering within the Stream |
|  Boxed | converts IntStream into stream of Integers |
