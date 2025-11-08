# Herança e Polimorfismo em Java

## 🧬 Herança

A **herança** é um tipo de associação que permite que uma classe herde **todos os dados e comportamentos** de outra classe.

### 🏗️ Definição
- Permite **reaproveitar código** (atributos e métodos).
- A classe que herda é chamada de **subclasse** ou **classe derivada**.
- A classe que é herdada é chamada de **superclasse** ou **classe base**.

### 📘 Exemplo
```java
public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(Double amount) {
        balance += amount;
    }
}
```

Agora, vamos criar uma subclasse que **herda de Account**:

```java
public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
}
```

### ⚙️ Funcionamento
A subclasse **BusinessAccount** herda todos os membros da classe **Account**, podendo usá-los e também **adicionar novos comportamentos**.

### 💡 Palavras-chave importantes
- `extends`: indica que uma classe herda de outra.
- `super`: referencia a superclasse (usado para chamar o construtor ou métodos da classe pai).

---

## 🧠 Polimorfismo

O **polimorfismo** permite que uma variável de um tipo mais genérico (superclasse) **referencie objetos de subclasses**.

### 🧱 Exemplo
```java
Account acc1 = new Account(1001, "Alex", 1000.0);
Account acc2 = new BusinessAccount(1002, "Maria", 1000.0, 500.0);
```

- A variável `acc2` é do tipo `Account`, mas **aponta para um objeto do tipo `BusinessAccount`**.
- Isso é possível porque `BusinessAccount` é uma subclasse de `Account`.

### ⚙️ Polimorfismo em métodos
Se um método é **sobrescrito** na subclasse, o **método da subclasse é chamado**, mesmo quando o objeto é referenciado pelo tipo da superclasse.

```java
public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        balance -= amount; // sem taxa de 5.0
    }
}
```

### 🧩 Demonstração do polimorfismo
```java
Account acc1 = new Account(1001, "Alex", 1000.0);
Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

acc1.withdraw(200.0);
acc2.withdraw(200.0);
acc3.withdraw(200.0);

System.out.println(acc1.getBalance()); // 795.0
System.out.println(acc2.getBalance()); // 800.0
System.out.println(acc3.getBalance()); // 795.0
```

➡️ Apesar de todas as variáveis serem do tipo `Account`, o comportamento do método `withdraw` depende **do tipo real do objeto**.

---

## 🧾 Tipos de Relacionamentos entre Classes

### 1️⃣ Associação
Uma classe usa a outra como parte de seu comportamento.

### 2️⃣ Composição
Uma classe contém outra como **parte essencial de sua estrutura**.

### 3️⃣ Herança
Uma classe **é uma extensão de outra**, herdando atributos e métodos.

---

## ⚠️ Regras e Boas Práticas

- Use herança **somente quando houver uma relação “é um”** (ex: `BusinessAccount` é um `Account`).
- Prefira **composição** quando for “tem um” (ex: `Order` tem um `Client`).
- A herança deve **manter coerência semântica** — evite herdar classes apenas para reutilizar código.

---

## 🧩 Resumo Final

| Conceito | Descrição |
|-----------|------------|
| **Herança** | Reutilização de código e hierarquia de classes |
| **Polimorfismo** | Um mesmo nome de método com comportamentos diferentes |
| **Superclasse** | Classe base da qual outras herdam |
| **Subclasse** | Classe derivada que herda da superclasse |
| **Sobrescrita** | Redefinição de um método da superclasse na subclasse |

💬 **Em resumo:**  
A **herança** traz reutilização e hierarquia, enquanto o **polimorfismo** traz flexibilidade e dinamismo ao comportamento das classes.

---
