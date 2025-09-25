## 🔹 Tipos referência vs. tipos valor
- **Classes** → tipos referência (variáveis funcionam como ponteiros).  
- **Primitivos** → tipos valor (cópia direta).  
- Referências podem receber `null`.  
- Objetos não utilizados são desalocados pelo **Garbage Collector**.  
- Variáveis locais são desalocadas ao sair do escopo.  

---

## 📦 Valores padrão em objetos
- `0` para números  
- `false` para boolean  
- `char` = código 0  
- `null` para objetos  

---

## 🔁 Vetores (Arrays)
- Estrutura de dados homogênea e ordenada.  
- Tamanho fixo, alocado em bloco único de memória.  
- Vantagens: acesso direto por índice.  
- Desvantagens: dificuldade em inserções/remoções.  

### Exemplo – Alturas
```java
double[] vect = new double[n];
for (int i=0; i<n; i++) vect[i] = sc.nextDouble();
```

### Exemplo – Produtos
```java
Product[] vect = new Product[n];
vect[i] = new Product(name, price);
```

### Exercício – Pensionato
- 10 quartos identificados de 0 a 9.  
- Ler dados (nome, email, quarto).  
- Mostrar relatório final com quartos ocupados.  

---

## 🔄 Boxing, Unboxing e Wrappers
- **Boxing**: valor → objeto.  
- **Unboxing**: objeto → valor.  
- **Wrapper classes**: equivalentes OO dos primitivos (aceitam `null`).  

```java
Integer x = 10;  
int y = x * 2;
```

---

## 🔂 For-each
Forma simplificada para percorrer coleções:
```java
for (String obj : vect) {
    System.out.println(obj);
}
```

---

## 📋 Listas (List)
- Estrutura homogênea, ordenada e de tamanho variável.  
- Implementações comuns: `ArrayList`, `LinkedList`.  
- Métodos principais:  
  - `add`, `remove`, `size`, `get`  
  - `removeIf(Predicate)`  
  - `stream().filter(...).collect(...)`  
  - `stream().findFirst().orElse(null)`  

### Exercício – Funcionários
- Ler `N` funcionários (id, nome, salário).  
- Aumentar salário de funcionário por **id**.  
- Se id não existe → mostrar erro.  

---

## 🧾 Matrizes (Arrays bidimensionais)
- Estrutura homogênea, ordenada, bidimensional.  
- Acesso direto por índices `[i][j]`.  
- Usadas para representar tabelas.  

### Exercício Resolvido – Matriz quadrada
- Mostrar diagonal principal.  
- Contar números negativos.  

### Exercício de Fixação – Buscar vizinhos
- Dada uma posição `X`, listar: esquerda, direita, acima e abaixo (quando houver).  

---

## ✅ Resumo
- Diferença entre tipos valor e referência.  
- Garbage Collector vs escopo local.  
- Uso de arrays (vetores e matrizes).  
- Listas dinâmicas com `List`.  
- Wrappers permitem OO com primitivos.  

---
