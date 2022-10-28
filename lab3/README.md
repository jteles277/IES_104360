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

**A. Explain the differences between the RestController and Controller components used in different parts of this lab.**

> As the name might suggest **@RestController is a specialized version of @Controller** (@Controler is a specialized version of @Component), and so the diferences are in that specification
> RestController is used in RESTful Web services, and it’s the combination of @Controller and @ResponseBody annotation.
    
**B. Create a visualization of the Spring Boot layers (UML diagramor similar), displaying the key abstractions in the solution of 3.3, in particular: entities, repositories, services and REST controllers. Describe the role of the elements modeled in the diagram.**

> ..

**C. Explain the annotations @Table, @Colum, @Id found in the Employee entity.**

> This annotations inform spring what we want that entity to be repersented in our database with (JPA Data)
>* @Table can customize the mapping of the database table using the name, schema, and catalog attributes
>* @Column is the same as the last one but for the columns
>* @Id is used to specify a primary key attribute for enteties, JPA and Hibernate require you to do so

**D. Explain the use of the annotation @AutoWired (in the Rest Controller class).**

> The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished. The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.


___
#### About the Project 

* We need to use spring boot
___