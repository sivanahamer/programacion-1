# Arreglos & algoritmos

**Presentaciones:**

- [Arreglos](https://github.com/sivanahamer/programacion-1/blob/main/06-Arreglos/pres/10-Arrays.pdf)

## Colecciones de datos

En nuestras variables anteriores, siempre que queremos guardar algo teniamos que crear una variable para ello. Por ejemplo, dentro de nuestra clase `Pizza` tenemos un atributo que representa un `topping`.

```java
class Pizza { //Esto es la clase 🍕
 
    //Atributos
    //...
    private String topping;
    //...
}
```

Si yo quisiera que la pizza tenga dos toppings, tendría que crear otra variable.

```java
class Pizza { //Esto es la clase 🍕
 
    //Atributos
    //...
    private String topping1;
    private String topping2;
    //...
}
```

De esta manera, tendríamos un `topping1` y un `topping2`. Si siguiéramos agregando una nueva variable para cada nuevo topping, con $n$ toppings en total, nos quedaria el siguiente código.

```java
class Pizza { //Esto es la clase 🍕
 
    //Atributos
    //...
    private String topping1;
    private String topping2;
    private String topping3;
    //...
    private String toppingN;
    //...
}
```

Como podemos ver hay varios problemas:

- El código esta **duplicado**, ya que estamos copiando y pegando la misma definición de la variable $n$ veces. Esto reduce la **mantenibilidad**, dado que si hago un cambio en una variable (por ejemplo el tipo de dato), se tiene que cambiar todo el resto. Si hubiera un defecto en el código, igual se duplicaría en varias partes.
- Es poco **robusto** el código, debido a que solo acepta que se tengan dos toppings. Pero, podría suceder que un usuario quiera menos o más toppings. Por ejemplo, alguien podría pedir una pizza sin nada, una pizza solo con piña, una pizza con tomate y olivas, o una suprema que tiene muchos toppings. Por lo tanto, la cantidad puede variar.

Por lo mismo requerimos **colecciones** de objetos. Existen muchas maneras en que se pueden guardar grupos de objetos en lenguajes de programación, particularmente por medio de distintas **estructuras de datos**. Cada una con sus propiedas. Vamos a iniciar viendo un **arreglo**.

## Arreglo

Un arreglo guarda valores en una secuencia llamados **elementos**. Cada elemento puede ser accedido por medio de un **indice**. La estructura de un arreglo vacío de 3 elementos se ve de la siguiente manera:

![Arreglo vacio](./img/empty.png)

Se puede crear un arreglo al declara una variable con `[]`. Entonces, para utilizar un arreglo de `toppings` modificamos la clase de esta manera.

```java
class Pizza { //Esto es la clase 🍕
 
    //Atributos
    //...
    private String [] toppings;
    //...
}
```

Mientras que cuando instalamos los toppings en algún lado del codigo, se hace así.

```java
//...
toppings = new String [3];
//...
```

Aquí estamos indicando que queremos crear 3 toppings. Para agregar valores a los toppings, tenemos que **acceder** a los elementos por los índices. Para ello, usamos `toppings[i]`, donde $i$ es el indice del arreglo donde queremos agregar el topping. Si agregamos a `"Tomate"`, `"Albahaca"` y `"Olivas negras"` se hace de la siguiente manera.

```java
//...
toppings[0] = "Tomate";
toppings[1] = "Albahaca";
toppings[2] = "Olivas negras";
//...
```

Dado estos accesos, modifcamos el arreglo para que quede de la siguiente manera.

![Pizza elementos](./img/pizza.png)

En un caso que ya sabemos que queremos arreglar desde el inicio, podemos indicarlo por medio de llaves.

```java
//...
toppings = {"Tomate", "Albahaca", "Olivas negras"};
//...
```

Dado que puede variar durante la ejecución del programa el tamaño del arreglo (por ejemplo si un usuario indica el tamaño), no se puede pedir espacio para guardar la variable hasta que esté en ejecución el programa. Por lo tanto, se requiere de **memoria dinámica** que se pide al procesador, que da una **dirección de memoria** donde se van a guardar los elementos del arreglo. Por lo mismo, en la variable del arreglo se guarda la dirección de memoria y no los elementos. Esto se ve de la siguiente manera:

![Memory](./img/memory.png)

Los índices inician desde cero, ya que los arreglos se guardan en posiciones de memoría. Formalmente, los arreglos guardan de valor una dirección de memoria $x$ con elementos de $b$ bytes. Si se quiere acceder al elemento con indice $i$ se utiliza la siguiente formula:

$$ x + b * i$$

Por lo tanto, en el caso de $i=0$, queda solamente la direccion de memoria $x$ . Por lo mismo para no desperdiciar espacio y no tener que realizar operaciones matematematicas inecesarias, el primer elemento se guarda en esta posicion.

> [!NOTE]
> Siempre hay que asegurarse que se accedan a índices adecuadamente, dado que podrían provocar excepciones.

## Matrices

En nuestro ejemplo anterior, solo estamos usando un arreglo de una dimensión. Sin embargo, nuestros arreglos pueden tener varias dimensiones. Generalmente, se utiliza un arreglo de dos dimensiones llamado **matriz**.

Si nosotros en nuestra pizzería queremos tener una matriz booleana que contiene si una mesa se encuentra ocupada, podemos utilizar una matriz. Se puede declarar de la siguiente manera:

```java
class Pizzeria { 
 
    //Atributos
    //...
    private boolean [][] mesasOcupadas;
    //...
}
```

Si se crea que para la pizzería 5x5 mesas, se hace de la siguiente manera:

```java
//...
toppings = new boolean [5][5];
//...
```

<!-- Esto se podría representar como: -->

Para acceder a un elemento de la matriz, se tiene que indicar dos índices. La primera es la *fila*, generalmente representada como una $i$. La segunda que se indica es la columna denominada como $j$.

Si por ejemplo, queremos indicar que la mesa en la fila 2 y columna 4 se encuentra ocupa se haría de la siguiente manera:

```java
//...
mesasOcupadas[1][3] = true;
//...
```

## Algortimos

Para las estructuras de datos, existen algoritmos clásicos. Particularmente, dado que son colecciones de datos, nos interesan dos cosas: la búsqueda de elementos dentro de la colección y ordenar los elementos de una colección.

> [!NOTE]
> Los algoritmos tienen distintas propiedades de tiempo y espacio que se requieren. Dentro de este curso, no vamos a entrar a fondo en este tema pero si es de interés en cursos como estructuras de datos y análisis de algoritmos.

### Búsqueda

<iframe width="560" height="315" src="https://www.youtube-nocookie.com/embed/P3YID7liBug" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

### Ordenamiento

<iframe width="560" height="315" src="https://www.youtube-nocookie.com/embed/Jdtq5uKz-w4" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/GUDLRan2DWM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/i-SKeOcBwko" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

## Ejercicios

Pendiente

## Material suplemental

Se recomienda ver los siguientes materiales para repasar el contenido visto en clases.

### Videos

- [Introducción a arreglos](https://youtu.be/L06uGnF4IpY).
- [Tutorial de arreglos](https://youtu.be/xzjZy-dHHLw).
- [Arreglos en métodos](https://youtu.be/rzXoz2KOP7E).
- [Arreglos de dos dimensiones](https://www.youtube.com/watch?v=L3-q2GxAqZA).

### Lecturas

- Capítulo 7. Object First with Java: A Practical Introduction Using BlueJ. Sexta edición. Pearson. 2017.
- Capítulo 7. Eck, David. Introduction to Programming Using Java. Octava edición. 2015.
- Capítulo 7. Downey, Allen y Mayfield, Chris. Think Java: How to Think Like a Computer Scientist. Segunda edición. O’Reilly Media. 2019.
- Capítulo 2. Morin, P. (2013). Open Data Structures (in Java).
