### ☕ Resumo: Enumerações e Composição em Java

O documento, de autoria do Prof. Dr. Nelio Alves, aborda conceitos fundamentais de Programação Orientada a Objetos em Java, com foco em **Enumerações** e **Composição**.

#### 📋 Enumerações

Enumerações (`enum`) são um tipo especial em Java usado para definir um conjunto de constantes nomeadas, melhorando a semântica e a legibilidade do código.

- **Exemplo Prático**: O status de um pedido (`OrderStatus`), que pode ser `PENDING_PAYMENT` (pagamento pendente), `PROCESSING` (em processamento), `SHIPPED` (enviado) ou `DELIVERED` (entregue).

    ```java
    package entities.enums;

    public enum OrderStatus {
        PENDING_PAYMENT, // 💳
        PROCESSING,      // ⚙️
        SHIPPED,         // 🚚
        DELIVERED;       // ✅
    }
    ```

- **Conversão** 🔄: É possível converter uma `String` para um `enum` utilizando o método `valueOf()`.

    ```java
    OrderStatus os = OrderStatus.valueOf("DELIVERED");
    ```

#### 🔗 Composição

Composição é um tipo de associação que permite que um objeto contenha outro, representando uma relação de "tem-um" ou "tem-vários".

- **Vantagens**:
    - ✅ Melhor organização e divisão de responsabilidades.
    - ✅ Maior coesão, flexibilidade e reuso de código.

#### 🏗️ Design e Categorias de Classes

O material também introduz a importância do design de software e a categorização de classes para organizar melhor um sistema, mencionando:
- `Views`
- `Controllers`
- `Services`
- `Repositories`
- `Entities`