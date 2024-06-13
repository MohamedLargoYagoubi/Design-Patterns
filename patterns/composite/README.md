<p align="center">
  <img width=100% src="https://github.com/MohamedLargoYagoubi/Design-Patterns/blob/main/media/banner.gif" /> 
</p>

<h1 align="center">COMPOSITE</h1>

<div align="center">
  <b>
    Permite componer objetos en estructura de árbol y tratar de manera uniforme tanto a los objetos individuales como a los compuestos.
  </b>
</div>

<hr />

# 1. IMPLEMENTACIÓN

## 1.1 - Diagrama UML

```mermaid
classDiagram


class Component{
    +operation()
}

class Leaf{
    +operation()
}

class Composite{
    +operation()
    +add(Component)
}

Component <|-- Leaf
Component <|-- Composite

Composite o--> "*" Component


```

## 1.2 - Explicación 

> Component.java


### Paso 1
Definimos la clase **abstracta y pública** llamada 'Component' con sus respectivos métodos:
```java
public abstract class Component {
    //...
}
```

### Paso 2
Definimos la clase **abstracta y pública** llamada 'Component' con sus respectivos métodos:
```java
public abstract class Component {
    public String price();
}
```

> ConcreteProductA.java

> ConcreteProductB.java

> ConcreteProductC.java

### Paso 2
Hacemos que cada producto concreto implemente la interface anterior y su respectivo método:
```java
public class ConcreteProductA implements Product{
    @Override
    public String price(){
      return new String("10€");
    }
}
```
```java
public class ConcreteProductB implements Product{
    @Override
    public String price(){
      return new String("5€");
    }
}
```
```java
public class ConcreteProductC implements Product{
    @Override
    public String price(){
      return new String("20€");
    }
}
```

> Factory.java

### Paso 3
Definimos una clase **pública y abstracta** llamada `Factory`:
```java
public abstract class Factory{
    // ...
}
```

### Paso 4
Definimos un método **público y abstracto** llamado `factoryMethod()` y nos aseguramos que devuelva una instancia de la interface común `Product`:
```java
public abstract class Factory{
    public abstract Product factoryMethod();
}
```

> FactoryA.java

> FactoryB.javA

> FactoryC.java

### Paso 5
Para cada producto concreto creamos su respectiva factoría y que heredará de la `Factory` principal. Devolveremos una intancia de cada producto concreto, teniendo en cuenta que su tipo será el de la interface.
```java
public class FactoryA extends Factory{
    @Override
    public Product factoryMethod() {
      return new ConcreteProductA();
    }
}
```
```java
public class FactoryB extends Factory{
    @Override
    public Product factoryMethod() {
      return new ConcreteProductB();
    }
}
```
```java
public class FactoryC extends Factory{
    @Override
    public Product factoryMethod() {
      return new ConcreteProductC();
    }
}
```

## 1.3 - Utilización
> Main.java
```java
public class Main {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product productA = factory.factoryMethod();

        Factory factory = new FactoryB();
        Product productB = factory.factoryMethod();

        Factory factory = new FactoryC();
        Product productC = factory.factoryMethod();
    }
}
```



