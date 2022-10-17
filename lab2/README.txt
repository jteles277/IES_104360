

TomCat 

    Production-ready application server

    bit/startup.bat     -> start tomcat server
    bit/shutdown.bat    -> sutdown tomcat server


Servlets 
    
    Java classes that conform to the Java Servlet API, which allows a Java class to respond to requests.




A.What are the responsibilities/services of a “servlet container”?

    - Responsaveis por aceitar uma request, processá-la e mandar uma response de volta 
    - O container direciona estas requests para serem processadas no servlet's service() method.
    - Gerir estados
    

B.Explain, in brief, the “dynamics” of Model-View-Controller approach used in Spring Boot to serve web content. (You may exemplify with the context of the previous exercises.)
 
    View -> É a commponente interativa da aplicacão, onde o usuario observa/interage com o sistema 
    Controller -> Conecta a view com o model 
    Model ->Baseia se no proprio coonteudo da aplicacao (dados, logica, etc...)

    No exercicio 2.3 c) por exemplo, 
    View-> é a pagina html que mostra a informacao
    Controller-> é a classe GreetingController que conecta a logica á view
    Model-> é o Objecto Greetings 

C.Inspect the POM.xml for the previous SpringBoot projects. What is the role of the “starters” dependencies?

    ...

D.Which annotations are transitively included in the @SpringBootApplication?

    ...

E.Search online for the topic “Best practices for REST APIdesign”. From what you could learn, select your “top 5”practices,and briefly explain them in you own words.

    ...