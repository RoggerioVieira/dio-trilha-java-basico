# Santander Dev Week 2024
Java RESTful API criada para a santander Dev Week.

## Diagrama de classes

``` mermaid
classDiagram
    Cliente <|-- Pedido
    Pedido <|-- Prato
    Prato <|-- Menu

    class Cliente {
        +Long id
        +String nome
        +String email
        +String telefone
        +realizarPedido()
        +consultarPedidos()
    }

    class Pedido {
        +Long id
        +Cliente cliente
        +List~Prato~ pratos
        +double total
        +adicionarPrato()
        +calcularTotal()
    }

    class Prato {
        +Long id
        +String nome
        +double preco
        +prepararPrato()
    }

    class Menu {
        +Long id
        +String restaurante
        +adicionarPrato()
        +removerPrato()
        +consultarPratos()
    }

    Cliente "1" --> "0..*" Pedido : possui
    Pedido "1" --> "0..*" Prato : contém
    Prato "0..*" --> "0..*" Menu : faz parte de
```