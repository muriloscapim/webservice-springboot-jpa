### Testando os endpoints no Postman

#### Requisição POST para a rota http://localhost:8080/users

* Adicionar o Body
  * Configurar para raw e JSON

```
{
    "name": "All Might",
    "email": "all.might@gmail.com",
    "phone": "91234-5678",
    "password": "123456"
}
```

* Adicionar o Header
  * Content-Type: application/json

#### Requisição PUT para a rota http://localhost:8080/users/3

* Adicionar o Body
  * Configurar para raw e JSON

```
{
    "name": "All Might",
    "email": "all.might@hero-academy.com",
    "phone": "91234-5678"
}
```

* Adicionar o Header
  * Content-Type: application/json

#### Requisição DELETE para a rota http://localhost:8080/users/3
