## 🐞 Debug no Eclipse
- Ativar breakpoint: `Run > Toggle Breakpoint`
- Iniciar: `Debug as > Java Application`
- Passo a passo: tecla `F6`

---

## 🔄 Estrutura While

### Uso:
- Quando **não se sabe** o número de repetições

### Sintaxe:
```java
while (condicao) {
   // comandos
}
```

- Condição verdadeira: executa e volta
- Condição falsa: sai do laço

---

## 🔁 Estrutura For

### Uso:
- Quando **se sabe** o número de repetições

### Sintaxe:
```java
for (inicio; condicao; incremento) {
   // comandos
}
```

- Ideal para **contagens progressivas ou regressivas**

---

## 🔂 Estrutura Do-While

### Uso:
- Quando o bloco deve executar **pelo menos uma vez**

### Sintaxe:
```java
do {
   // comandos
} while (condicao);
```

- Condição verificada **após** a execução

---

## 📝 Exemplo prático com `do-while`
```java
char resp;
do {
   double C = sc.nextDouble();
   double F = 9.0 * C / 5.0 + 32.0;
   resp = sc.next().charAt(0);
} while (resp != 'n');
```

---

## ✅ Resumo

### While
- Uso quando a repetição depende de uma condição

### For
- Ideal para repetições com contagem definida

### Do-While
- Garante execução ao menos uma vez

---

## Extras
- Testes de mesa são importantes para entender o fluxo
- Debug ajuda a ver o passo a passo da execução

---
