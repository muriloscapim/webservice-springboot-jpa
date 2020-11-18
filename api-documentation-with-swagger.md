## Documentando uma API Spring Boot com o Swagger

A documentação de uma aplicação é um ponto essencial de qualquer projeto, muitas vezes negligenciado.

Em trabalho em equipe, a ausência ou uma má documentação pode dificultar o trabalho dos demais desenvolvedores.

* O Swagger é uma aplicação open source que auxilia os desenvolvedores a definir, criar e consumir APIs REST.

    * https://swagger.io/

*  É composto de um arquivo de configuração, que pode ser definido em arquivo YAML ou JSON.

* A biblioteca SpringFox facilita a criação do arquivo de configuração do Swagger.

    * https://github.com/springfox/springfox

### Adicionando a biblioteca SpringFox em uma aplicação Spring Boot

* Adicionar a dependência do SpringFox e do SwaggerUI (https://swagger.io/tools/swagger-ui/) no arquivo pom.xml

```xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>
```

```xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
```

Para que o arquivo de documentação seja criado, é necessário habilitar o Swagger na aplicação, criar a classe SwaggerConfig.

* Todas as configurações do Swagger são feitas nessa classe.

```java
@Configuration
@EnableSwagger2 // ativa o Swagger na aplicação Spring Boot
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
          .select()
          .apis(RequestHandlerSelectors.any())
          .paths(PathSelectors.any())
          .build();
    }
}
```

Ao executar a aplicação o Swagger UI estará disponível na rota **localhost:8080/swagger-ui.html**

### Configurando o Swagger na aplicação Spring Boot

Adicionar a anotação **@ApiOperation** para descrever o endpoint.

Adicionar as anotações **@ApiResponses** e **@ApiResponse** para especificar os códigos e as mensagens de retorno.

```java
 @ApiOperation(value = "Retorna uma lista de usuários")
   @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Retorna a lista de usuários"),
        @ApiResponse(code = 401, message = "Você não tem permissão para acessar este recurso"),
        @ApiResponse(code = 500, message = "Foi gerada uma exceção")
  })
  // endpoint
  @GetMapping // indica que o método responde a uma requisição GET HTTP
  public ResponseEntity<List<User>> findAll() {
      List<User> list = service.findAll();
      return ResponseEntity.ok().body(list);
  }
```
