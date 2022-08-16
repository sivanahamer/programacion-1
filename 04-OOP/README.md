# Programación orientada a objetos

**Presentaciones:**

- [Métodos](https://github.com/sivanahamer/programacion-1/blob/main/04-OOP/pres/06-Methods.pdf)
- [Programación orientada a objetos](https://github.com/sivanahamer/programacion-1/blob/main/04-OOP/pres/07-OOP.pdf)

**Asignación:** Ver en [mediación](https://mv1.mediacionvirtual.ucr.ac.cr/mod/assign/view.php?id=1768907).

En la vida real existen distintos **paradigmas** educativos, como lo es una clase magistral contra lo que es un aula invertida. Igualmente, al programar existen distintos paradigmas de computación, que son maneras de pensar cómo se puede resolver un problema. Particularmente, vamos a utilizar dentro de este curso el **paradigma orientado a objetos** (OOP o POO [en espanol]) donde todo lo que vamos a crear se van a llamar **clases**.

En OOP existe un concepto que es sumamente importante, la diferencia entre una **clase** y un **objeto**. Una clase indica cómo se va a construir un objeto, mientras que un objeto es una instancia particular de una clase. La definición es media recursiva, pero aclaremoslo dentro de un ejemplo. Podríamos tener una clase llamada `Pizza` mientras que para esa clase Pizza se pueden tener varias instancias. Por ejemplo, podríamos tener una pizza margarita que comimos hace dos semanas y a la vez varias pizzas peperonis. Todas estas son parte de la misma clase, pero son distintos objetos. Podemos ver como se representa esto dentro del código.

```java
class Pizza { //Esto es la clase 🍕
    //Atributos ...
    //Constructor ...
    //Metodos ...
}
 
//En Main.java...
class Main{
    public static void main(String [] args){
        //Cada una de las siguientes lineas es una instancia distinta
        Pizza margarita2Semanas = new Pizza("tomate", 8, false);
        Pizza peperroni2Semanas = new Pizza("peperroni", 12, true);
        Pizza peperroni1Semana = new Pizza("peperroni", 16, false);
    }
}
```

> [!NOTE]
> Es necesario poner `new` al crear el objeto ya que esto indica que vamos a crear algo en memoria dinámica. Vamos a ver que es esto en detalle más adelante en el curso.

Cada objeto tiene tres componentes principales:

### Atributos

Lo que **guarda** el objeto en variables. Son sustantivos. Por ejemplo, para nuestra clase Pizza podríamos tener de atributos un `topping`, `cantidadTajadas`, `estaCocinado`, y `tieneQuesoEnCorteza`.

```java
class Pizza { //Esto es la clase 🍕
 
    //Atributos
    private String topping;
    private int cantidadTajadas;
    private boolean estaCocinado;
    private boolean tieneQuesoEnCorteza;
 
    //Constructor...
    //Metodos...
}
```

> [!NOTE]
> Los atributos se guardan para cada objeto. Es decir, los atributos que tiene `margarita2Semanas` son solo de esta instancia.

Como se puede notar, la manera en que se crea un atributo es igual que cuando se declara una variable. La diferencia más grande es que puede tener palabras claves antes que detallan más sobre el atributo. Particularmente, el **modificador de acceso** determina quienes pueden acceder a ciertos atributos, clases, constructores y métodos. Existen tres tipos:

- **public:** Cualquiera puede acceder al elemento.
- **private:** Solo la instancia en particular puede acceder a sus elementos. Si no se pone un modificador de acceso para se toma este por defecto.
- **protected:** Puede acceder a estos elementos la instancia con las clases que la heredan. Este tipo no lo vamos a ver a fondo como en este curso no vemos herencia.

Para atributos, es buena práctica poner los atributos privados para que no se pueda obtener o modificar datos que no se deberían. Por ejemplo, imagínese si un tercero modifica que mi Pizza ya no es de pepperoni es un problema de seguridad (además de arruinar el día de la persona por cambiarle la pizza :c). Si se ocupan acceder, se puede realizar por medio de un método *getter* o *setter* (usar ambos no es la mejor práctica ya que es lo mismo que hacerlo público).

### Constructor

Esto **instancia** de la clase. Es decir, es el encargado de guardar y correr todo lo que se ocupa para que un objeto Pizza sea una Pizza.

```java
class Pizza { //Esto es la clase 🍕
 
    //Atributos...
 
    //Constructor
    /**
    * Crea una pizza con su información básica
    * @param topping El topping de la Pizza
    * @param cantidadTajadas La cantidad de tajadas en que se va a cortar la pizza
    * @param tieneQuesoEnCorteza Un booleano que indica si tiene o no queso en la corteza de la pizza
    */
    public Pizza(String topping, int cantidadTajadas, boolean tieneQuesoEnCorteza){
        this.topping = topping;
        this.cantidadTajadas = cantidadTajadas;
        this.tieneQuesoEnCorteza = tieneQuesoEnCorteza;
        this.estaCocinado = false;
    }
 
    //Metodos...
}
```

- El constructor es un método especial que no devuelve ningún tipo de dato. Para más información ver sobre métodos.
- No todos los atributos se tienen que recibir por parámetro en el constructor. De vez en cuando, hay valores por defecto como en el caso de `estaCocinado`.
- `this` hace referencia a los atributos e instancias del objeto a la hora en que se ejecuta el código. Sirve para ocasiones como esta que se tienen dos toppings: una que se recibe de parámetro `topping` y otra que hace referencia al atributo `this.topping`. Si bien ambos se llaman `topping` son dos variables distintas, con la segunda siendo un atributo de la clase.
- Siempre hay un constructor público para que se pueda crear un objeto.
- Algunos lenguajes de programación dejan tener varios constructores con diferentes parámetros.

### Métodos

Los métodos son **acciones que puede realizar** un objeto de una clase. Por ende, son verbos que por convencion se escriben en [infinitivo](https://espanol.lingolia.com/es/gramatica/verbos/infinitivo#:~:text=El%20infinitivo%20en%20espa%C3%B1ol%20tiene,que%20te%20presentamos%20a%20continuaci%C3%B3n.). Por ejemplo, para una pizza podemos pensar en la acción de `cocinar`, `setCantidadTajadas` o `getTopping`.

```java
class Pizza { //Esto es la clase
 
    //Atributos...
    //Constructor...
 
    //Metodos...
 
    /**
    * Cocina la pizza
    */
    public void cocinar(){
        //Asumimos que no se cocina una pizza ya cocinada, aunque podría pasar :c
        this.estaCocinado = true;
    }
 
    /**
    * Actualiza la cantidad de tajadas de pizza
    * @param cantidadTajadas La cantidad de tajadas en que se va a cortar la pizza
    */
    public void setCantidadTajadas(int cantidadTajadas){
        this.cantidadTajadas = cantidadTajadas;
    }
 
    /**
    * Obtiene el topping de la pizza
    * @return topping El topping de la Pizza
    */
    public String getTopping(){
        return this.topping;
    }
}
```

- A las clases se les detalla su modificador de acceso, para indicar quienes pueden invocar ciertos métodos.
- Luego, indica el **tipo de dato** que retorna que puede ser un tipo de dato normal, una clase o *void*. En el caso de *void*, lo que indica es que no va a retornar ningún tipo de dato.
- Después de esto, va el nombre que se escribe como verbo infinitivo.
- Por último en la cabecera, se detallan los **parametros** que son las variables con su tipo de dato que recibe el método. Los parámetros se detallan entre paréntesis y se pueden utilizar dentro del método. Cuando se invoca el método y se pasan los parámetros, estos se llaman **argumentos**.
- Dentro del cuerpo del método, si tiene un tipo de dato no void se debe retorna un objeto de ese tipo de dato mediante un **return**.
- Un método que se encarga de modificar una= atributo se llama un **setter** como `setCantidadTajadas`. Un método que se encarga de devolver un atributo se llama un **getter** como `getTopping`. Se ocupan métodos ya que los atributos son privados.

Todo el código de la clase `Pizza` se ve en el siguiente *snippet*.

```java
class Pizza { //Esto es la clase 🍕
 
    //Atributos
    private String topping;
    private int cantidadTajadas;
    private boolean estaCocinado;
    private boolean tieneQuesoEnCorteza;
   
    //Constructor
    /**
    * Crea una pizza con su información básica
    * @param topping El topping de la Pizza
    * @param cantidadTajadas La cantidad de tajadas en que se va a cortar la pizza
    * @param tieneQuesoEnCorteza Un booleano que indica si tiene o no queso en la corteza de la pizza
    */
    public Pizza(String topping, int cantidadTajadas, boolean tieneQuesoEnCorteza){
        this.topping = topping;
        this.cantidadTajadas = cantidadTajadas;
        this.tieneQuesoEnCorteza = tieneQuesoEnCorteza;
        this.estaCocinado = false;
    }
 
    //Metodos
    /**
    * Cocina la pizza
    */
    public void cocinar(){
        //Asumimos que no se cocina una pizza ya cocinada, aunque podría pasar :c
        this.estaCocinado = true;
    }
 
    /**
    * Actualiza la cantidad de tajadas de pizza
    * @param cantidadTajadas La cantidad de tajadas en que se va a cortar la pizza
    */
    public void setCantidadTajadas(int cantidadTajadas){
        this.cantidadTajadas = cantidadTajadas;
    }
 
    /**
    * Obtiene el topping de la pizza
    * @return topping El topping de la Pizza
    */
    public String getTopping(){
        return this.topping;
    }
}
```

### Interacción entre clases

El propósito del paradigma orientado a objetos es que exista cierta interacción entre muchas clases. Por ejemplo, imagínese si existe una clase llamada `Pizzeria` que maneja todo lo relacionado a una pizzería. Podría tener dentro de la clase Pizzeria un método llamado `ordenarPizza` que crea una pizza, se encarga de manipularla para consumición y la devuelve para entregar la orden.

```java
class Pizzeria {
    //...
    //Metodos...
 
    /**
    * Se encarga de ordenar una pizza
    * @param topping El topping de la Pizza
    * @param cantidadTajadas La cantidad de tajadas en que se va a cortar la pizza
    * @param tieneQuesoEnCorteza Un booleano que indica si tiene o no queso en la corteza de la pizza
    * @return La pizza que se ordenó
    */
    public Pizza ordenarPizza(String topping, int cantidadTajadas, boolean tieneQuesoEnCorteza){
        //Primero creamos la pizza que se va a ordenar
        Pizza pizza = new Pizza(topping, cantidadTajadas, tieneQuesoEnCorteza);
 
        //Tenemos que cocinar la pizza antes de dar la orden
        //Si no, podrian pasar problemas 🤢
        pizza.cocinar();
 
        //Devolvemos la pizza que se ordenó
        return pizza;
    }
 
    //...
}
```

Como se puede ver, se puede entonces utilizar clases con otras clases para modelar comportamiento más complejo. Inclusive, existen **patrones de programación** que indican cómo delegar estas responsabilidades. Por ejemplo, dentro del patrón Modelo Vista Controlador (MVC) se tienen distintas clases que se encargan de modelar la lógica de negocio (modelo), visualizar los datos (vista) y encargarse de la lógica entre ellas (controlador).

## Ejercicios

Pendiente

## Material suplemental

Se recomienda ver los siguientes materiales para repasar el contenido visto en clases.

### Videos

- [Métodos](https://www.youtube.com/watch?v=4yIa6q2QIj0).
- [Progrmación orientada a objetos](https://www.youtube.com/watch?v=ZPrjMDE2guo).
- [Clase Circle](https://www.youtube.com/watch?v=5nvrBzfu1vo).
- [Clase Dice](https://www.youtube.com/watch?v=NXMwLaDN03Q).
- [Clase AgregadorEnlace](https://www.youtube.com/watch?v=YlN1P_gy35Q).
- [Clase Point](https://www.youtube.com/watch?v=NRaVleByQHw).
- [Clase RectanglePoint](https://www.youtube.com/watch?v=NRaVleByQHw).
- [Clase Complejos](https://www.youtube.com/watch?v=q6ryJlnjfZA).

### Lecturas

- Capítulo 1 y 2. Barnes, David y Kolling, Michael. Object First with Java: A Practical Introduction Using BlueJ. Sexta edición. Pearson. 2017.
- Capítulo 5. Eck, David. Introduction to Programming Using Java. Octava edición. 2015.
- Capítulo 11. Downey, Allen y Mayfield, Chris. Think Java: How to Think Like a Computer Scientist. Segunda edición. O’Reilly Media. 2019.
