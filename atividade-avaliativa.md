### Atividade avaliativa do 2° Bimestre

* Projeto de um web service RESTful com Spring Boot e JPA/Hibernate
* O trabalho deverá estar em um repositório no GitHub
* Valor: 8 pontos

Implementar as operações de CRUD - Create, Retrieve, Update e Delete para as entidades Customer e Phone seguindo o diagrama da UML

![diagrama](https://user-images.githubusercontent.com/56240254/99082364-d4336600-25a2-11eb-933d-5bdf8062a76d.PNG)

* Mapear o relacionamento
    * Adicionar a anotação @OneToMany(mappedBy = "customer") no atributo phones da entidade Customer. O relacionamento de Customer para Phone é de Um-para-Muitos.
    A propriedade mappedBy informa que o atributo customer na entidade Phone é dono do relacionamento.

    * Adicionar a anotação @ManyToOne no atributo customer da entidade Phone.
    O relacionamento de Phone para Customer é de Muitos-para-Um.

* Documentação de todos os endpoints com o Swagger

#### Basic new entity checklist
   * Entity
   * Repository
   * Database seed
   * Service
   * Resource
