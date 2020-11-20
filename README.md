# webservice-springboot-jpa
Web service com Spring Boot e JPA / Hibernate

### Web Service

Web Service é uma solução utilizada na integração de sistemas e na comunicação entre aplicações diferentes.

Um Web Service é utilizado para transferir dados através de protocolos de comunicação para diferentes plataformas, independente das linguagens de programação utilizadas nessas plataformas.

É necessário uma linguagem que possibilite a comunicação entre o web service e a aplicação que faz a requisição.

Para tal, existem protocolos de comunicação como SOAP (Simple Object Access Protocol) e o estilo arquitetural REST (Representational State Transfer).

O protocolo SOAP utiliza XML para enviar mensagens e, geralmente, utiliza o protocolo HTTP para transportar os dados.

O padrão arquitetural REST se baseia no protocolo HTTP e permite utilizar vários formatos para representação de dados, como JSON (mais utilizado), XML, RSS, entre outros.

* JSON (JavaScript Object Notation) é um formato leve de troca de dados entre sistemas.

![1_i5wQ5OHuTRMa_LHzlMXIHg (1)](https://user-images.githubusercontent.com/56240254/97914533-cbcf6580-1d2e-11eb-98ae-4e06a05254af.png)

![98149780-6ef9b980-1eac-11eb-86cf-31bffedff23b](https://user-images.githubusercontent.com/56240254/99845034-c5c0ed80-2b52-11eb-8c38-321ab1b3eda5.png)

### Spring

https://spring.io/

O Spring é um framework Java muito conhecido e utilizado.

Implementa um grande número de funções como injeção de dependência, persistência de dados e uma implementação para o padrão MVC para a criação de aplicações web.

### Spring Boot

O Spring Boot é uma ferramenta rápida e popular para iniciar projetos Spring.

Quickstart Guide: https://spring.io/quickstart


Existem várias formas de criar a estrutura de uma aplicação com Spring Boot

* utilizando a extensão Spring Tools para Eclipse, Visual Studio Code etc. https://spring.io/tools

* utilizando o Spring Initializr https://start.spring.io/

### Hibernate

Hibernate é o framework para persistência de dados mais utilizados em projetos JAVA.

Framework do tipo Object Relational Mapping (ORM).

ORM mapeia o modelo de objetos (aplicação) e o modelo relacional (base de dados).

* Produtividade - Não é necessário escrever comandos SQL.

![1_5ndd5TYBOqFyn6SneHq7YA](https://user-images.githubusercontent.com/56240254/97918151-68e0cd00-1d34-11eb-9da1-3f51743fb80c.jpeg)

* Ex de ORM: Sequelize (NodeJS), Django (Python), Laravel (PHP), Hibernate (Java), NHibernate (C#) 

### JPA

JPA é a especificação do Java que dita como os frameworks ORM devem ser implementados. Criada com o intuito de padronizar essas soluções de ORM.

### Maven

O Maven é uma ferramenta desenvolvida pela Apache que serve para gerenciar as dependências e automatizar os builds do projeto.

O arquivo pom.xml é o arquivo de configuração do Maven.

### Apache Tomcat

O servidor Apache Tomcat é um container Web de código fonte aberto baseado em Java que foi criado para executar aplicações Web.

### H2

O H2 é um banco de dados que funciona em memória com um console acessível pelo browser dentro do contexto da aplicação.

Como é em memória seu armazenamento é volátil.

É um banco de configuração rápida e fácil, visando favorecer a produtividade.

### Postman

https://www.postman.com/downloads/

O Postman é uma ferramenta que tem como objetivo testar serviços web por meio do envio de requisições HTTP.

### Usando o Spring Initializr para criar a estrutura do projeto Spring Boot

https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.3.4.RELEASE&packaging=jar&jvmVersion=11&groupId=com.fafram&artifactId=webservice&name=webservice&description=Demo%20project%20for%20Spring%20Boot&packageName=com.fafram.webservice&dependencies=web,data-jpa,h2

![Capturar2](https://user-images.githubusercontent.com/56240254/98149817-77ea8b00-1eac-11eb-8bf3-56fa70ea568f.PNG)
