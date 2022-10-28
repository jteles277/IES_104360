___
## 3.1 b)

1. The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?

    > Springs does all the work basically, its instantiated 1 entety **being the scenes**

2. List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined? 

    * save(entity)
    * delete(entity)
    * findById(long)
    * findAll()
        
    > They dont need to be implemented by us, they are already defined in the **interface**


3. Where is the data being saved?

    >  Its saved in **memory** and then lost, unless there is a **database** then we can hava **persistance of data**

4. Where is the rule for the “not empty” email address defined?

    >   In the **@NotBlank** annotation (and it makes so that the email cannot be succefully created/updated to an empty value)

___
## 3.2

* to quickly run spring->  $clear; mvn clean; clear; ./mvnw spring-boot:run

* Insert employee into db with postman
{"firstName": "joao", "lastName":"teles", "emailId":"jgtc@ua.pt"}
___
## Review Questions

**A. Explain the differences between the RestControllerand Controller components used in different parts of this lab.**

> ..
    
**B. Create a visualization of the Spring Boot layers (UML diagramor similar), displaying the key abstractions in the solutionof 3.3, in particular: entities, repositories, servicesand REST controllers.Describe the role of the elements modeled in the diagram.**

> ..

**C. Explain the annotations @Table, @Colum, @Id found in the Employee entity.**

> ..

**D. Explain the use of the annotation @AutoWired (in the Rest Controller class).**

> ..


___
#### About the Project 

* need to use spring boot
___