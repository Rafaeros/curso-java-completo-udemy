## 🔹 Problema Exemplo (sem OO)
- Ler lados de dois triângulos, calcular áreas e comparar.  
- Fórmula de Heron:  
```
p = (a+b+c)/2
area = sqrt(p*(p-a)*(p-b)*(p-c))
```

---

## 🏗️ Classe Triangle
```java
public class Triangle {
    public double a, b, c;
    public double area() {
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
```
- **Classe** = definição do tipo.  
- **Objeto** = instância da classe.  
- Benefícios: reaproveitamento, delegação de responsabilidades.  

---

## 🛒 Classe Product
```java
public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() { return price * quantity; }
    public void addProducts(int q) { this.quantity += q; }
    public void removeProducts(int q) { this.quantity -= q; }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price)
            + ", " + quantity + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());
    }
}
```
- Usa `toString()` para representar o objeto.  
- Subclasse implícita de `Object`.  

---

## 🧾 Exercícios
1. Classe `Rectangle` → área, perímetro, diagonal.  
2. Classe `Employee` → nome, salário bruto, imposto, aumento.  
3. Classe `Student` → notas, cálculo da nota final e aprovação.  

---

## ⚙️ Membros Estáticos
- Pertencem à classe, não ao objeto.  
- Usados em **constantes** e **funções utilitárias**.  

### V1 – Métodos estáticos no `Program`
### V2 – Classe `Calculator` com instância  
### V3 – Classe `Calculator` com métodos estáticos

```java
public class Calculator {
    public static final double PI = 3.14159;
    public static double circumference(double r) { return 2.0 * PI * r; }
    public static double volume(double r) { return 4.0 * PI * r * r * r / 3.0; }
}
```

---

## 💱 Exercício – CurrencyConverter
```java
public class CurrencyConverter {
    public static double IOF = 0.06;
    public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }
}
```

---

## ✅ Resumo
- Classes organizam atributos e métodos.  
- Objetos são instâncias das classes.  
- Métodos encapsulam lógica e eliminam repetição.  
- `toString` melhora a exibição de objetos.  
- Membros estáticos são usados para **constantes** e **utilitários**.  

---
