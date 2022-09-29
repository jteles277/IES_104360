

Maven 

    Maven Archtypes -> Maven project templating toolkit
    
    Maven Artifacts -> Basically the output generated after a Maven project build

 
    Usefuls

        When defining a path 
        $set PATH="/.."
        This only works for the current command window, to make it permanent you need to set this line to be called every time you open the command line witch differs betewen OSs 

        $mvn archetype:generate 
        -DgroupId=com.mycompany.app                         ->  Basically the file "structure", folders inside folders to organize within a hierarchy  Ex: pt.ua.deti.ies.teles -> pt/ua/deti/ies/teles              
        -DartifactId=my-app		                            ->  Name of the project 
        -DarchetypeArtifactId=maven-archetype-quickstart 	->  Archetype template 
        -DarchetypeVersion=1.4		                        ->  Version 
        -DinteractiveMode=false		                        ->  Interactivity 

        My first one -> $mvn archetype:generate -DgroupId=ies.teles -DartifactId=First_App -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
        
        execute: mvn exec:java -D"exec.mainClass"="ies.teles.App"
        recompile and run quickly: clean; mvn package; mvn exec:java -Dexec.mainClass="ies.teles.App"


Git 

    Usefuls
    
        git clone <REPOSITORIO>                 -> Clone a remote repository to your machine
        git pull                                -> Pull the updates from the remote repository
        git add <Changed Files>                 -> Add x changed files to the next commit 
        git commmit -m "New Feature Added!"     -> Commit change
        git push                                -> Push the updates to the remote repository

        git log --reverse --oneline             -> Get commit history 


Docker 

    Containers -> Is a sandboxed process on your machine that is isolated from all other processes on the host machine.

        + Is a runnable instance of an image. You can create, start, stop, move, or delete a container using the DockerAPI or CLI.
        + Can be run on local machines, virtual machines or deployed to the cloud.
        + Is portable (can be run on any OS).
        + Is isolated from other containers and runs its own software, binaries, and configurations.


    Images -> Provides a custom filesystem and for that contains everything needed to run an application - all dependencies, configurations, scripts, binaries, etc. 
        
        The image also contains other configuration for the container, such as environment variables, a default command to run, and other metadata.


    Usefuls

        docker run -d -p 80:80 docker/getting-started   -> run a container with -d(in background) -p 80:80(port 80 corresponds to port 80)  docker/getting-started: image


        docker build -t getting-started .               -> Build an image using a Dockerfile(must be in the current command line directory) (dont forget the dot"." in the end)

            -t  -> flag tags our image. Think of this simply as a human-readable name for the final image. Since we named the image getting-started, we can refer to that image when we run a container.
            .   ->  at the end of the docker build command tells Docker that it should look for the Dockerfile in the current directory.
            Dockerfile Intructions:
                You might have noticed that a lot of “layers” were downloaded. This is because we instructed the builder that we wanted to start from the node:12-alpine image. But, since we didn’t have that on our machine, that image needed to be downloaded.
                After the image was downloaded, we copied in our application and used yarn to install our application’s dependencies. The CMD directive specifies the default command to run when starting a container from this image
            

    






	
Review questions

    A)
        O default life cycle, tal como todos os cycles, é dividido em fases executadas sequencialmente, estas sao as principais fases:

        1º validate -> Certefica-se que a configuracao do projeto esta correto e que tem toda a informação
        2º compile -> Compila o codigo fonte do projeto 
        3º test -> Passa o codigo compilado por uma seleçao de testes 
        4º package -> Transforma o codigo compilado num formato executavel (JAR por exemplo)
        5º verify -> corre mais alguns testes(unit test) para garantir um certo critério de qualidade
        6º install -> instala a package no repositorio local 
        7º deploy -> copia a package final enviando-a para um repositório remóto


    B) 
        Sim, por mais que maiven seja focado na contruução, também suporta a acao de correr um projeto que devido as vantagens de simplificao do maiven se torna uma tarefa mais simples 

    C)
        git clone <REPOSITORIO> -> git pull -> git add <Changed Files> -> git commmit -m "New Feature Added!" -> git push
   
    D)
        Pelo que encontrei a maioria de projetos grandes têm commit guidelines que devem ser priorizadas, mas por regra geral encontrei tambem algumas boas praticas:
        -Manter o commit curto  
        -Escrever no imperativo 
        -Usar um titulo e uma descrição
        -Separarar paragrafos com linhas brancas
        -Usar "-" para enumerações
        -Usar identação se necessario
        -Nao incluir informação sensivel ou comprometedora   

    E)

        Volumes sao muito importantes para (production) databases pois é o que permite data persistance, sem eles todas as imformacoes seriam perdidas sempre que religasssemos a database

    




