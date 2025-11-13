### ☕ Resumo: Tratamento de Exceções em Java  

O documento, elaborado pelo **Prof. Dr. Nelio Alves**, apresenta os fundamentos do **tratamento de exceções em Java**, abordando desde os conceitos iniciais até a criação de exceções personalizadas. O objetivo é demonstrar como lidar com erros de forma **organizada, segura e reutilizável** em programas orientados a objetos.  

---

#### ⚠️ O que são Exceções  

Uma **exceção** é qualquer condição de erro ou comportamento inesperado que ocorre durante a execução de um programa.  

- **Tipos principais:**  
  - `java.lang.Exception` → o compilador **obriga** a tratar ou propagar.  
  - `java.lang.RuntimeException` → o compilador **não obriga** a tratar.  

**Propagação:**  
Quando uma exceção é lançada, ela percorre a pilha de chamadas até ser **capturada (tratada)** ou o programa **encerrado**.  

---

#### 🧬 Hierarquia de Exceções  

```
Throwable
 ├── Error
 │    ├── OutOfMemoryError
 │    └── VirtualMachineError
 └── Exception
      ├── IOException
      └── RuntimeException
           └── NullPointerException
           └── IndexOutOfBoundsException
```

**Vantagens do modelo de exceções:**  
- ✅ Tratamento consistente e flexível de erros.  
- ✅ Delegação da lógica de erro à classe responsável.  
- ✅ Organização hierárquica dos tipos de exceção.  
- ✅ As exceções podem carregar informações adicionais.  

---

#### 🧱 Estrutura `try-catch`  

Blocos usados para **detectar e tratar exceções**.  

```java
try {
    // código que pode gerar exceção
}
catch (ExceptionType e) {
    // tratamento da exceção
}
```

- O bloco `try` contém o código “normal” que pode falhar.  
- O bloco `catch` define **como tratar** a exceção.  
- É possível ter múltiplos blocos `catch`.  

**Exemplo:**  
```java
try {
    String[] vect = sc.nextLine().split(" ");
    int position = sc.nextInt();
    System.out.println(vect[position]);
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid position!");
}
catch (InputMismatchException e) {
    System.out.println("Input error");
}
System.out.println("End of program");
```

---

#### 🧩 Pilha de Chamadas (Stack Trace)  

A **pilha de chamadas** mostra o caminho de execução até o ponto onde a exceção ocorreu.  
É possível imprimir esse histórico com:  
```java
e.printStackTrace();
```

**Exemplo prático:**  
```java
public static void method2() {
    try {
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid position!");
        e.printStackTrace();
    }
}
```

---

#### 🔁 Bloco `finally`  

O **bloco `finally`** contém código que **sempre será executado**, independentemente de ocorrer exceção.  
Usado com frequência para **fechar recursos**, como arquivos e conexões.  

**Exemplo:**  
```java
File file = new File("C:\\temp\\in.txt");
Scanner sc = null;
try {
    sc = new Scanner(file);
    while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
    }
} 
catch (IOException e) {
    System.out.println("Error opening file: " + e.getMessage());
} 
finally {
    if (sc != null) {
        sc.close();
    }
}
```

---

#### 🧰 Exceções Personalizadas  

Permitem criar **regras de negócio específicas** encapsuladas em novas classes.  

**Exemplo de problema:**  
Um programa deve gerenciar reservas de hotel, garantindo:  
- A data de **saída** deve ser **posterior** à data de entrada.  
- Alterações só podem ocorrer para **datas futuras**.  

**Saídas esperadas:**  
```
Error in reservation: Check-out date must be after check-in date
Error in reservation: Reservation dates for update must be future dates
```

**Soluções comparadas:**  
1. ❌ Lógica de validação no programa principal — código confuso.  
2. ⚠️ Método retornando `String` — semântica incorreta.  
3. ✅ **Uso de exceções** — abordagem mais clara, delegando a validação para a classe.  

---

#### 🔑 Cláusulas `throw` e `throws`  

- `throw` → **lança** uma exceção manualmente.  
- `throws` → **propaga** a exceção para o método chamador.  

**Resumo das boas práticas:**  
- Utilize **`Exception`** quando o compilador deve obrigar o tratamento.  
- Utilize **`RuntimeException`** para erros de lógica não obrigatórios.  
- Evite estruturas com muitos `if`; exceções tornam o código mais limpo.  

---

#### 💡 Exercício de Fixação  

Crie um programa que leia os dados de uma **conta bancária** e realize saques conforme as regras:  
- ❌ Saque não pode ultrapassar o **limite de saque**.  
- ❌ Saque não pode ocorrer se não houver **saldo suficiente**.  

**Exemplo:**  
```
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 400.00
Withdraw error: The amount exceeds withdraw limit

Enter amount for withdraw: 250.00
Withdraw error: Not enough balance
```

**Implementação sugerida:**  
- Criar uma exceção personalizada `WithdrawException`.  
- Tratar erros no programa principal.  

---

#### 🧭 Conclusão  

O tratamento de exceções em Java é essencial para criar **programas robustos e reutilizáveis**.  
Ele permite:  
- 🚀 Lógica de erro mais limpa e delegada.  
- 🧱 Redução de condicionais aninhadas.  
- 🧩 Reuso e clareza no código.  
- 🔍 Identificação rápida de falhas por meio do **stack trace**.  

---
