## 🔁 Expressões Comparativas e Lógicas

### Operadores Comparativos
- `>` maior
- `<` menor
- `>=`, `<=`, `==`, `!=`

### Operadores Lógicos
- `&&` (E)
- `||` (OU)
- `!` (NÃO)

---

## ✅ Estrutura Condicional

### Simples:
```java
if (condicao) {
   // comandos
}
```

### Composta:
```java
if (condicao) {
   // bloco 1
} else {
   // bloco 2
}
```

### Encadeada (if / else if / else)
```java
if (condicao1) {
} else if (condicao2) {
} else {
}
```

---

## ➕ Operadores de Atribuição Cumulativa

- `a += b; // a = a + b`
- `a -= b; // a = a - b`
- `a *= b; // a = a * b`
- `a /= b; // a = a / b`
- `a %= b; // a = a % b`

---

## 🔄 switch-case

```java
switch (expressao) {
    case valor1:
        // comandos
        break;
    case valor2:
        // comandos
        break;
    default:
        // comandos
        break;
}
```

- Útil para múltiplas opções baseadas no valor de uma variável

---

## ❓ Expressão Condicional Ternária

```java
condicao ? valor_se_verdadeiro : valor_se_falso;
```

Exemplo:
```java
double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
```

---

## 📦 Escopo e Inicialização

- **Escopo**: região onde a variável é válida
- Uma variável **não pode ser usada sem ser iniciada**
- Exemplo incorreto:
```java
if (price > 100.0) {
    double discount = price * 0.1;
}
System.out.println(discount); // erro!
```

---

## ✅ Resumo

- Operadores lógicos e comparativos
- Condicional `if`, `else`, `else if`
- Atribuição cumulativa
- `switch-case` e ternário
- Escopo e inicialização de variáveis

---
