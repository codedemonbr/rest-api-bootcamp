Videos:

- [Abstração Inicial do Domínio no Figma](https://www.youtube.com/watch?v=6njlJt3OaSM)
- [Diagrama de Classes com ChatGPT e Mermaid](https://www.youtube.com/watch?v=1LaQXOBw_IY)
- [Mapeando as Entidades e Criando o Perfil DEV](https://www.youtube.com/watch?v=Rg_9MIksDyQ)
- [Hotfix 'precision' e 'scale'](https://www.youtube.com/watch?v=mu0FJ1l4tZs)
- [Implementando a Camada de Negócio](https://www.youtube.com/watch?v=Uqhb_QBnJ34)
- [Expondo Endpoints REST e Testando a API](https://www.youtube.com/watch?v=jN9Hh_xQOkY)
- [Tratamento de Exceções em APIs REST](https://www.youtube.com/watch?v=fygu5ZnxG5w)
- [Provisionando o PostgreSQL Railway e Criando o Perfil de PRD](https://www.youtube.com/watch?v=ipLKjDkZxQw)
- [Deploy da API na Nuvem Railway](https://www.youtube.com/watch?v=K4EeA6FYIJA)
- [Correção de CORS e Conclusão](https://www.youtube.com/watch?v=swVRlX-QpqQ)

Referências:

- [https://github.com/digitalinnovationone/santander-dev-week-2023-api]()
- [https://github.com/falvojr/santander-dev-week-2023]()

## Diagrama de classes:

```mermaid

classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
