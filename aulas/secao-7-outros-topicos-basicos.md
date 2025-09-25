## 📝 Restrições e Convenções para Nomes

**Restrições:**  
- Não começar com dígito  
- Não usar acentos, til (~) ou espaços  
- Usar nomes significativos

**Convenções:**  
- **camelCase** → atributos, métodos, variáveis, parâmetros  
- **PascalCase** → classes  
- **minúsculas** → pacotes

**Exemplo:**  
```java
int salario;
int salarioDoFuncionario;
```

---

## ⚙️ Operadores Bitwise

- `&` (E bit a bit)  
- `|` (OU bit a bit)  
- `^` (XOR bit a bit)

**Exemplo:**  
```java
int mask = 0b100000;
if ((n & mask) != 0) {
    System.out.println("6th bit is true!");
} else {
    System.out.println("6th bit is false");
}
```

---

## 🔤 Funções Úteis para `String`

- **Formatar:** `toLowerCase()`, `toUpperCase()`, `trim()`  
- **Recortar:** `substring(inicio)`, `substring(inicio, fim)`  
- **Substituir:** `replace(char, char)`, `replace(string, string)`  
- **Buscar:** `indexOf()`, `lastIndexOf()`  
- **Dividir:** `split(" ")`

**Exemplo:**  
```java
String s = "potato apple lemon";
String[] vect = s.split(" ");
```

---

## 💬 Comentários em Java

- **Linha única:** `// comentário`  
- **Bloco:** `/* comentário */`

---

## 🔄 Funções (Métodos)

- Executam um processamento com significado
- Podem receber parâmetros e retornar valores
- Em POO, funções são chamadas **métodos**

**Exemplo:** Encontrar o maior de três números  
```java
public static int max(int x, int y, int z) {
    if (x > y && x > z) return x;
    else if (y > z) return y;
    else return z;
}
```

---

## ✅ Resumo

- Seguir regras e convenções de nomes  
- Usar operadores bitwise para manipulação de bits  
- Manipular strings com métodos úteis  
- Utilizar comentários para documentar código  
- Criar funções para modularização e reaproveitamento  

---
