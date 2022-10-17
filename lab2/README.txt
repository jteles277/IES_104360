

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

    starters dependencies são muito uteis, não só para minimizar a quantidade de dependencias(o que pode puluir muito o pom), 
    servem também para manter dependencias relacionadas juntas e com versoes coesas

D.Which annotations are transitively included in the @SpringBootApplication?

   @EnableAutoConfiguration
   @ComponentScan
   @Configuration

E.Search online for the topic “Best practices for REST APIdesign”. From what you could learn, select your “top 5”practices,and briefly explain them in you own words.

    1. Usar JSON:
    json é o formato padrao para apis e por isso muitas ferramentas existem para facilitar o processo.

    2. Usar Status Codes em Error Handling
    é obvio que quando algo errado acontece, isso deve ficar claro para o utilizador, usando standarts facilita muito.

    3. Ser claro em relacao as versoes
    Apis com diferentes versoes podem causar muitos problemas se eles nao forem claros em relacao a essa questao
   
    4. Fornecer uma boa documentação para a API
    Mais uma vez, nós queremos tornar o acesso do utilizador á informacao o mais simples possivel, e uma boa documentacao deixa sempre tudo mais facil de entender

    5. Use logical nesting on endpoints
    Faz sentido que items relacionados estajam agrupados, e uma organizacao em arvore fornecida pelos urls sao perfeitas