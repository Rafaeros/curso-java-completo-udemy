### ☕ Resumo: Trabalhando com Arquivos em Java  

O documento, elaborado pelo **Prof. Dr. Nelio Alves**, apresenta os conceitos e práticas fundamentais para **manipulação de arquivos e diretórios em Java**, incluindo leitura, escrita e tratamento de diretórios com as principais classes da API `java.io`.  

---

#### 📂 Leitura de Arquivos com `File` e `Scanner`  

As classes **`File`** e **`Scanner`** permitem acessar e ler arquivos de texto de maneira simples.  

- **`File`** — Representa o arquivo e seu caminho.  
- **`Scanner`** — Lê o conteúdo do arquivo linha a linha.  
- **`IOException`** — Classe usada para tratar erros de leitura.  

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
    System.out.println("Error: " + e.getMessage());
}
finally {
    if (sc != null) {
        sc.close();
    }
}
```

---

#### 📖 Leitura com `FileReader` e `BufferedReader`  

As classes **`FileReader`** e **`BufferedReader`** oferecem leitura mais eficiente, especialmente em arquivos grandes.  

- **`FileReader`** — Stream de leitura de caracteres.  
- **`BufferedReader`** — Armazena dados em buffer, tornando a leitura mais rápida.  

**Exemplo:**  
```java
String path = "C:\\temp\\in.txt";
BufferedReader br = null;
FileReader fr = null;

try {
    fr = new FileReader(path);
    br = new BufferedReader(fr);

    String line = br.readLine();
    while (line != null) {
        System.out.println(line);
        line = br.readLine();
    }
}
catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
finally {
    try {
        if (br != null) br.close();
        if (fr != null) fr.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

---

#### ⚙️ Bloco `try-with-resources`  

A partir do **Java 7**, o bloco `try-with-resources` simplifica o fechamento automático de arquivos.  
Tudo que é aberto dentro do `try()` será automaticamente fechado.  

**Exemplo:**  
```java
String path = "C:\\temp\\in.txt";

try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    String line = br.readLine();
    while (line != null) {
        System.out.println(line);
        line = br.readLine();
    }
} 
catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

#### 📝 Escrita de Arquivos com `FileWriter` e `BufferedWriter`  

Essas classes permitem criar e escrever dados em arquivos de texto.  

- **`FileWriter`** — Stream de escrita em arquivo.  
  - Cria/Recria arquivo: `new FileWriter(path)`  
  - Adiciona ao final: `new FileWriter(path, true)`  
- **`BufferedWriter`** — Usa buffer, otimizando a escrita.  

**Exemplo:**  
```java
String[] lines = { "Good morning", "Good afternoon", "Good night" };
String path = "C:\\temp\\out.txt";

try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
    for (String line : lines) {
        bw.write(line);
        bw.newLine();
    }
}
catch (IOException e) {
    e.printStackTrace();
}
```

---

#### 📁 Manipulando Pastas com `File`  

A classe **`File`** também permite **listar diretórios e arquivos** e **criar novas pastas**.  

**Exemplo:**  
```java
System.out.println("Enter a folder path: ");
String strPath = sc.nextLine();

File path = new File(strPath);

File[] folders = path.listFiles(File::isDirectory);
System.out.println("FOLDERS:");
for (File folder : folders) {
    System.out.println(folder);
}

File[] files = path.listFiles(File::isFile);
System.out.println("FILES:");
for (File file : files) {
    System.out.println(file);
}

boolean success = new File(strPath + "\\subdir").mkdir();
System.out.println("Directory created successfully: " + success);
```

---

#### 🧭 Informações do Caminho de Arquivo  

A classe **`File`** fornece métodos para acessar informações sobre o caminho, o diretório pai e o nome do arquivo.  

**Exemplo:**  
```java
File path = new File(strPath);

System.out.println("getPath: " + path.getPath());
System.out.println("getParent: " + path.getParent());
System.out.println("getName: " + path.getName());
```

---

#### 💡 Exercício Proposto  

Crie um programa para ler um arquivo `.csv` contendo dados de **itens vendidos** e gerar um novo arquivo `summary.csv` dentro de uma subpasta **out**, contendo apenas o nome do item e o valor total (preço × quantidade).  

**Entrada (`source.csv`):**  
```
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2
```

**Saída (`out/summary.csv`):**  
```
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Samsung Galaxy 9,1700.00
```

🔗 Código de referência: [github.com/acenelio/files1-java](https://github.com/acenelio/files1-java)  

---

#### 🧾 Conclusão  

O trabalho com arquivos em Java envolve o uso das classes da API `java.io`, que permitem:  
- 📖 **Ler e escrever arquivos** com eficiência.  
- 📂 **Manipular diretórios** e criar novas pastas.  
- 🔄 **Automatizar o fechamento de recursos** com `try-with-resources`.  
- 💡 **Gerar relatórios e processar dados** com segurança e clareza.  

---

📘 **Autor:** Prof. Dr. Nelio Alves  
📅 Data: 26/06/2018  
📚 Curso: Programação Orientada a Objetos com Java  
🌐 Fonte: [educandoweb.com.br](http://educandoweb.com.br)
