## ➗ Expressões Aritméticas

- Operadores: `+`, `-`, `*`, `/`, `%` (mod)
- Precedência: 1º `* / %`, 2º `+ -`
- Uso de parênteses altera o resultado

---

## 💾 Variáveis e Tipos Primitivos

### Variável
- Porção de memória com:
  - Nome
  - Tipo
  - Valor
  - Endereço

### Declaração
```java
int idade = 25;
double altura = 1.68;
char sexo = 'F';
```

### Tipos Primitivos
- Inteiros: `byte`, `short`, `int`, `long`
- Reais: `float`, `double`
- Texto: `char`, `String`
- Lógico: `boolean`

---

## 📥📤 Entrada, Processamento e Saída

### Entrada
- Leitura de dados via teclado

### Processamento
- Atribuição: `media = (x + y) / 2.0;`

### Saída
- `System.out.print()`
- `System.out.println()`
- `System.out.printf()` com `%d`, `%f`, `%s`, `%n`

### Locale
- Usar `Locale.setDefault(Locale.US)` para ponto decimal

---

## ✍️ Nomes de Variáveis

- Não usar dígitos no início
- Evitar espaços, acentos e til (~)
- Preferência por **camelCase**

---

## 🔢 Casting (Conversão de Tipos)

- Conversão explícita entre tipos
```java
resultado = (double) a / b;
```

---

## 🧮 Funções Matemáticas

- `Math.sqrt(x)` – raiz quadrada
- `Math.pow(x, y)` – potência
- `Math.abs(x)` – valor absoluto
- Exemplo de delta:
```java
delta = Math.pow(b, 2.0) - 4*a*c;
```

---

## ⌨️ Leitura com Scanner

```java
Scanner sc = new Scanner(System.in);
String nome = sc.next();
int idade = sc.nextInt();
double altura = sc.nextDouble();
char sexo = sc.next().charAt(0);
String linha = sc.nextLine();
```

- Atenção com quebras de linha pendentes
- Solução: `sc.nextLine()` extra após `nextInt()` ou `next()`

---

## ✅ Resumo Final

- Expressões aritméticas e operadores
- Variáveis e tipos
- Entrada, processamento e saída
- Formatação com `printf` e `Locale`
- Funções matemáticas e boas práticas
- Casting e Scanner

---
