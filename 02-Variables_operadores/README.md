# Variables y operadores

**Presentaciones:**

- [Variables y tipos de datos](https://github.com/sivanahamer/programacion-1/blob/main/02-Variables_operadores/pres/03-Var.pdf)
- [Operadores](https://github.com/sivanahamer/programacion-1/blob/main/02-Variables_operadores/pres/04-Op.pdf)

**Asignación:** Ver en [mediación](https://mv1.mediacionvirtual.ucr.ac.cr/mod/assign/view.php?id=1768907).

> [!ATTENTION]
> Para iniciar a practicar este tema debe haber terminado de realizar la configuración del laboratorio 1. Todos los temas de aquí en adelante son acumulativos y requiere de que comprendan los temas anteriores. Ante cualquier duda, lo mejor es evacuar lo que no entienden lo antes posible 😁.

Para programar, ocupamos guardar toda la información que vamos a utilizar en algún lado llamado una **variable**. Por ejemplo, podemos tener una variable que guarde la cantidad de pedazos de una pizza que hemos comido llamada `tajadasComidas`.

En lenguajes de programación existen distintas convenciones con respecto a variables.

1. Son **sustantivos**. Ejemplos de sustantivos son `perros`, `cantidadOjos` o `nombre`.
2. Tienen **nombres significativos**. Esto significa que, basado en el **nombre** que tiene una variable se puede entender lo que está guardando. En nuestro ejemplo anterior, es un nombre más significativo `tajadasComidas` que `tc`.
3. Existen dos convenciones populares para dar nombres de variables. La primera se llama **camelCase** dado que se ponen las palabras juntas, con todas excepto la primera iniciando en mayúsculas para representar los espacios como un camello (e.g., `tajadasComidas`). La otra convención se llama **snake_case** donde se juntan las palabras por medio de _ y se pone todas las palabras en minúscula (e.g., `tajadas_comidas`). En Java, se utiliza la convención de **camelCase** que vamos a seguir.
4. Es una práctica frecuente escribir nombres de variables con los caracteres del alfabeto inglés dado que dependiendo la máquina y compilador, podrían darse problemas. Nosotros vamos a seguir esta práctica de solo utilizar caracteres [ASCII](https://www.asciitable.com/).
5. Igualmente, es común utilizar ingles en programas dado que es la *lingua franca* (lenguaje por defecto) de programar. En este curso, se podrá utilizar ingles, español o *spanglish*.

> [!NOTE]
> Es importante seguir las convenciones de nombres ya que son **buenas prácticas de programación** que ayudan con la **legibilidad** de los programas.

Las variables guardan distintos datos dependiendo su **tipo de datos**. Por ejemplo, en `tajadasComidas` el tipo de dato es un **entero** asumiendo que solo estamos comiendo toda una tajada de pizza o ninguna. Aunque, también podríamos decir que es un **flotante** si alguien come tres tajadas y media (3.5). Decidir el tipo de representación depende del problema que estamos resolviendo y lo que ocupamos guardar.
Otros tipos de datos relevantes son **boleanos** que guarda `True` o `False`. Se puede utilizar para representar si alguien comió o no tajadas con una variable de `comioTajadas`. Otro tipo de dato son **caracteres o strings (cadenas de caracteres)** que guardan información textual. Un ejemplo sería guardar en una variable string el `tipoPizza` que podría ser `"pepperoni"`, `"margarita"`, o `"hawaiana"`.

El **valor** de una variable es lo que guarda la variable. Por ejemplo, `tajadasComidas` puede guardar un valor de `3` para representar que se consumió tres tajadas de pizza. Este valor se asigna y modifica durante la ejecución de un programa.

Podemos **inicializar** la variable `tajadasComidas` con un tipo de datos entero y un valor inicial de $3$ de la siguiente manera.

```java
int tajadasComidas = 3;
```

> [!NOTE]
> En Java, siempre que escribimos una línea de código debe terminar con `;`.

Si queremos crear una variable sin asignar un valor, estaríamos **declarandola**. Esto se puede hacer de la siguiente manera.

```java
int tajadasComidas;
```

En cambio si ya existe una variable, podemos modificar el valor que tiene al **asignar** un nuevo valor. Por ejemplo, podemos asignar un nuevo valor de $4$ en la variable de tajadasComidas.

```java
tajadasComidas = 4;
```

Por medio de variables, podemos utilizarlas para realizar distintas operaciones con **operadores**. Por ejemplo con operadores, podríamos sumar uno  en `tajadasComidas` para representar que alguien comió una tajada más.

```java
tajadasComidas += 1;
```

Se puede representar lo mismo con el operador `++`.

```java
tajadasComidas++;
```

Los tipos de operadores son:

- **Aritméticos:** Realizan operaciones matemáticas.

```java
tajadasComidas = 2 * 1 + 3;
```

- **Relacionales:** Comparan la relación entre dos valores.

```java
//Se compara que hay mayor o igual de cuatro tajadas
//Devuelve un true si es mayor o igual a 4 y false en el caso contrario
tajadasComidas >= 4;
```

- **Lógicos:** Realizan operaciones booleanas.

```java
//Se revisa si se come entre menos de 10 tajadas y mayor o igual a 4 tajadas
(tajadasComidas < 10) && (tajadasComidas >= 4)
```

- **Asignación:** Guarda un valor dentro de una variable.

```java
tajadasComidas = 5;
```

> [!NOTE]
> Todos los ejemplos que utiliza el operador `=` de asignación realizan esta operación.

## Ejercicios

### Velocidad 💨

#### Requerimientos

Se tienen que responder preguntas como:

¿Cómo se calcula la velocidad?
> Respuesta: Velocidad es igual a distancia entre tiempo
- ¿En qué medidas está la distancia y tiempo?
> Respuesta: Distancias en metros y tiempo en segundos

#### Diseño

Se hace un diseño en pseudocódigo de los pasos del problema.

```pseudocode
obtener la distancia y el tiempo
calcular la velocidad
imprimir resultado
```

[velocidadMain](https://github.com/sivanahamer/programacion-1/blob/main/02-Variables_operadores/src/velocidad/Velocidad.java ':include :type=code text')


#### Implementación

#### Pruebas

Se prueba introducir valores de:

- $d=12$, $t=2$ con resultado $v=6$.
- $d=8$, $t=3$ con resultado $v=2.667$.
- $d=10$, $t=2$ con resultado $v=2.5$.
- $d=12$, $t=0$ da un error de ejecución.

> [!NOTE]
> Para arreglar este error, ocupamos utilizar condicionales o excepciones que veremos mas adelante.

## Material suplemental

Se recomienda ver los siguientes materiales para repasar el contenido visto en clases.

### Videos

1. [Variables](https://youtu.be/gtQJXzi3Yns).
2. [Variables y tipos de dato](https://youtu.be/qUXbJziVs_o).
3. [Operadores matemáticos](https://youtu.be/5DdacOkrTgo).
4. [Operadores de incremento](https://youtu.be/ydcTx6idTs0).
5. [Operadores lógicos](https://youtu.be/PAaqgTr7Cx4).
6. [Operadores condicionales](https://youtu.be/Y6NheSwTsDs).

### Lecturas

1. Capítulo 2 . Eck, David. Introduction to Programming Using Java. Octava edición. 2015.
2. Capítulo 2. Downey, Allen y Mayfield, Chris. Think Java: How to Think Like a Computer Scientist. Segunda edición. O'Reilly Media. 2019.
