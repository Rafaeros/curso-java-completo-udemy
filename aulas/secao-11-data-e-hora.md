---

## 📅 Trabalhando com Data-Hora (Java 8+)

### 🔹 Conceitos Importantes
- **Data-hora local**: Representa ano, mês e dia, com a hora a ser opcional. Não possui informação de fuso horário.
- **Data-hora global**: Representa ano, mês, dia e hora, sempre com a informação de fuso horário.
- **Duração**: É o tempo decorrido entre dois momentos (duas data-horas).

---

### 🤔 Quando Usar?
- **Data-hora local**: Ideal para situações onde o momento exato não é relevante para pessoas noutros fusos horários.
  - **Exemplos**: Data de nascimento ("15/06/2001") ou a data de uma venda num sistema de região única ("13/08/2022 às 15:32").
- **Data-hora global**: Essencial quando o momento exato precisa de ser consistente entre diferentes fusos horários, comum em sistemas web e multirregião.
  - **Exemplos**: Horário de um evento online ("21/08/2022 às 20h (horário de São Paulo)") ou o registo de quando um comentário foi publicado.

---

### 🌍 Timezone (Fuso Horário)
- **GMT (Greenwich Mean Time)**: É o fuso horário de Londres, também conhecido como **UTC (Coordinated Universal Time)** ou "Zulu time" (Z).
- Outros fusos são definidos em relação ao GMT/UTC:
  - São Paulo: `GMT-3`
  - Portugal: `GMT+1`
- Tecnologias e linguagens frequentemente usam nomes textuais para timezones, como `"America/Sao_Paulo"`.

---

### ⌨️ Padrão ISO 8601
- **Formato para data-hora local**:
  - `2022-07-21`
  - `2022-07-21T14:52:09`
- **Formato para data-hora global**:
  - `2022-07-23T14:52:09Z` (Indica UTC)
  - `2022-07-23T14:52:09-03:00` (Indica offset de -3 horas)

---

### ⚙️ Operações Comuns (Java 8+)
- **Instanciação**: Criar uma data a partir do momento atual, de um texto (ISO ou customizado) ou de valores específicos (dia, mês, ano).
- **Formatação**: Converter um objeto de data-hora para um formato de texto (ISO ou customizado).
- **Conversão**: Transformar uma data-hora global em local, considerando um timezone.
- **Cálculos**: Realizar operações como somar/subtrair tempo de uma data ou calcular a duração entre duas datas.

---

### ✅ Boa Prática
- **Armazene em UTC, mostre em horário local**: No backend (base de dados, APIs), armazene sempre as datas no padrão UTC. A conversão para o fuso horário do utilizador deve ser feita no frontend ou na camada de visualização.

---

### ☕ Principais Tipos em Java (8+)
- **Data-hora local**:
  - `LocalDate`
  - `LocalDateTime`
- **Data-hora global**:
  - `Instant`
- **Duração**:
  - `Duration`
- **Outros**:
  - `ZoneId`
  - `ChronoUnit`

---
---

##  Legacy Date/Time (Pré-Java 8)

### 🔹 `java.util.Date`
- Representa um instante no tempo, armazenando a quantidade de milissegundos desde 01/01/1970 GMT/UTC.
- É encontrada no pacote `java.util`.

---

### 🔹 `SimpleDateFormat`
- Usado para definir formatos de conversão entre `Date` e `String`.
- **Exemplos de Padrões**:
  - `dd/MM/yyyy` → 23/07/2018
  - `dd/MM/yyyy HH:mm:ss` → 23/07/2018 15:42:07
- Permite fazer o *parse* de uma String para um objeto `Date`.

---

### 🔹 `Calendar`
- Classe utilizada para manipular datas de forma mais complexa.
- **Somar tempo**: É possível adicionar unidades de tempo a uma data.
  - `cal.add(Calendar.HOUR_OF_DAY, 4);` // Adiciona 4 horas
- **Obter unidades**: Permite extrair partes específicas de uma data.
  - `int minutes = cal.get(Calendar.MINUTE);` // Obtém os minutos
  - `int month = 1 + cal.get(Calendar.MONTH);` // Obtém o mês (atenção: janeiro é 0)