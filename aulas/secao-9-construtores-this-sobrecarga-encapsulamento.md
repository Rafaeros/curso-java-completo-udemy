## 🏗️ Construtores
- Executados na **instanciação do objeto**.  
- Usos principais:  
  - Inicializar atributos obrigatórios  
  - Forçar entrada de dados no momento da criação (injeção de dependências)  
- Se não for declarado, a classe disponibiliza o **construtor padrão**.  
- É possível definir **sobrecarga** (mais de um construtor).  

```java
public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}
```

---

## 🔑 Palavra `this`
- Referência ao **próprio objeto**.  
- Usos:  
  - Diferenciar atributos de variáveis locais.  
  - Passar o objeto atual como argumento.  

```java
public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}
```

---

## 🔄 Sobrecarga
- Permite definir **construtores e métodos com o mesmo nome**, mas parâmetros diferentes.  

```java
public Product() {}
public Product(String name, double price) {
    this.name = name;
    this.price = price;
}
```

---

## 🔒 Encapsulamento
- **Ocultar detalhes internos** e expor apenas operações seguras.  
- Mantém objetos em **estado consistente**.  
- Atributos → `private`, acesso via getters e setters (JavaBeans).  

```java
private String name;
private double price;

public String getName() { return name; }
public void setName(String name) { this.name = name; }
```

---

## 🔑 Modificadores de Acesso
- `private` → apenas na classe.  
- *(default)* → apenas no pacote.  
- `protected` → pacote + subclasses.  
- `public` → acessível em todos os lugares.  

---

## 📝 Exercício – Conta Bancária
- Dados necessários: número, titular, depósito inicial (opcional).  
- Regras:  
  - Número da conta não pode mudar.  
  - Nome do titular pode mudar.  
  - Saldo só altera com **depósito** ou **saque**.  
  - Saque cobra taxa de $5.  
  - Conta pode ficar negativa.  

---

## ✅ Resumo
- Construtores inicializam objetos.  
- `this` referencia o próprio objeto.  
- Sobrecarga permite múltiplas variações.  
- Encapsulamento protege dados e garante consistência.  
- Modificadores de acesso controlam visibilidade.  

---
